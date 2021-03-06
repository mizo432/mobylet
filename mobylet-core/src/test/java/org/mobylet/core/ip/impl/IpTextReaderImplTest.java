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
package org.mobylet.core.ip.impl;

import junit.framework.TestCase;

import org.mobylet.core.Carrier;
import org.mobylet.core.ip.IpTextReader;
import org.mobylet.core.launcher.MobyletLauncher;
import org.mobylet.core.util.SingletonUtils;

public class IpTextReaderImplTest extends TestCase {

	public void test_reading() {
		//## ARRANGE ##
		MobyletLauncher.launch();

		//## ACT ##
		IpTextReader reader = SingletonUtils.get(IpTextReader.class);

		//## ASSERT ##
		assertTrue(reader.getIpAddressList(Carrier.DOCOMO).containsIp("210.153.084.001"));

	}
}
