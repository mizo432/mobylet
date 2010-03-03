package org.mobylet.core.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.mobylet.core.MobyletRuntimeException;

public class SerializeUtils {

	public static byte[] serialize2Bytes(Object obj) {
		ByteArrayOutputStream baos =
			new ByteArrayOutputStream(8192);
		ObjectOutputStream oos = null;
		try {
			oos = new ObjectOutputStream(baos);
			oos.writeObject(obj);
			return baos.toByteArray();
		} catch (Exception e) {
			throw new MobyletRuntimeException("オブジェクトのシリアライズに失敗", e);
		} finally {
			if (oos != null) {
				try {
					oos.close();
				} catch (IOException e) {
					//NOP
				}
			}
		}
	}

	public static String serialize2Base64String(Object obj) {
		return Base64Utils.byteArrayToBase64(serialize2Bytes(obj));
	}

	public static Object deserialize(String objString) {
		ByteArrayInputStream bais =
			new ByteArrayInputStream(Base64Utils.base64ToByteArray(objString));
		ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream(bais);
			return ois.readObject();
		} catch (Exception e) {
			throw new MobyletRuntimeException("オブジェクトのデシリアライズに失敗", e);
		} finally {
			if (ois != null) {
				try {
					ois.close();
				} catch (IOException e) {
					//NOP
				}
			}
		}
	}

}