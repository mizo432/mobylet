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
package org.mobylet.mail.util;

import java.io.StringWriter;

import org.mobylet.core.Carrier;
import org.mobylet.core.http.MobyletPrintWriter;

public class MailEmojiUtils {

	public static String convert(Carrier carrier, String source) {
		StringWriter stringWriter = new StringWriter(1024);
		MobyletPrintWriter printWriter = new MobyletPrintWriter(stringWriter, carrier);
		printWriter.write(source);
		printWriter.flush();
		return stringWriter.toString();
	}

}
