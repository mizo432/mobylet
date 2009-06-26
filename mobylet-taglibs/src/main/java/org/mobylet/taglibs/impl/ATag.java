package org.mobylet.taglibs.impl;

import javax.servlet.jsp.JspException;

import org.mobylet.core.util.StringUtils;
import org.mobylet.taglibs.utils.JspWriterUtils;
import org.mobylet.taglibs.utils.UrlUtils;

public class ATag extends TransitionTag {

	private static final long serialVersionUID = 6951351713553308618L;

	public static final String TAG = "a";


	protected String href;


	@Override
	public int doStartTag() throws JspException {
		//URL
		addAttribute("href", constructUrl(href));
		JspWriterUtils.write(
				pageContext.getOut(),
				STAG + TAG + getDynamicAttributesStringBuilder().toString() + ETAG);
		//BodyBuffered
		return EVAL_BODY_BUFFERED;
	}

	protected String constructUrl(String url) {
		if (url == null) {
			url = "";
		}
		//Session
		String sessionId = getSessionId();
		if (StringUtils.isNotEmpty(sessionId)) {
			url = UrlUtils.addSession(url, sessionId);
		}
		//Query
		Entry paramEntry = getAppendParameter(url);
		if (paramEntry != null) {
			url = UrlUtils.addParameter(
					url, paramEntry.getKey(), paramEntry.getValue());
		}
		return url;
	}

	@Override
	public int doEndTag() throws JspException {
		JspWriterUtils.write(
				pageContext.getOut(),
				getBodyContent().getString() + STAG + SL + TAG + ETAG);
		recycle();
		return EVAL_PAGE;
	}

	public String getHref() {
		return href;
	}

	public void setHref(String href) {
		this.href = href;
	}
}
