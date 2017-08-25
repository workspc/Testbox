package org.simple.tb.properties;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.simple.tb.properties.PropertiesUtility;

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
public class PropertiesUtilityTest {

	PropertiesUtility propertiesUtility;

	@Before
	public void setup() {
		propertiesUtility = new PropertiesUtility();
	}

	@Test
	public void testUtility() {
		Assert.assertEquals("Unable to get the correct property", "Hello using it through utility",
				propertiesUtility.getMessage());
	}
}