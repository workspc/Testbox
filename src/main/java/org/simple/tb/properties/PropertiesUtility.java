package org.simple.tb.properties;

import static org.simple.mu.properties.Configuration.CONFIG;

/**
 * You need to set the following argument to get the right message.
 * <ul>
 * <li>-Dcore.file.name=sandbox.properties (Default properties file)
 * </ul>
 * 
 * @author Gagandeep Singh
 * @since 19-AUG-2017 1.0
 * @version 1.0
 */
public class PropertiesUtility {

	public String getMessage() {
		System.setProperty("core.file.name", "sandbox.properties");
		return CONFIG.get().getString("welcome.message");
	}
}
