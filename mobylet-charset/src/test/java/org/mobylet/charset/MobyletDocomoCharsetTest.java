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
package org.mobylet.charset;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;

import junit.framework.TestCase;

public class MobyletDocomoCharsetTest extends TestCase {

	public void test_encodeMatchWindows31J() {
		//## ARRANGE ##
		Charset charset = new MobyletDocomoCharset();
		ByteBuffer encodeM = charset.encode("あいう。、");
		ByteBuffer encodeW = Charset.forName("windows-31j").encode("あいう。、");

		//## ACT ##
		byte[] bEncodeM = encodeM.array();
		byte[] bEncodeW = encodeW.array();

		//## ASSERT ##
		for (int i=0; i<bEncodeM.length; i++) {
			assertEquals(bEncodeM[i], bEncodeW[i]);
		}
	}

	public void test_encodeMatchEmoji() {
		//## ARRANGE ##
		Charset charset = new MobyletDocomoCharset();
		ByteBuffer encodeM = charset.encode(String.valueOf((char)0xE63E));

		//## ACT ##
		byte[] bEncodeM = encodeM.array();

		//## ASSERT ##
		assertEquals(bEncodeM.length, 2);
		assertEquals(bEncodeM[0] & 0xFF, 0xF8);
		assertEquals(bEncodeM[1] & 0xFF, 0x9F);
	}

	public void test_decodeMatchWindows31J() {
		//## ARRANGE ##
		Charset charset = new MobyletDocomoCharset();
		CharBuffer decodeM = charset.decode(
				ByteBuffer.wrap("あいうえお。、".getBytes(new MobyletDocomoCharset())));
		CharBuffer decodeW = charset.decode(
				ByteBuffer.wrap("あいうえお。、".getBytes(Charset.forName("windows-31j"))));

		//## ACT ##
		String sDecodeM = new String(decodeM.array());
		String sDecodeW = new String(decodeW.array());

		//## ASSERT ##
		assertEquals(sDecodeM, sDecodeW);
	}

	public void test_decodeMatchEmoji() {
		//## ARRANGE ##
		Charset charset = new MobyletDocomoCharset();
		CharBuffer decode = charset.decode(ByteBuffer.wrap(new byte[]{(byte)0xF8, (byte)0x9F}));

		//## ACT ##
		char[] cDecode = decode.array();

		//## ASSERT ##
		assertEquals(cDecode.length, 1);
		assertEquals(cDecode[0], (char)0xE63E);
	}

}
