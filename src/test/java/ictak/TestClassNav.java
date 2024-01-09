package ictak;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import web.ictak.constants.AutomationConstants;
import web.ictak.pages.HomeNavigation;

public class TestClassNav extends TestBase{
	HomeNavigation loadobj=null;
	 
	@Test
	public void Homepage() throws Throwable
	  {
	    loadobj= new HomeNavigation(driver);
	    String actlAbouturl=loadobj.AboutUs();
	    System.out.println(actlAbouturl);
	    Assert.assertEquals(actlAbouturl, AutomationConstants.expAboutUsurl);

	    String actlCoursesurl=loadobj.Courses();
	    System.out.println(actlCoursesurl);
	    Assert.assertEquals(actlCoursesurl, AutomationConstants.expCoursesurl);

	    String actlContactUsurl=loadobj.ContactUs();
	    System.out.println(actlContactUsurl);
	    Assert.assertEquals(actlContactUsurl, AutomationConstants.expContactUsurl);
//Login
        driver.findElement(By.cssSelector("a[data-bs-toggle='modal'] ")).click();  
        Assert.assertFalse(driver.findElement(By.cssSelector("a[data-bs-toggle='modal'] ")).isSelected());  
        driver.close();
	  }
	
	
	
}