/*
 * Copyright 2004-2011 the Seasar Foundation and the Others.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package org.mobylet.view.designer;

import org.mobylet.core.Carrier;
import org.mobylet.core.Mobylet;
import org.mobylet.core.MobyletFactory;
import org.mobylet.core.type.ContentType;
import org.mobylet.core.util.StringUtils;
import org.mobylet.core.util.UrlUtils;
import org.mobylet.view.config.TransitionConfig;
import org.mobylet.view.design.GpsDesign;
import org.mobylet.view.xhtml.TagAttribute;

public class GpsDesigner extends TransitionDesigner {


	public GpsDesign getGpsDesign(String kickBackUrl) {
		return getGpsDesign(kickBackUrl, null);
	}

	public GpsDesign getGpsDesign(String kickBackUrl, TransitionConfig config) {
		Mobylet m = MobyletFactory.getInstance();
		if (m.getCarrier() == Carrier.OTHER) {
			return null;
		}
		GpsDesign gpsDesign = null;
		//GPS情報取得URL
		if (StringUtils.isNotEmpty(kickBackUrl) &&
				m.getDevice() != null &&
				m.getDevice().hasGps()) {
			gpsDesign = new GpsDesign(getGpsUrl(kickBackUrl, config));
			if (m.getCarrier() == Carrier.DOCOMO) {
				if (m.getContentType() == ContentType.XHTML) {
					gpsDesign.setTagAttribute(new TagAttribute("lcs", "lcs"));
				} else {
					gpsDesign.setTagAttribute(new TagAttribute("lcs", null));
				}
			}
		}
		//簡易位置取得URL
		else if (StringUtils.isNotEmpty(kickBackUrl)) {
			gpsDesign = new GpsDesign(getEasyGpsUrl(kickBackUrl));
		}
		return gpsDesign;
	}


	protected String getGpsUrl(String url, TransitionConfig config) {
		url = config != null ?
				constructUrl(url, config) :
					constructUrl(url);
		switch (MobyletFactory.getInstance().getCarrier()) {
		case DOCOMO:
			return UrlUtils.getAbsoluteUrl(url);
		case AU:
			url = url + UrlUtils.AMP + "ver=1&datum=0&unit=0&acry=0&number=0";
			return "device:gpsone?url=" + UrlUtils.getAbsoluteUrl(url).replace('?', '&');
		case SOFTBANK:
			return "location:gps?url=" + UrlUtils.getAbsoluteUrl(url).replace('?', '&');
		}
		return "";
	}

	protected String getEasyGpsUrl(String url) {
		url = constructUrl(url);
		switch (MobyletFactory.getInstance().getCarrier()) {
		case DOCOMO:
			return "http://w1m.docomo.ne.jp/cp/iarea?" +
				"ecode=OPENAREACODE&msn=OPENAREAKEY&posinfo=1" +
				"&nl=" + UrlUtils.encodeIAreaUrl(url);
		case AU:
			return "device:location?url=" + UrlUtils.getAbsoluteUrl(url).replace('?', '&');
		case SOFTBANK:
			return "location:auto?url=" + UrlUtils.getAbsoluteUrl(url).replace('?', '&');
		}
		return "";
	}
}
