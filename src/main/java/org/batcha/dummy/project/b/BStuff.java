package org.batcha.dummy.project.b;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.batcha.dummy.project.a.AStuff;
import org.batcha.dummy.project.a.ProjectAAPI;

public class BStuff implements ProjectBAPI {
	
	private Log logger = LogFactory.getLog(BStuff.class);

	@Override
	public String typicalBStuff(String arg) {
		logger.debug("B Stuff need A!");
		ProjectAAPI api = new AStuff();		
		return api.typicalAStuff(arg); 
	}

}
