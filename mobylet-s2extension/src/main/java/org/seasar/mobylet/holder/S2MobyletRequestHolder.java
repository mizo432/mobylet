package org.seasar.mobylet.holder;

import javax.servlet.http.HttpServletRequest;

import org.mobylet.core.holder.RequestHolder;
import org.seasar.framework.container.SingletonS2Container;

public class S2MobyletRequestHolder implements RequestHolder {

	@Override
	public HttpServletRequest get() {
		return SingletonS2Container.getComponent(HttpServletRequest.class);
	}

	@Override
	public void remove() {
		//NOP
	}

	@Override
	public void set(HttpServletRequest request) {
		//NOP
	}

}