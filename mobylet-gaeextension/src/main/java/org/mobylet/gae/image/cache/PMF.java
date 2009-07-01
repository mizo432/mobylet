package org.mobylet.gae.image.cache;

import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManagerFactory;

public final class PMF {

	private static final PersistenceManagerFactory pmfInstance =
		JDOHelper.getPersistenceManagerFactory("transactions-optional");

	private PMF() {}

	public static PersistenceManagerFactory get() {
		return pmfInstance;
	}

	public static PersistenceManagerFactory create() {
		return JDOHelper.getPersistenceManagerFactory("transactions-optional");
	}

}
