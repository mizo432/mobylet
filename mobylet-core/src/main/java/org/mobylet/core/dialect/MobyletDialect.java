package org.mobylet.core.dialect;

import org.mobylet.core.Carrier;

public interface MobyletDialect {

	public String getCharsetName(Carrier carrier);

}