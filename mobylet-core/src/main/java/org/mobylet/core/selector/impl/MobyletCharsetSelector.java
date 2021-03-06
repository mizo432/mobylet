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
package org.mobylet.core.selector.impl;

import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;

import org.mobylet.charset.MobyletCharsetPool;
import org.mobylet.core.Carrier;
import org.mobylet.core.define.DefCharset;
import org.mobylet.core.log.MobyletLogger;
import org.mobylet.core.selector.CharsetSelector;
import org.mobylet.core.util.SingletonUtils;

public class MobyletCharsetSelector implements CharsetSelector {

	protected boolean isCharsetInstalled = false;

	protected boolean isCharsetNativeInstalled = false;

	protected Map<Carrier, Charset> charsetMap;


	public MobyletCharsetSelector() {
		initialize();
	}

	@Override
	public Charset getCharset(Carrier carrier) {
		if (isCharsetInstalled) {
			return charsetMap.get(carrier);
		} else {
			return charsetMap.get(Carrier.OTHER);
		}
	}

	@Override
	public String getCharacterEncodingCharsetName(Carrier carrier) {
		if (isCharsetNativeInstalled) {
			return getCharsetName(carrier);
		} else {
			switch(carrier) {
			case DOCOMO:
			case AU:
				return DefCharset.WIN31J;
			default:
				return getCharsetName(carrier);
			}
		}
	}

	@Override
	public String getCharsetName(Carrier carrier) {
		return getCharset(carrier).name();
	}

	@Override
	public boolean isCharsetInstalled() {
		return isCharsetInstalled;
	}

	protected void initialize() {
		charsetMap = new HashMap<Carrier, Charset>();
		Charset defCharset = SingletonUtils.get(Charset.class);
		if (defCharset == null) {
			defCharset = Charset.forName(DefCharset.WIN31J);
		}
		charsetMap.put(Carrier.OTHER, defCharset);
		try {
			charsetMap.put(Carrier.DOCOMO,
					MobyletCharsetPool.getInstance().charsetForName(DefCharset.DOCOMO));
			charsetMap.put(Carrier.AU,
					MobyletCharsetPool.getInstance().charsetForName(DefCharset.AU));
			charsetMap.put(Carrier.SOFTBANK,
					Charset.forName(DefCharset.UTF8));
			MobyletLogger logger = SingletonUtils.get(MobyletLogger.class);
			if (logger != null && logger.isLoggable())
				logger.log("[mobylet] mobylet-charsetがインストールされました");
			isCharsetInstalled = true;
		} catch (Throwable t) {
			MobyletLogger logger = SingletonUtils.get(MobyletLogger.class);
			if (logger != null && logger.isLoggable())
				logger.log("[mobylet] mobylet-charsetが見つかりません");
			isCharsetInstalled = false;
		}
		//NativeInstallCheck
		try {
			Charset.forName(DefCharset.DOCOMO);
			Charset.forName(DefCharset.AU);
			MobyletLogger logger = SingletonUtils.get(MobyletLogger.class);
			if (logger != null && logger.isLoggable())
				logger.log("[mobylet] mobylet-charsetはEXTDIRにインストールされています");
			isCharsetNativeInstalled = true;
		} catch (Throwable t) {
			isCharsetNativeInstalled = false;
		}
	}

}
