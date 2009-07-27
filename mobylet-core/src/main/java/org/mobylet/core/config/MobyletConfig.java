package org.mobylet.core.config;

import java.io.File;
import java.net.Proxy;
import java.util.ArrayList;
import java.util.List;

import org.mobylet.core.Carrier;
import org.mobylet.core.initializer.MobyletInitializer;
import org.mobylet.core.type.ContentType;
import org.mobylet.core.util.StringUtils;

public class MobyletConfig {

	public static final String RES_DEVICE_DIR = "device/";

	public static final String RES_EMOJI_DIR = "emoji/";

	protected String configDir;

	protected List<MobyletInitializer> initializers;

	protected List<Carrier> throughCarrierList;

	protected ContentType contentType;

	protected String deviceDir;

	protected String emojiDir;

	protected Proxy httpProxy;



	public MobyletConfig(String configDir) {
		if (StringUtils.isEmpty(configDir)) {
			this.configDir = "." + File.separator;
		} else {
			if (configDir.endsWith(File.separator) ||
					configDir.endsWith("/")) {
				this.configDir = configDir;
			} else {
				this.configDir = configDir + File.separator;
			}
		}
		initializers = new ArrayList<MobyletInitializer>();
		throughCarrierList = new ArrayList<Carrier>();
	}

	public String getDeviceDir() {
		if (StringUtils.isEmpty(deviceDir)) {
			return RES_DEVICE_DIR;
		} else {
			return deviceDir;
		}
	}

	public String getEmojiDir() {
		if (StringUtils.isEmpty(emojiDir)) {
			return RES_EMOJI_DIR;
		} else {
			return emojiDir;
		}
	}

	public ContentType getContentType() {
		if (contentType == null) {
			return ContentType.HTML;
		} else {
			return contentType;
		}
	}

	public String getConfigDir() {
		return this.configDir;
	}

	public void setDeviceDir(String deviceDir) {
		this.deviceDir = deviceDir;
	}

	public void setEmojiDir(String emojiDir) {
		this.emojiDir = emojiDir;
	}

	public void setContentType(ContentType contentType) {
		this.contentType = contentType;
	}

	public void addInitializer(MobyletInitializer initializer) {
		initializers.add(initializer);
	}

	public boolean removeInitializer(MobyletInitializer initializer) {
		return initializers.remove(initializer);
	}

	public List<MobyletInitializer> getInitializers() {
		return initializers;
	}

	public void addThroughCarrier(Carrier carrier) {
		throughCarrierList.add(carrier);
	}

	public boolean removeThroughCarrier(Carrier carrier) {
		return throughCarrierList.remove(carrier);
	}

	public List<Carrier> getThroughCarrierList() {
		return throughCarrierList;
	}

	public boolean containsThroughCarrier(Carrier carrier) {
		return throughCarrierList.contains(carrier);
	}

	public Proxy getHttpProxy() {
		return httpProxy;
	}

	public void setHttpProxy(Proxy httpProxy) {
		this.httpProxy = httpProxy;
	}

}
