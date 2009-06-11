package org.seasar.mobylet.holder;

import javax.servlet.http.HttpServletRequest;

import org.mobylet.core.holder.RequestHolder;
import org.seasar.framework.container.SingletonS2Container;

public class S2MobyletRequestHolder implements RequestHolder {

	protected HttpServletRequest nativeRequest;

	@Override
	public HttpServletRequest get() {
		try {
			return SingletonS2Container.getComponent(HttpServletRequest.class);
		} catch (Throwable t) {
			return nativeRequest;
		}
	}

	@Override
	public void remove() {
		//NOP
	}

	@Override
	public void set(HttpServletRequest request) {
		if (nativeRequest == null) {
			nativeRequest = request;
		}
	}

}
