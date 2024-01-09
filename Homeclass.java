package ictakwebsiteproject;

import org.ictakproject.pages.Homepage;
import org.project.constants.Automationconstants;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Homeclass extends Testbase
{
 
 Homepage loadobj=null;
 
@Test
public void Homepage() throws Throwable
  {
	loadobj= new Homepage(driver);
	String actlHomeurl=loadobj.Homepagemenu();
	System.out.println(actlHomeurl);
	Assert.assertEquals(actlHomeurl, Automationconstants.Homeurl);
	
	String actlAbouturl=loadobj.Aboutmenu();
	System.out.println(actlAbouturl);
	Assert.assertEquals(actlAbouturl, Automationconstants.AboutUsurl);
	
	String actlCoursesurl=loadobj.Coursesmenu();
	System.out.println(actlCoursesurl);
	Assert.assertEquals(actlCoursesurl, Automationconstants.Coursesurl);
	//loadobj.Membershipmenu();
	//String actlMembershipurl=driver.getCurrentUrl();
	//System.out.println(actlMembershipurl);
	//Assert.assertEquals(actlMembershipurl, Automationconstants.Membershipurl);
	//loadobj.Eventsmenu();
	//String actlEventsurl=driver.getCurrentUrl();
	//System.out.println(actlEventsurl);
	//Assert.assertEquals(actlEventsurl, Automationconstants.Eventsurl);
	
	String actlContactUsurl=loadobj.ContactUsmenu();
	System.out.println(actlContactUsurl);
	Assert.assertEquals(actlContactUsurl, Automationconstants.ContactUsurl);
	
  }
}
