package org.mobylet.taglibs.impl;

import java.io.IOException;

import javax.servlet.jsp.JspException;

import org.mobylet.core.Carrier;
import org.mobylet.core.Mobylet;
import org.mobylet.core.MobyletFactory;
import org.mobylet.taglibs.MobyletDynamicSimpleTagSupport;
import org.mobylet.taglibs.utils.JspWriterUtils;

public class HiddenUidTag extends MobyletDynamicSimpleTagSupport {

	public static final String TAG = "input type=\"hidden\"";

	@Override
	public void doTag() throws JspException, IOException {
		Mobylet m = MobyletFactory.getInstance();
		if (m.getCarrier() == Carrier.DOCOMO) {
			addAttribute("name", "uid");
			addAttribute("value", m.getUid());
			JspWriterUtils.write(
					getJspContext().getOut(),
					STAG + TAG + getDynamicAttributesStringBuilder().toString() + ETAG
					);
		}
		recycle();
	}

}
