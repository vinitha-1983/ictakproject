package ictak;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import web.ictak.constants.AutomationConstants;
import web.ictak.pages.EventsTachlon;

public class TestClassEventsTachlon extends TestBase{
	
	SoftAssert softassert1=new SoftAssert();
	SoftAssert softassert2=new SoftAssert();
	SoftAssert softassert3=new SoftAssert();
	
	@BeforeMethod
	public void set()
	{
		AutomationConstants.events=new EventsTachlon(driver);
	}
	
	@Test(priority=-1)
	public void clickEvent() throws InterruptedException
	{
	    
		AutomationConstants.events.clickEvents();
		String act_URL=AutomationConstants.events.clickTac();
		Assert.assertEquals(act_URL, AutomationConstants.events_Url);
		System.out.println("Events Tachlon URL is "+act_URL);
		AutomationConstants.events.clickApply();

	}
	

	@Test(priority=0)
	public void setdetailblank() throws InterruptedException
	{
		
		boolean act_name=AutomationConstants.events.setName("");
		softassert1.assertTrue(act_name,"Blank Name is invalid");
		boolean act_email=AutomationConstants.events.setEmail("");
		softassert1.assertTrue(act_email,"Blank Email is invalid");
		boolean act_num=AutomationConstants.events.setNumber("");
		softassert1.assertTrue(act_num,"Blank Number is invalid"); 
		AutomationConstants.events.clickregister();
		softassert1.assertAll();

		
	}
	@Test(priority=1)
	public void setdetailsvalid() throws InterruptedException
	{
		
		AutomationConstants.events.clickApply();
		 boolean act_name=AutomationConstants.events.setName("Ashlin George");
		 Assert.assertTrue(act_name,"Blank Name is invalid");
		 boolean act_email=AutomationConstants.events.setEmail("Ashlin_123@gmail.com");
		 Assert.assertTrue(act_email,"Blank Email is invalid");
		 boolean act_num=AutomationConstants.events.setNumber("8345672190"); 
		 Assert.assertTrue(act_num,"Blank Number is invalid");
		 AutomationConstants.events.clickregister();
		
		
	}
    @Test(priority=2)
	public void setdetailsinvalid_testcase_1() 
	{
		
    	boolean act_name=AutomationConstants.events.setName("Ash9lin");
    	 Assert.assertTrue(act_name,"Numbers are not allowed in Name field");
		 boolean act_email=AutomationConstants.events.setEmail("Ashlin123#test");
		 softassert2.assertTrue(act_email,"Invalid email"); 
		 boolean act_num=AutomationConstants.events.setNumber("83456721900123");
		 softassert2.assertTrue(act_num,"Number greater than 10 is invalid");  
		 softassert2.assertFalse(AutomationConstants.events.clickregister(),"Register button is enabled");
		 softassert2.assertAll();
	
	}
    
    @Test(priority=3)
    public void setdetailsinvalid_testcase_2()
    {
    	 
    	 AutomationConstants.events.clickApply();
 		 boolean act_name=AutomationConstants.events.setName("@Ashlin");
 		 softassert3.assertTrue(act_name,"Special characters are not allowed in Name field");
 		 boolean act_email=AutomationConstants.events.setEmail("Ashlin123gmail");
 		softassert3.assertTrue(act_email,"@ should be present between domain name and username"); 
 		 boolean act_num=AutomationConstants.events.setNumber("834567219");
 		softassert3.assertTrue(act_num,"Number less than 10 is invalid");  
 		softassert3.assertFalse(AutomationConstants.events.clickregister(),"Register button is enabled");
 		softassert3.assertAll();
    }


}

