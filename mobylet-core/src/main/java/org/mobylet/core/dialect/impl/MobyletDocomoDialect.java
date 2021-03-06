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
package org.mobylet.core.dialect.impl;

import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;

import org.mobylet.core.Carrier;
import org.mobylet.core.define.DefCharset;
import org.mobylet.core.device.DeviceDisplay;
import org.mobylet.core.gps.Accuracy;
import org.mobylet.core.gps.Geo;
import org.mobylet.core.gps.Gps;
import org.mobylet.core.util.RequestUtils;
import org.mobylet.core.util.StringUtils;


public class MobyletDocomoDialect extends AbstractDialect {

	private static final Pattern REGEX_CARRIER_MATCH =
		Pattern.compile("^DoCoMo.+");

	private static final Pattern REGEX_DEVICE_MATCH =
		Pattern.compile("^DoCoMo/[0-9.]+[/ ]{1}[0-9a-zA-Z_+]+");


	@Override
	public Carrier getCarrier() {
		return Carrier.DOCOMO;
	}

	@Override
	public Pattern getCarrierMatchRegex() {
		return REGEX_CARRIER_MATCH;
	}

	@Override
	public Pattern getDeviceMatchRegex() {
		return REGEX_DEVICE_MATCH;
	}

	@Override
	public String getContentCharsetName() {
		if (charsetSelector.isCharsetInstalled()) {
			return DefCharset.SJIS;
		} else {
			return getCharsetName();
		}
	}

	@Override
	public String getUid() {
		String uid = RequestUtils.get().getParameter("uid");
		if (StringUtils.isNotEmpty(uid) &&
				uid.length() == 12) {
			return uid;
		} else {
			return null;
		}
	}

	@Override
	public String getGuid() {
		HttpServletRequest request = RequestUtils.get();
		String guid = request.getHeader("X-DCMGUID");
		if (StringUtils.isEmpty(guid) && request.isSecure()) {
			guid = request.getParameter("guid");
			if ("on".equalsIgnoreCase(guid)) {
				return null;
			}
		}
		return guid;
	}

	@Override
	public Gps getGps() {
		HttpServletRequest request = RequestUtils.get();
		String lat = request.getParameter("lat");
		String lon = null;
		String geoString = null;
		String accString = null;
		if (StringUtils.isEmpty(lat)) {
			lat = request.getParameter("LAT");
			if (StringUtils.isNotEmpty(lat)) {
				lon = request.getParameter("LON");
				geoString = request.getParameter("GEO");
				accString = request.getParameter("XACC");
			}
		} else {
			lon = request.getParameter("lon");
			geoString = request.getParameter("geo");
			accString = request.getParameter("xacc");
		}
		if (StringUtils.isEmpty(lat) ||
				StringUtils.isEmpty(lon) ||
				StringUtils.isEmpty(geoString)) {
			return null;
		}
		//Geo
		geoString = Geo.WGS84.name();
		Geo geo = Geo.valueOf(geoString.toUpperCase());
		//Gps
		Gps g = new Gps(lat, lon, geo);
		//Accuracy
		if (StringUtils.isNotEmpty(accString)) {
			Accuracy acc = Accuracy.getAccuracy(Integer.parseInt(accString));
			g.setAccuracy(acc);
		}
		return g;
	}

	@Override
	public DeviceDisplay getDeviceDisplayByRequestHeader() {
		return null;
	}

}
