package ictak;

import org.testng.annotations.Test;

import web.ictak.constants.AutomationConstants;
import web.ictak.pages.AboutUs;

public class TestClassAbout  extends TestBase{
	AboutUs obja=null;
	@Test
	public void aboutus()
	{	
		obja=new AboutUs(driver);
		obja.Aboutus();
	}
}
