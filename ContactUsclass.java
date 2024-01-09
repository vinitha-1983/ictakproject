package ictakwebsiteproject;

import org.ictakproject.pages.ContactUspage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ContactUsclass extends Testbase
{
  ContactUspage contactobject=null;
  
@BeforeClass  

  public void beforeclass()
  {
	contactobject=new ContactUspage(driver);  
  }
  
@Test(priority=-1)

   public void ContactUs() throws InterruptedException
    {
	
	contactobject.clickcontact();
    }

@Test(priority=0)
   public void checkphonenumber() throws InterruptedException
   {
	
	String act_num=contactobject.phoneNumber();
	Assert.assertEquals(act_num, "+91-471-2700811");
	System.out.println("phone_number is " +act_num);
   }

@Test(priority=1)

   public void checkemail() throws InterruptedException
   {
	
	String act_email=contactobject.email();
	Assert.assertEquals(act_email, "dm@ictkerala.org");
	System.out.println("email is "+act_email);
   }

@Test(priority=2)
   
   public void testaddress() throws InterruptedException
   {
   	String act_address=contactobject.address();
   	Assert.assertEquals(act_address, "G1 Ground Floor Thejaswini Building Technopark Thiruvananthapuram Kerala India");
   	System.out.println("address is "+act_address);
   }
	
}
 

