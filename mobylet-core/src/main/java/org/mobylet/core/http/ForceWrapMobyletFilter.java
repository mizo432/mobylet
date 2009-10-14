/*
 * Copyright 2004-2009 the Seasar Foundation and the Others.
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
package org.mobylet.core.http;

import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletResponse;

import org.mobylet.core.dialect.MobyletDialect;
import org.mobylet.core.http.util.ForceWrapUtils;

public class ForceWrapMobyletFilter extends MobyletFilter {

	protected boolean isAllForceWrap = false;


	protected MobyletResponse wrapResponse(
			HttpServletResponse response, MobyletDialect dialect) {
		if (isAllForceWrap) {
			ForceWrapUtils.setForceWrapRequest();
		}
		return new ForceWrapMobyletResponse(response, dialect);
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		super.init(filterConfig);
		if (filterConfig != null) {
			isAllForceWrap =
				"true".equalsIgnoreCase(filterConfig.getInitParameter("isAllForceWrap"));
		}
	}
}