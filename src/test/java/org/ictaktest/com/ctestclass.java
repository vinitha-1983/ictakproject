package org.ictaktest.com;
import org.ictakpages.com.courses;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ctestclass extends testbase
{
	 courses cou_obj=null;
     SoftAssert softAssert = new SoftAssert();
	@Test
	public void tccou() throws InterruptedException
	{
		cou_obj=new courses(driver);
		cou_obj.pathtocourses();
		cou_obj.dropdownlist();
		cou_obj.registerbutton();
		cou_obj.cname("vinitha");
		cou_obj.cemail("vinitha@gmail.com");
		cou_obj.cpnum("7510296437");
		cou_obj.coursefees("300");
		cou_obj.csubmit();
		driver.switchTo().alert().accept();	
		
	}
	@Test
	public void tcinvalid()
	{
		
		cou_obj=new courses(driver);
		cou_obj.pathtocourses();
		cou_obj.dropdownlist();
		cou_obj.registerbutton();
		boolean actual_name= cou_obj.invname("123");
	    softAssert.assertTrue(actual_name, "Only alphabtes is allowed");
	    boolean actual_email=cou_obj.invemail("awe$1@test");
	    softAssert.assertTrue(actual_email,"Please enter valid mail");
	    boolean actual_phone=cou_obj.invphone("2436879");
	    softAssert.assertTrue(actual_phone,"Please enter valid phone number");
	    boolean actual_cfees=cou_obj.invcoufee("asd");
	    softAssert.assertTrue(actual_cfees,"Please enter numbers");
	    softAssert.assertAll();
	    
		
		
	}
	
	
}
