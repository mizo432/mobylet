package org.mobylet.core.dialect.impl;

import java.nio.charset.Charset;

import org.mobylet.core.define.DefCharset;
import org.mobylet.core.dialect.MobyletDialect;
import org.mobylet.core.selector.CharsetSelector;
import org.mobylet.core.util.SingletonUtils;
import org.mobylet.core.util.StringUtils;

public abstract class AbstractDialect implements MobyletDialect {

	protected CharsetSelector charsetSelector;

	protected String contentTypeString = null;

	protected String xContentTypeString = null;


	protected AbstractDialect() {
		charsetSelector = SingletonUtils.get(CharsetSelector.class);
	}

	@Override
	public String getCharsetName() {
		return SingletonUtils.get(CharsetSelector.class).getCharsetName(getCarrier());
	}

	@Override
	public Charset getCharset() {
		return SingletonUtils.get(CharsetSelector.class).getCharset(getCarrier());
	}

	@Override
	public String getContentCharsetName() {
		return getCharsetName();
	}

	@Override
	public String getNativeCharsetName() {
		String charset = getCharsetName();
		if (DefCharset.DOCOMO.equalsIgnoreCase(charset) ||
				DefCharset.AU.equalsIgnoreCase(charset)) {
			return DefCharset.WIN31J;
		}
		return charset;
	}

	@Override
	public String getContentTypeString() {
		if (StringUtils.isEmpty(contentTypeString)) {
			contentTypeString = "text/html; charset=" + getContentCharsetName();
		}
		return contentTypeString;
	}

	@Override
	public String getXContentTypeString() {
		if (StringUtils.isEmpty(xContentTypeString)) {
			xContentTypeString =
				"application/xhtml+xml; charset=" + getContentCharsetName();
		}
		return xContentTypeString;
	}

}
