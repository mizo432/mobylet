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
package org.mobylet.core.initializer.impl;

import org.mobylet.core.analytics.impl.GoogleAnalyticsConfig;
import org.mobylet.core.analytics.impl.GoogleAnalyticsExecutor;
import org.mobylet.core.analytics.impl.GoogleAnalyticsHelper;
import org.mobylet.core.analytics.impl.GoogleAnalyticsSessionManager;
import org.mobylet.core.config.MobyletSessionConfig;
import org.mobylet.core.define.DefProperties;
import org.mobylet.core.detector.impl.MobyletCarrierDetector;
import org.mobylet.core.device.impl.MobyletDevicePool;
import org.mobylet.core.device.impl.ValueEngineDeviceReader;
import org.mobylet.core.dialect.impl.DefaultDialect;
import org.mobylet.core.dialect.impl.MobyletAuDialect;
import org.mobylet.core.dialect.impl.MobyletDocomoDialect;
import org.mobylet.core.dialect.impl.MobyletSoftbankDialect;
import org.mobylet.core.emoji.EmojiPoolFamily;
import org.mobylet.core.emoji.impl.MobyletEmojiPoolFamily;
import org.mobylet.core.emoji.impl.MobyletEmojiPoolReader;
import org.mobylet.core.gps.impl.MobyletGeoConverter;
import org.mobylet.core.holder.impl.MobyletHolderImpl;
import org.mobylet.core.holder.impl.MobyletRequestHolder;
import org.mobylet.core.holder.impl.MobyletSessionHolder;
import org.mobylet.core.image.ImageConfig;
import org.mobylet.core.image.impl.MobyletImageCacheHelper;
import org.mobylet.core.image.impl.MobyletImageMagickScaler;
import org.mobylet.core.image.impl.MobyletImageReader;
import org.mobylet.core.image.impl.MobyletImageScaler;
import org.mobylet.core.ip.impl.IpTextReaderImpl;
import org.mobylet.core.selector.impl.MobyletCharsetSelector;
import org.mobylet.core.selector.impl.MobyletDialectSelector;
import org.mobylet.core.session.impl.MobyletMultiSessionManager;
import org.mobylet.core.util.SingletonUtils;
import org.mobylet.view.css.CSSParser;
import org.mobylet.view.xhtml.XhtmlParser;

public class MobyletInitializerImpl
	extends MobyletInitializerEmptyImpl implements DefProperties {

	@Override
	public void initialize() {
		//RequestHolder
		SingletonUtils.put(new MobyletRequestHolder());
		SingletonUtils.put(new MobyletHolderImpl());
		//Session
		SingletonUtils.put(new MobyletSessionConfig());
		SingletonUtils.put(new MobyletSessionHolder());
		SingletonUtils.put(new MobyletMultiSessionManager());
		//CharsetSelector
		SingletonUtils.put(new MobyletCharsetSelector());
		//Ip
		SingletonUtils.put(new IpTextReaderImpl());
		//Dialect
		SingletonUtils.put(new MobyletDialectSelector());
		SingletonUtils.put(new MobyletDocomoDialect());
		SingletonUtils.put(new MobyletAuDialect());
		SingletonUtils.put(new MobyletSoftbankDialect());
		SingletonUtils.put(new DefaultDialect());
		//CarrierDetector
		SingletonUtils.put(new MobyletCarrierDetector());
		//EmojiPool
		SingletonUtils.put(new MobyletEmojiPoolReader());
		SingletonUtils.put(new MobyletEmojiPoolFamily());
		SingletonUtils.get(EmojiPoolFamily.class).initialize();
		//Device
		SingletonUtils.put(new ValueEngineDeviceReader());
		SingletonUtils.put(new MobyletDevicePool());
		//Gps
		SingletonUtils.put(new MobyletGeoConverter());
		//Image
		ImageConfig imageConfig = new ImageConfig();
		SingletonUtils.put(imageConfig);
		if (imageConfig.useImageMagick()) {
			SingletonUtils.put(new MobyletImageMagickScaler());
		} else {
			SingletonUtils.put(new MobyletImageScaler());
		}
		SingletonUtils.put(new MobyletImageReader());
		SingletonUtils.put(new MobyletImageCacheHelper());
		//Analytics
		SingletonUtils.put(new GoogleAnalyticsConfig());
		SingletonUtils.put(new GoogleAnalyticsSessionManager());
		SingletonUtils.put(new GoogleAnalyticsHelper());
		SingletonUtils.put(new GoogleAnalyticsExecutor());
		//CSSParser
		SingletonUtils.put(new CSSParser());
		SingletonUtils.put(new XhtmlParser());
		//initialized
		super.initialize();
	}
}
