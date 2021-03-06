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

import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;

import org.mobylet.charset.codemap.MobyletDocomoCodeMap;

public class MobyletDocomoCharset extends Charset {


	protected MobyletDocomoCharset() {
        super("x-mobylet-docomo", new String[0]);
	}

	@Override
	public boolean contains(Charset charset) {
		return charset.name().equals("US-ASCII") ||
				(charset instanceof MobyletDocomoCharset);
	}

	@Override
	public CharsetDecoder newDecoder() {
		return new Decoder(this);
	}

	@Override
	public CharsetEncoder newEncoder() {
		return new Encoder(this);
	}


	public static class Encoder extends MobyletEncoder {

		protected Encoder(Charset charset) {
			super(charset);
		}

		@Override
		protected byte[] encodeEmojiDouble(char c) {
			int bi = MobyletDocomoCodeMap.toByte(c);
			if (bi > 0xFF) {
				byte[] b = new byte[2];
				b[0] = (byte)((bi & 0xFF00) >> 8);
				b[1] = (byte)(bi & 0x00FF);
				return b;
			} else {
				return new byte[]{(byte)bi};
			}
		}

		@Override
		protected int getMaxEmojiCode() {
			return 0xE757;
		}

		@Override
		protected int getMinEmojiCode() {
			return 0xE63E;
		}

	}


	public static class Decoder extends MobyletDecoder {

		protected Decoder(Charset charset) {
			super(charset);
		}

		@Override
		protected char decodeEmojiDouble(int b1, int b2) {
			return MobyletDocomoCodeMap.toChar((b1 << 8) + b2);
		}

		@Override
		protected short getMaxEmojiFirstCode() {
			return 0xF9;
		}

		@Override
		protected short getMinEmojiFirstCode() {
			return 0xF8;
		}

	}

}
