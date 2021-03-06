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
package org.mobylet.charset.codemap;

public class MobyletAuMailSjisCodeMap {

	private static int[] b2c;

	private static int[] c2b;


	static {
		//Char to Byte
		c2b = new int[0xEB87 - 0xE901 + 1];
		c2b[0xE901 - 0xE901] = 0xEB59;
		c2b[0xE902 - 0xE901] = 0xEB5A;
		c2b[0xE903 - 0xE901] = 0xEB5B;
		c2b[0xE904 - 0xE901] = 0xEC48;
		c2b[0xE905 - 0xE901] = 0xEC49;
		c2b[0xE906 - 0xE901] = 0xEC4A;
		c2b[0xE907 - 0xE901] = 0xEC4B;
		c2b[0xE908 - 0xE901] = 0xEC4C;
		c2b[0xE909 - 0xE901] = 0xEC4D;
		c2b[0xE90A - 0xE901] = 0xEC4E;
		c2b[0xE90B - 0xE901] = 0xEC4F;
		c2b[0xE90C - 0xE901] = 0xEB9A;
		c2b[0xE90D - 0xE901] = 0xEBEA;
		c2b[0xE90E - 0xE901] = 0xEC96;
		c2b[0xE90F - 0xE901] = 0xEB5E;
		c2b[0xE910 - 0xE901] = 0xEB5F;
		c2b[0xE911 - 0xE901] = 0xEC50;
		c2b[0xE912 - 0xE901] = 0xEC51;
		c2b[0xE913 - 0xE901] = 0xEC52;
		c2b[0xE914 - 0xE901] = 0xEC53;
		c2b[0xE915 - 0xE901] = 0xEC54;
		c2b[0xE916 - 0xE901] = 0xEC55;
		c2b[0xE917 - 0xE901] = 0xEC56;
		c2b[0xE918 - 0xE901] = 0xEC57;
		c2b[0xE919 - 0xE901] = 0xEC97;
		c2b[0xE91A - 0xE901] = 0xEC58;
		c2b[0xE91B - 0xE901] = 0xEC59;
		c2b[0xE91C - 0xE901] = 0xEC5A;
		c2b[0xE91D - 0xE901] = 0xEC5B;
		c2b[0xE91E - 0xE901] = 0xEC5C;
		c2b[0xE91F - 0xE901] = 0xEC5D;
		c2b[0xE920 - 0xE901] = 0xEC5E;
		c2b[0xE921 - 0xE901] = 0xEC5F;
		c2b[0xE922 - 0xE901] = 0xEC60;
		c2b[0xE923 - 0xE901] = 0xEC61;
		c2b[0xE924 - 0xE901] = 0xEC62;
		c2b[0xE925 - 0xE901] = 0xEC63;
		c2b[0xE926 - 0xE901] = 0xEC64;
		c2b[0xE927 - 0xE901] = 0xEC65;
		c2b[0xE928 - 0xE901] = 0xEC66;
		c2b[0xE929 - 0xE901] = 0xEC67;
		c2b[0xE92A - 0xE901] = 0xEC68;
		c2b[0xE92B - 0xE901] = 0xEC69;
		c2b[0xE92C - 0xE901] = 0xEB60;
		c2b[0xE92D - 0xE901] = 0xEB93;
		c2b[0xE92E - 0xE901] = 0xECB1;
		c2b[0xE92F - 0xE901] = 0xEB61;
		c2b[0xE930 - 0xE901] = 0xEBEB;
		c2b[0xE931 - 0xE901] = 0xEC7C;
		c2b[0xE932 - 0xE901] = 0xEBD3;
		c2b[0xE933 - 0xE901] = 0xECB2;
		c2b[0xE934 - 0xE901] = 0xEB9B;
		c2b[0xE935 - 0xE901] = 0xEBEC;
		c2b[0xE936 - 0xE901] = 0xEC6A;
		c2b[0xE937 - 0xE901] = 0xEC6B;
		c2b[0xE938 - 0xE901] = 0xEC7D;
		c2b[0xE939 - 0xE901] = 0xEC98;
		c2b[0xE93A - 0xE901] = 0xEB54;
		c2b[0xE93B - 0xE901] = 0xEC7E;
		c2b[0xE93C - 0xE901] = 0xEB62;
		c2b[0xE93D - 0xE901] = 0xEC6C;
		c2b[0xE93E - 0xE901] = 0xEC6D;
		c2b[0xE93F - 0xE901] = 0xEC6E;
		c2b[0xE940 - 0xE901] = 0xEC6F;
		c2b[0xE941 - 0xE901] = 0xEB9C;
		c2b[0xE942 - 0xE901] = 0xEC70;
		c2b[0xE943 - 0xE901] = 0xEC80;
		c2b[0xE944 - 0xE901] = 0xEBD4;
		c2b[0xE945 - 0xE901] = 0xEB63;
		c2b[0xE946 - 0xE901] = 0xEC71;
		c2b[0xE947 - 0xE901] = 0xEC72;
		c2b[0xE948 - 0xE901] = 0xEBED;
		c2b[0xE949 - 0xE901] = 0xEC73;
		c2b[0xE94A - 0xE901] = 0xEBB8;
		c2b[0xE94B - 0xE901] = 0xEB40;
		c2b[0xE94C - 0xE901] = 0xEB44;
		c2b[0xE94D - 0xE901] = 0xEB4E;
		c2b[0xE94E - 0xE901] = 0xEBB9;
		c2b[0xE94F - 0xE901] = 0xECAC;
		c2b[0xE950 - 0xE901] = 0xEBD5;
		c2b[0xE951 - 0xE901] = 0xEC74;
		c2b[0xE952 - 0xE901] = 0xEC75;
		c2b[0xE953 - 0xE901] = 0xEB74;
		c2b[0xE954 - 0xE901] = 0xECAD;
		c2b[0xE955 - 0xE901] = 0xECB3;
		c2b[0xE956 - 0xE901] = 0xEBD6;
		c2b[0xE957 - 0xE901] = 0xEC99;
		c2b[0xE958 - 0xE901] = 0xEC76;
		c2b[0xE959 - 0xE901] = 0xEC77;
		c2b[0xE95A - 0xE901] = 0xEC90;
		c2b[0xE95B - 0xE901] = 0xEB75;
		c2b[0xE95C - 0xE901] = 0xEC81;
		c2b[0xE95D - 0xE901] = 0xECB4;
		c2b[0xE95E - 0xE901] = 0xEBEE;
		c2b[0xE95F - 0xE901] = 0xEB64;
		c2b[0xE960 - 0xE901] = 0xEB94;
		c2b[0xE961 - 0xE901] = 0xEC82;
		c2b[0xE962 - 0xE901] = 0xEB5C;
		c2b[0xE963 - 0xE901] = 0xEB42;
		c2b[0xE964 - 0xE901] = 0xEC83;
		c2b[0xE965 - 0xE901] = 0xEC84;
		c2b[0xE966 - 0xE901] = 0xEC85;
		c2b[0xE967 - 0xE901] = 0xEC86;
		c2b[0xE968 - 0xE901] = 0xEBEF;
		c2b[0xE969 - 0xE901] = 0xEC87;
		c2b[0xE96A - 0xE901] = 0xEB76;
		c2b[0xE96B - 0xE901] = 0xEB65;
		c2b[0xE96C - 0xE901] = 0xEBFA;
		c2b[0xE96D - 0xE901] = 0xEC9A;
		c2b[0xE96E - 0xE901] = 0xEBF0;
		c2b[0xE96F - 0xE901] = 0xEC9B;
		c2b[0xE970 - 0xE901] = 0xEB84;
		c2b[0xE971 - 0xE901] = 0xEBBD;
		c2b[0xE972 - 0xE901] = 0xEC9C;
		c2b[0xE973 - 0xE901] = 0xEC9D;
		c2b[0xE974 - 0xE901] = 0xEBD7;
		c2b[0xE975 - 0xE901] = 0xEC78;
		c2b[0xE976 - 0xE901] = 0xEC79;
		c2b[0xE977 - 0xE901] = 0xEBF1;
		c2b[0xE978 - 0xE901] = 0xEBF2;
		c2b[0xE979 - 0xE901] = 0xEC88;
		c2b[0xE97A - 0xE901] = 0xEB77;
		c2b[0xE97B - 0xE901] = 0xEC9E;
		c2b[0xE97C - 0xE901] = 0xEBF3;
		c2b[0xE97D - 0xE901] = 0xEB8A;
		c2b[0xE97E - 0xE901] = 0xEC9F;
		c2b[0xE97F - 0xE901] = 0xEC91;
		c2b[0xE980 - 0xE901] = 0xEC92;
		c2b[0xE981 - 0xE901] = 0xEBF4;
		c2b[0xE982 - 0xE901] = 0xECA0;
		c2b[0xE983 - 0xE901] = 0xEC89;
		c2b[0xE984 - 0xE901] = 0xEC7A;
		c2b[0xE985 - 0xE901] = 0xEBA7;
		c2b[0xE986 - 0xE901] = 0xEBBA;
		c2b[0xE987 - 0xE901] = 0xECA1;
		c2b[0xE988 - 0xE901] = 0xEC7B;
		c2b[0xE989 - 0xE901] = 0xEC8A;
		c2b[0xE98A - 0xE901] = 0xEBF5;
		c2b[0xE98B - 0xE901] = 0xECA2;
		c2b[0xE98C - 0xE901] = 0xEBD8;
		c2b[0xE98D - 0xE901] = 0xEBD9;
		c2b[0xE98E - 0xE901] = 0xEC8B;
		c2b[0xE98F - 0xE901] = 0xEB78;
		c2b[0xE990 - 0xE901] = 0xEBA8;
		c2b[0xE991 - 0xE901] = 0xEBF6;
		c2b[0xE992 - 0xE901] = 0xEB85;
		c2b[0xE993 - 0xE901] = 0xEC8C;
		c2b[0xE994 - 0xE901] = 0xEB8B;
		c2b[0xE995 - 0xE901] = 0xEB79;
		c2b[0xE996 - 0xE901] = 0xECA3;
		c2b[0xE997 - 0xE901] = 0xECAE;
		c2b[0xE998 - 0xE901] = 0xECA4;
		c2b[0xE999 - 0xE901] = 0xECAF;
		c2b[0xE99A - 0xE901] = 0xECB0;
		c2b[0xE99B - 0xE901] = 0xEBF7;
		c2b[0xE99C - 0xE901] = 0xEB86;
		c2b[0xE99D - 0xE901] = 0xEC8D;
		c2b[0xE99E - 0xE901] = 0xEB7A;
		c2b[0xE99F - 0xE901] = 0xEC93;
		c2b[0xE9A0 - 0xE901] = 0xEB9D;
		c2b[0xE9A1 - 0xE901] = 0xECA5;
		c2b[0xE9A2 - 0xE901] = 0xECA6;
		c2b[0xE9A3 - 0xE901] = 0xEBDA;
		c2b[0xE9A4 - 0xE901] = 0xECA7;
		c2b[0xE9A5 - 0xE901] = 0xEBF8;
		c2b[0xE9A6 - 0xE901] = 0xEBF9;
		c2b[0xE9A7 - 0xE901] = 0xEB66;
		c2b[0xE9A8 - 0xE901] = 0xEB8C;
		c2b[0xE9A9 - 0xE901] = 0xEB8D;
		c2b[0xE9AA - 0xE901] = 0xEBA1;
		c2b[0xE9AB - 0xE901] = 0xECA8;
		c2b[0xE9AC - 0xE901] = 0xEB8E;
		c2b[0xE9AD - 0xE901] = 0xECA9;
		c2b[0xE9AE - 0xE901] = 0xECAA;
		c2b[0xE9AF - 0xE901] = 0xECAB;
		c2b[0xE9B0 - 0xE901] = 0xEB55;
		c2b[0xE9B1 - 0xE901] = 0xEB56;
		c2b[0xE9B2 - 0xE901] = 0xEB57;
		c2b[0xE9B3 - 0xE901] = 0xEB58;
		c2b[0xE9B4 - 0xE901] = 0xEBFB;
		c2b[0xE9B5 - 0xE901] = 0xEBFC;
		c2b[0xE9B6 - 0xE901] = 0xEC40;
		c2b[0xE9B7 - 0xE901] = 0xEC41;
		c2b[0xE9B8 - 0xE901] = 0xEC42;
		c2b[0xE9B9 - 0xE901] = 0xEC43;
		c2b[0xE9BA - 0xE901] = 0xEC44;
		c2b[0xE9BB - 0xE901] = 0xEC45;
		c2b[0xE9BC - 0xE901] = 0xEC46;
		c2b[0xE9BD - 0xE901] = 0xEC47;
		c2b[0xE9BE - 0xE901] = 0xEB41;
		c2b[0xE9BF - 0xE901] = 0xEB5D;
		c2b[0xE9C0 - 0xE901] = 0xEB67;
		c2b[0xE9C1 - 0xE901] = 0xEB68;
		c2b[0xE9C2 - 0xE901] = 0xEB69;
		c2b[0xE9C3 - 0xE901] = 0xEB6A;
		c2b[0xE9C4 - 0xE901] = 0xEB6B;
		c2b[0xE9C5 - 0xE901] = 0xEB6C;
		c2b[0xE9C6 - 0xE901] = 0xEB6D;
		c2b[0xE9C7 - 0xE901] = 0xEB6E;
		c2b[0xE9C8 - 0xE901] = 0xEB6F;
		c2b[0xE9C9 - 0xE901] = 0xEB70;
		c2b[0xE9CA - 0xE901] = 0xEB71;
		c2b[0xE9CB - 0xE901] = 0xEB72;
		c2b[0xE9CC - 0xE901] = 0xEB73;
		c2b[0xE9CD - 0xE901] = 0xEB7B;
		c2b[0xE9CE - 0xE901] = 0xEB7C;
		c2b[0xE9CF - 0xE901] = 0xEB7D;
		c2b[0xE9D0 - 0xE901] = 0xEB7E;
		c2b[0xE9D1 - 0xE901] = 0xEB80;
		c2b[0xE9D2 - 0xE901] = 0xEB81;
		c2b[0xE9D3 - 0xE901] = 0xEB82;
		c2b[0xE9D4 - 0xE901] = 0xEB83;
		c2b[0xE9D5 - 0xE901] = 0xEC8E;
		c2b[0xE9D6 - 0xE901] = 0xEC8F;
		c2b[0xE9D7 - 0xE901] = 0xEB87;
		c2b[0xE9D8 - 0xE901] = 0xEB88;
		c2b[0xE9D9 - 0xE901] = 0xEB89;
		c2b[0xE9DA - 0xE901] = 0xEB43;
		c2b[0xE9DB - 0xE901] = 0xEB8F;
		c2b[0xE9DC - 0xE901] = 0xEB90;
		c2b[0xE9DD - 0xE901] = 0xEB91;
		c2b[0xE9DE - 0xE901] = 0xEB92;
		c2b[0xE9DF - 0xE901] = 0xEB45;
		c2b[0xE9E0 - 0xE901] = 0xEB95;
		c2b[0xE9E1 - 0xE901] = 0xEB96;
		c2b[0xE9E2 - 0xE901] = 0xEB97;
		c2b[0xE9E3 - 0xE901] = 0xEB98;
		c2b[0xE9E4 - 0xE901] = 0xEB99;
		c2b[0xE9E5 - 0xE901] = 0xEB46;
		c2b[0xE9E6 - 0xE901] = 0xEB47;
		c2b[0xE9E7 - 0xE901] = 0xEB9E;
		c2b[0xE9E8 - 0xE901] = 0xEB9F;
		c2b[0xE9E9 - 0xE901] = 0xEBA0;
		c2b[0xE9EA - 0xE901] = 0xEBA2;
		c2b[0xE9EB - 0xE901] = 0xEBA3;
		c2b[0xE9EC - 0xE901] = 0xEBA4;
		c2b[0xE9ED - 0xE901] = 0xEBA5;
		c2b[0xE9EE - 0xE901] = 0xEBA6;
		c2b[0xE9EF - 0xE901] = 0xEBA9;
		c2b[0xE9F0 - 0xE901] = 0xEBAA;
		c2b[0xE9F1 - 0xE901] = 0xEBAB;
		c2b[0xE9F2 - 0xE901] = 0xEBAC;
		c2b[0xE9F3 - 0xE901] = 0xEBAD;
		c2b[0xE9F4 - 0xE901] = 0xEBAE;
		c2b[0xE9F5 - 0xE901] = 0xEBAF;
		c2b[0xE9F6 - 0xE901] = 0xEB48;
		c2b[0xE9F7 - 0xE901] = 0xEBB0;
		c2b[0xE9F8 - 0xE901] = 0xEBB1;
		c2b[0xE9F9 - 0xE901] = 0xEBB2;
		c2b[0xE9FA - 0xE901] = 0xEBB3;
		c2b[0xE9FB - 0xE901] = 0xEBB4;
		c2b[0xE9FC - 0xE901] = 0xEBB5;
		c2b[0xE9FD - 0xE901] = 0xEBB6;
		c2b[0xE9FE - 0xE901] = 0xEBB7;
		c2b[0xE9FF - 0xE901] = 0xEBBB;
		c2b[0xEA00 - 0xE901] = 0xEBBC;
		c2b[0xEA01 - 0xE901] = 0xEB49;
		c2b[0xEA02 - 0xE901] = 0xEB4A;
		c2b[0xEA03 - 0xE901] = 0xEB4B;
		c2b[0xEA04 - 0xE901] = 0xEB4C;
		c2b[0xEA05 - 0xE901] = 0xEB4D;
		c2b[0xEA06 - 0xE901] = 0xEBBE;
		c2b[0xEA07 - 0xE901] = 0xEBBF;
		c2b[0xEA08 - 0xE901] = 0xEBC0;
		c2b[0xEA09 - 0xE901] = 0xEB4F;
		c2b[0xEA0A - 0xE901] = 0xEB50;
		c2b[0xEA0B - 0xE901] = 0xEB51;
		c2b[0xEA0C - 0xE901] = 0xEB52;
		c2b[0xEA0D - 0xE901] = 0xEB53;
		c2b[0xEA0E - 0xE901] = 0xEBC1;
		c2b[0xEA0F - 0xE901] = 0xEBC2;
		c2b[0xEA10 - 0xE901] = 0xEBC3;
		c2b[0xEA11 - 0xE901] = 0xEBC4;
		c2b[0xEA12 - 0xE901] = 0xEBC5;
		c2b[0xEA13 - 0xE901] = 0xEBC6;
		c2b[0xEA14 - 0xE901] = 0xEBC7;
		c2b[0xEA15 - 0xE901] = 0xEBC8;
		c2b[0xEA16 - 0xE901] = 0xEBC9;
		c2b[0xEA17 - 0xE901] = 0xEBCA;
		c2b[0xEA18 - 0xE901] = 0xEBCB;
		c2b[0xEA19 - 0xE901] = 0xEBCC;
		c2b[0xEA1A - 0xE901] = 0xEBCD;
		c2b[0xEA1B - 0xE901] = 0xEBCE;
		c2b[0xEA1C - 0xE901] = 0xEBCF;
		c2b[0xEA1D - 0xE901] = 0xEBD0;
		c2b[0xEA1E - 0xE901] = 0xEBD1;
		c2b[0xEA1F - 0xE901] = 0xEBD2;
		c2b[0xEA20 - 0xE901] = 0xEBDB;
		c2b[0xEA21 - 0xE901] = 0xEBDC;
		c2b[0xEA22 - 0xE901] = 0xEBDD;
		c2b[0xEA23 - 0xE901] = 0xEBDE;
		c2b[0xEA24 - 0xE901] = 0xEBDF;
		c2b[0xEA25 - 0xE901] = 0xEBE0;
		c2b[0xEA26 - 0xE901] = 0xEBE1;
		c2b[0xEA27 - 0xE901] = 0xEBE2;
		c2b[0xEA28 - 0xE901] = 0xEBE3;
		c2b[0xEA29 - 0xE901] = 0xEBE4;
		c2b[0xEA2A - 0xE901] = 0xEC94;
		c2b[0xEA2B - 0xE901] = 0xEC95;
		c2b[0xEA2C - 0xE901] = 0xEBE5;
		c2b[0xEA2D - 0xE901] = 0xEBE6;
		c2b[0xEA2E - 0xE901] = 0xEBE7;
		c2b[0xEA2F - 0xE901] = 0xEBE8;
		c2b[0xEA30 - 0xE901] = 0xEBE9;
		c2b[0xEA31 - 0xE901] = 0xECB5;
		c2b[0xEA32 - 0xE901] = 0xECB6;
		c2b[0xEA33 - 0xE901] = 0xECB7;
		c2b[0xEA34 - 0xE901] = 0xECB8;
		c2b[0xEA35 - 0xE901] = 0xECB9;
		c2b[0xEA36 - 0xE901] = 0xECBA;
		c2b[0xEA37 - 0xE901] = 0xECBB;
		c2b[0xEA38 - 0xE901] = 0xECBC;
		c2b[0xEA39 - 0xE901] = 0xECBD;
		c2b[0xEA3A - 0xE901] = 0xECBE;
		c2b[0xEA3B - 0xE901] = 0xECBF;
		c2b[0xEA3C - 0xE901] = 0xECC0;
		c2b[0xEA3D - 0xE901] = 0xECC1;
		c2b[0xEA3E - 0xE901] = 0xECC2;
		c2b[0xEA3F - 0xE901] = 0xECC3;
		c2b[0xEA40 - 0xE901] = 0xECC4;
		c2b[0xEA41 - 0xE901] = 0xECC5;
		c2b[0xEA42 - 0xE901] = 0xECC6;
		c2b[0xEA43 - 0xE901] = 0xECC7;
		c2b[0xEA44 - 0xE901] = 0xECC8;
		c2b[0xEA45 - 0xE901] = 0xECC9;
		c2b[0xEA46 - 0xE901] = 0xECCA;
		c2b[0xEA47 - 0xE901] = 0xECCB;
		c2b[0xEA48 - 0xE901] = 0xECCC;
		c2b[0xEA49 - 0xE901] = 0xECCD;
		c2b[0xEA4A - 0xE901] = 0xECCE;
		c2b[0xEA4B - 0xE901] = 0xECCF;
		c2b[0xEA4C - 0xE901] = 0xECD0;
		c2b[0xEA4D - 0xE901] = 0xECD1;
		c2b[0xEA4E - 0xE901] = 0xECE5;
		c2b[0xEA4F - 0xE901] = 0xECE6;
		c2b[0xEA50 - 0xE901] = 0xECE7;
		c2b[0xEA51 - 0xE901] = 0xECE8;
		c2b[0xEA52 - 0xE901] = 0xECE9;
		c2b[0xEA53 - 0xE901] = 0xECEA;
		c2b[0xEA54 - 0xE901] = 0xECEB;
		c2b[0xEA55 - 0xE901] = 0xECEC;
		c2b[0xEA56 - 0xE901] = 0xECED;
		c2b[0xEA57 - 0xE901] = 0xECEE;
		c2b[0xEA58 - 0xE901] = 0xECEF;
		c2b[0xEA59 - 0xE901] = 0xECF0;
		c2b[0xEA5A - 0xE901] = 0xECF1;
		c2b[0xEA5B - 0xE901] = 0xECF2;
		c2b[0xEA5C - 0xE901] = 0xECF3;
		c2b[0xEA5D - 0xE901] = 0xECF4;
		c2b[0xEA5E - 0xE901] = 0xECF5;
		c2b[0xEA5F - 0xE901] = 0xECF6;
		c2b[0xEA60 - 0xE901] = 0xECF7;
		c2b[0xEA61 - 0xE901] = 0xECF8;
		c2b[0xEA62 - 0xE901] = 0xECF9;
		c2b[0xEA63 - 0xE901] = 0xECFA;
		c2b[0xEA64 - 0xE901] = 0xECFB;
		c2b[0xEA65 - 0xE901] = 0xECFC;
		c2b[0xEA66 - 0xE901] = 0xED40;
		c2b[0xEA67 - 0xE901] = 0xED41;
		c2b[0xEA68 - 0xE901] = 0xED42;
		c2b[0xEA69 - 0xE901] = 0xED43;
		c2b[0xEA6A - 0xE901] = 0xED44;
		c2b[0xEA6B - 0xE901] = 0xED45;
		c2b[0xEA6C - 0xE901] = 0xED46;
		c2b[0xEA6D - 0xE901] = 0xED47;
		c2b[0xEA6E - 0xE901] = 0xED48;
		c2b[0xEA6F - 0xE901] = 0xED49;
		c2b[0xEA70 - 0xE901] = 0xED4A;
		c2b[0xEA71 - 0xE901] = 0xED4B;
		c2b[0xEA72 - 0xE901] = 0xED4C;
		c2b[0xEA73 - 0xE901] = 0xED4D;
		c2b[0xEA74 - 0xE901] = 0xED4E;
		c2b[0xEA75 - 0xE901] = 0xED4F;
		c2b[0xEA76 - 0xE901] = 0xED50;
		c2b[0xEA77 - 0xE901] = 0xED51;
		c2b[0xEA78 - 0xE901] = 0xED52;
		c2b[0xEA79 - 0xE901] = 0xED53;
		c2b[0xEA7A - 0xE901] = 0xED54;
		c2b[0xEA7B - 0xE901] = 0xED55;
		c2b[0xEA7C - 0xE901] = 0xED56;
		c2b[0xEA7D - 0xE901] = 0xED57;
		c2b[0xEA7E - 0xE901] = 0xED58;
		c2b[0xEA7F - 0xE901] = 0xED59;
		c2b[0xEA80 - 0xE901] = 0xED5A;
		c2b[0xEA81 - 0xE901] = 0xED5B;
		c2b[0xEA82 - 0xE901] = 0xED5C;
		c2b[0xEA83 - 0xE901] = 0xED5D;
		c2b[0xEA84 - 0xE901] = 0xED5E;
		c2b[0xEA85 - 0xE901] = 0xED5F;
		c2b[0xEA86 - 0xE901] = 0xED60;
		c2b[0xEA87 - 0xE901] = 0xED61;
		c2b[0xEA88 - 0xE901] = 0xED62;
		c2b[0xEA89 - 0xE901] = 0xED63;
		c2b[0xEA8A - 0xE901] = 0xED64;
		c2b[0xEA8B - 0xE901] = 0xED65;
		c2b[0xEA8C - 0xE901] = 0xED66;
		c2b[0xEA8D - 0xE901] = 0xED67;
		c2b[0xEA8E - 0xE901] = 0xED68;
		c2b[0xEA8F - 0xE901] = 0xED69;
		c2b[0xEA90 - 0xE901] = 0xED6A;
		c2b[0xEA91 - 0xE901] = 0xED6B;
		c2b[0xEA92 - 0xE901] = 0xED6C;
		c2b[0xEA93 - 0xE901] = 0xED6D;
		c2b[0xEA94 - 0xE901] = 0xED6E;
		c2b[0xEA95 - 0xE901] = 0xED6F;
		c2b[0xEA96 - 0xE901] = 0xED70;
		c2b[0xEA97 - 0xE901] = 0xED71;
		c2b[0xEA98 - 0xE901] = 0xED72;
		c2b[0xEA99 - 0xE901] = 0xED73;
		c2b[0xEA9A - 0xE901] = 0xED74;
		c2b[0xEA9B - 0xE901] = 0xED75;
		c2b[0xEA9C - 0xE901] = 0xED76;
		c2b[0xEA9D - 0xE901] = 0xED77;
		c2b[0xEA9E - 0xE901] = 0xED78;
		c2b[0xEA9F - 0xE901] = 0xED79;
		c2b[0xEAA0 - 0xE901] = 0xED7A;
		c2b[0xEAA1 - 0xE901] = 0xED7B;
		c2b[0xEAA2 - 0xE901] = 0xED7C;
		c2b[0xEAA3 - 0xE901] = 0xED7D;
		c2b[0xEAA4 - 0xE901] = 0xED7E;
		c2b[0xEAA5 - 0xE901] = 0xED80;
		c2b[0xEAA6 - 0xE901] = 0xED81;
		c2b[0xEAA7 - 0xE901] = 0xED82;
		c2b[0xEAA8 - 0xE901] = 0xED83;
		c2b[0xEAA9 - 0xE901] = 0xED84;
		c2b[0xEAAA - 0xE901] = 0xED85;
		c2b[0xEAAB - 0xE901] = 0xED86;
		c2b[0xEAAC - 0xE901] = 0xED87;
		c2b[0xEAAD - 0xE901] = 0xED88;
		c2b[0xEAAE - 0xE901] = 0xED89;
		c2b[0xEAAF - 0xE901] = 0xED8A;
		c2b[0xEAB0 - 0xE901] = 0xED8B;
		c2b[0xEAB1 - 0xE901] = 0xED8C;
		c2b[0xEAB2 - 0xE901] = 0xED8D;
		c2b[0xEAB3 - 0xE901] = 0xED8E;
		c2b[0xEAB4 - 0xE901] = 0xED8F;
		c2b[0xEAB5 - 0xE901] = 0xED90;
		c2b[0xEAB6 - 0xE901] = 0xED91;
		c2b[0xEAB7 - 0xE901] = 0xED92;
		c2b[0xEAB8 - 0xE901] = 0xED93;
		c2b[0xEAB9 - 0xE901] = 0xED94;
		c2b[0xEABA - 0xE901] = 0xED95;
		c2b[0xEABB - 0xE901] = 0xED96;
		c2b[0xEABC - 0xE901] = 0xED97;
		c2b[0xEABD - 0xE901] = 0xED98;
		c2b[0xEABE - 0xE901] = 0xED99;
		c2b[0xEABF - 0xE901] = 0xED9A;
		c2b[0xEAC0 - 0xE901] = 0xED9B;
		c2b[0xEAC1 - 0xE901] = 0xED9C;
		c2b[0xEAC2 - 0xE901] = 0xED9D;
		c2b[0xEAC3 - 0xE901] = 0xED9E;
		c2b[0xEAC4 - 0xE901] = 0xED9F;
		c2b[0xEAC5 - 0xE901] = 0xEDA0;
		c2b[0xEAC6 - 0xE901] = 0xEDA1;
		c2b[0xEAC7 - 0xE901] = 0xEDA2;
		c2b[0xEAC8 - 0xE901] = 0xEDA3;
		c2b[0xEAC9 - 0xE901] = 0xEDA4;
		c2b[0xEACA - 0xE901] = 0xEDA5;
		c2b[0xEACB - 0xE901] = 0xEDA6;
		c2b[0xEACC - 0xE901] = 0xEDA7;
		c2b[0xEACD - 0xE901] = 0xEDA8;
		c2b[0xEACE - 0xE901] = 0xEDA9;
		c2b[0xEACF - 0xE901] = 0xEDAA;
		c2b[0xEAD0 - 0xE901] = 0xEDAB;
		c2b[0xEAD1 - 0xE901] = 0xEDAC;
		c2b[0xEAD2 - 0xE901] = 0xEDAD;
		c2b[0xEAD3 - 0xE901] = 0xEDAE;
		c2b[0xEAD4 - 0xE901] = 0xEDAF;
		c2b[0xEAD5 - 0xE901] = 0xEDB0;
		c2b[0xEAD6 - 0xE901] = 0xEDB1;
		c2b[0xEAD7 - 0xE901] = 0xEDB2;
		c2b[0xEAD8 - 0xE901] = 0xEDB3;
		c2b[0xEAD9 - 0xE901] = 0xEDB4;
		c2b[0xEADA - 0xE901] = 0xEDB5;
		c2b[0xEADB - 0xE901] = 0xEDB6;
		c2b[0xEADC - 0xE901] = 0xEDB7;
		c2b[0xEADD - 0xE901] = 0xEDB8;
		c2b[0xEADE - 0xE901] = 0xEDB9;
		c2b[0xEADF - 0xE901] = 0xEDBA;
		c2b[0xEAE0 - 0xE901] = 0xEDBB;
		c2b[0xEAE1 - 0xE901] = 0xEDBC;
		c2b[0xEAE2 - 0xE901] = 0xEDBD;
		c2b[0xEAE3 - 0xE901] = 0xEDBE;
		c2b[0xEAE4 - 0xE901] = 0xEDBF;
		c2b[0xEAE5 - 0xE901] = 0xEDC0;
		c2b[0xEAE6 - 0xE901] = 0xEDC1;
		c2b[0xEAE7 - 0xE901] = 0xEDC2;
		c2b[0xEAE8 - 0xE901] = 0xEDC3;
		c2b[0xEAE9 - 0xE901] = 0xEDC4;
		c2b[0xEAEA - 0xE901] = 0xEDC5;
		c2b[0xEAEB - 0xE901] = 0xEDC6;
		c2b[0xEAEC - 0xE901] = 0xEDC7;
		c2b[0xEAED - 0xE901] = 0xEDC8;
		c2b[0xEAEE - 0xE901] = 0xEDC9;
		c2b[0xEAEF - 0xE901] = 0xEDCA;
		c2b[0xEAF0 - 0xE901] = 0xEDCB;
		c2b[0xEAF1 - 0xE901] = 0xEDCC;
		c2b[0xEAF2 - 0xE901] = 0xEDCD;
		c2b[0xEAF3 - 0xE901] = 0xEDCE;
		c2b[0xEAF4 - 0xE901] = 0xECD2;
		c2b[0xEAF5 - 0xE901] = 0xECD3;
		c2b[0xEAF6 - 0xE901] = 0xECD4;
		c2b[0xEAF7 - 0xE901] = 0xECD5;
		c2b[0xEAF8 - 0xE901] = 0xECD6;
		c2b[0xEAF9 - 0xE901] = 0xECD7;
		c2b[0xEAFA - 0xE901] = 0xECD8;
		c2b[0xEAFB - 0xE901] = 0xECD9;
		c2b[0xEAFC - 0xE901] = 0xECDA;
		c2b[0xEAFD - 0xE901] = 0xECDB;
		c2b[0xEAFE - 0xE901] = 0xECDC;
		c2b[0xEAFF - 0xE901] = 0xECDD;
		c2b[0xEB00 - 0xE901] = 0xECDE;
		c2b[0xEB01 - 0xE901] = 0xECDF;
		c2b[0xEB02 - 0xE901] = 0xECE0;
		c2b[0xEB03 - 0xE901] = 0xECE1;
		c2b[0xEB04 - 0xE901] = 0xECE2;
		c2b[0xEB05 - 0xE901] = 0xECE3;
		c2b[0xEB06 - 0xE901] = 0xECE4;
		c2b[0xEB07 - 0xE901] = 0xEDCF;
		c2b[0xEB08 - 0xE901] = 0xEDD0;
		c2b[0xEB09 - 0xE901] = 0xEDD1;
		c2b[0xEB0A - 0xE901] = 0xEDD2;
		c2b[0xEB0B - 0xE901] = 0xEDD3;
		c2b[0xEB0C - 0xE901] = 0xEDD4;
		c2b[0xEB0D - 0xE901] = 0xEDD5;
		c2b[0xEB0E - 0xE901] = 0xEDD6;
		c2b[0xEB0F - 0xE901] = 0xEDD7;
		c2b[0xEB10 - 0xE901] = 0xEDD8;
		c2b[0xEB11 - 0xE901] = 0xEDD9;
		c2b[0xEB12 - 0xE901] = 0xEDDA;
		c2b[0xEB13 - 0xE901] = 0xEDDB;
		c2b[0xEB14 - 0xE901] = 0xEDDC;
		c2b[0xEB15 - 0xE901] = 0xEDDD;
		c2b[0xEB16 - 0xE901] = 0xEDDE;
		c2b[0xEB17 - 0xE901] = 0xEDDF;
		c2b[0xEB18 - 0xE901] = 0xEDE0;
		c2b[0xEB19 - 0xE901] = 0xEDE1;
		c2b[0xEB1A - 0xE901] = 0xEDE2;
		c2b[0xEB1B - 0xE901] = 0xEDE3;
		c2b[0xEB1C - 0xE901] = 0xEDE4;
		c2b[0xEB1D - 0xE901] = 0xEDE5;
		c2b[0xEB1E - 0xE901] = 0xEDE6;
		c2b[0xEB1F - 0xE901] = 0xEDE7;
		c2b[0xEB20 - 0xE901] = 0xEDE8;
		c2b[0xEB21 - 0xE901] = 0xEDE9;
		c2b[0xEB22 - 0xE901] = 0xEDEA;
		c2b[0xEB23 - 0xE901] = 0xEDEB;
		c2b[0xEB24 - 0xE901] = 0xEDEC;
		c2b[0xEB25 - 0xE901] = 0xEDED;
		c2b[0xEB26 - 0xE901] = 0xEDEE;
		c2b[0xEB27 - 0xE901] = 0xEDEF;
		c2b[0xEB28 - 0xE901] = 0xEDF0;
		c2b[0xEB29 - 0xE901] = 0xEDF1;
		c2b[0xEB2A - 0xE901] = 0xEDF2;
		c2b[0xEB2B - 0xE901] = 0xEDF3;
		c2b[0xEB2C - 0xE901] = 0xEDF4;
		c2b[0xEB2D - 0xE901] = 0xEDF5;
		c2b[0xEB2E - 0xE901] = 0xEDF6;
		c2b[0xEB2F - 0xE901] = 0xEDF7;
		c2b[0xEB30 - 0xE901] = 0xEDF8;
		c2b[0xEB31 - 0xE901] = 0xEDF9;
		c2b[0xEB32 - 0xE901] = 0xEDFA;
		c2b[0xEB33 - 0xE901] = 0xEDFB;
		c2b[0xEB34 - 0xE901] = 0xEDFC;
		c2b[0xEB35 - 0xE901] = 0xEE40;
		c2b[0xEB36 - 0xE901] = 0xEE41;
		c2b[0xEB37 - 0xE901] = 0xEE42;
		c2b[0xEB38 - 0xE901] = 0xEE43;
		c2b[0xEB39 - 0xE901] = 0xEE44;
		c2b[0xEB3A - 0xE901] = 0xEE45;
		c2b[0xEB3B - 0xE901] = 0xEE46;
		c2b[0xEB3C - 0xE901] = 0xEE47;
		c2b[0xEB3D - 0xE901] = 0xEE48;
		c2b[0xEB3E - 0xE901] = 0xEE49;
		c2b[0xEB3F - 0xE901] = 0xEE4A;
		c2b[0xEB40 - 0xE901] = 0xEE4B;
		c2b[0xEB41 - 0xE901] = 0xEE4C;
		c2b[0xEB42 - 0xE901] = 0xEE4D;
		c2b[0xEB43 - 0xE901] = 0xEE4E;
		c2b[0xEB44 - 0xE901] = 0xEE4F;
		c2b[0xEB45 - 0xE901] = 0xEE50;
		c2b[0xEB46 - 0xE901] = 0xEE51;
		c2b[0xEB47 - 0xE901] = 0xEE52;
		c2b[0xEB48 - 0xE901] = 0xEE53;
		c2b[0xEB49 - 0xE901] = 0xEE54;
		c2b[0xEB4A - 0xE901] = 0xEE55;
		c2b[0xEB4B - 0xE901] = 0xEE56;
		c2b[0xEB4C - 0xE901] = 0xEE57;
		c2b[0xEB4D - 0xE901] = 0xEE58;
		c2b[0xEB4E - 0xE901] = 0xEE59;
		c2b[0xEB4F - 0xE901] = 0xEE5A;
		c2b[0xEB50 - 0xE901] = 0xEE5B;
		c2b[0xEB51 - 0xE901] = 0xEE5C;
		c2b[0xEB52 - 0xE901] = 0xEE5D;
		c2b[0xEB53 - 0xE901] = 0xEE5E;
		c2b[0xEB54 - 0xE901] = 0xEE5F;
		c2b[0xEB55 - 0xE901] = 0xEE60;
		c2b[0xEB56 - 0xE901] = 0xEE61;
		c2b[0xEB57 - 0xE901] = 0xEE62;
		c2b[0xEB58 - 0xE901] = 0xEE63;
		c2b[0xEB59 - 0xE901] = 0xEE64;
		c2b[0xEB5A - 0xE901] = 0xEE65;
		c2b[0xEB5B - 0xE901] = 0xEE66;
		c2b[0xEB5C - 0xE901] = 0xEE67;
		c2b[0xEB5D - 0xE901] = 0xEE68;
		c2b[0xEB5E - 0xE901] = 0xEE69;
		c2b[0xEB5F - 0xE901] = 0xEE6A;
		c2b[0xEB60 - 0xE901] = 0xEE6B;
		c2b[0xEB61 - 0xE901] = 0xEE6C;
		c2b[0xEB62 - 0xE901] = 0xEE6D;
		c2b[0xEB63 - 0xE901] = 0xEE6E;
		c2b[0xEB64 - 0xE901] = 0xEE6F;
		c2b[0xEB65 - 0xE901] = 0xEE70;
		c2b[0xEB66 - 0xE901] = 0xEE71;
		c2b[0xEB67 - 0xE901] = 0xEE72;
		c2b[0xEB68 - 0xE901] = 0xEE73;
		c2b[0xEB69 - 0xE901] = 0xEE74;
		c2b[0xEB6A - 0xE901] = 0xEE75;
		c2b[0xEB6B - 0xE901] = 0xEE76;
		c2b[0xEB6C - 0xE901] = 0xEE77;
		c2b[0xEB6D - 0xE901] = 0xEE78;
		c2b[0xEB6E - 0xE901] = 0xEE79;
		c2b[0xEB6F - 0xE901] = 0xEE7A;
		c2b[0xEB70 - 0xE901] = 0xEE7B;
		c2b[0xEB71 - 0xE901] = 0xEE7C;
		c2b[0xEB72 - 0xE901] = 0xEE7D;
		c2b[0xEB73 - 0xE901] = 0xEE7E;
		c2b[0xEB74 - 0xE901] = 0xEE80;
		c2b[0xEB75 - 0xE901] = 0xEE81;
		c2b[0xEB76 - 0xE901] = 0xEE82;
		c2b[0xEB77 - 0xE901] = 0xEE83;
		c2b[0xEB78 - 0xE901] = 0xEE84;
		c2b[0xEB79 - 0xE901] = 0xEE85;
		c2b[0xEB7A - 0xE901] = 0xEE86;
		c2b[0xEB7B - 0xE901] = 0xEE87;
		c2b[0xEB7C - 0xE901] = 0xEE88;
		c2b[0xEB7D - 0xE901] = 0xEE89;
		c2b[0xEB7E - 0xE901] = 0xEE8A;
		c2b[0xEB7F - 0xE901] = 0xEE8B;
		c2b[0xEB80 - 0xE901] = 0xEE8C;
		c2b[0xEB81 - 0xE901] = 0xEE8D;
		c2b[0xEB82 - 0xE901] = 0xEE8E;
		c2b[0xEB83 - 0xE901] = 0xEE8F;
		c2b[0xEB84 - 0xE901] = 0xEE90;
		c2b[0xEB85 - 0xE901] = 0xEE91;
		c2b[0xEB86 - 0xE901] = 0xEE92;
		c2b[0xEB87 - 0xE901] = 0xEE93;

		for (int i=0; i<c2b.length; i++) {
			if (c2b[i] == 0) {
				c2b[i] = 0x3F3F;
			}
		}

		//Byte to Char
		b2c = new int[0xEE93 - 0xEB40 + 1];
		for (int i=0; i<c2b.length; i++) {
			int b = c2b[i];
			if (b != 0x3F3F) {
				b2c[b - 0xEB40] = i + 0xE901;
			}
		}
		for (int i=0; i<b2c.length; i++) {
			if (b2c[i] == 0) {
				b2c[i] = 0x3F;
			}
		}
	}

	public static int toByte(int c) {
		return c2b[c - 0xE901];
	}

	public static char toChar(int b) {
		return (char)b2c[b - 0xEB40];
	}
}
