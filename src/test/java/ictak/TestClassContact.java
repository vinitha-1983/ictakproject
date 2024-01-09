package ictak;

import org.testng.annotations.Test;

import web.ictak.pages.ContactUs;
import org.testng.Assert;

public class TestClassContact extends TestBase
{

    ContactUs cd=null;      

   @Test(priority=0)
    public void testphonenclickContactUsNumber()
    {
        cd=new ContactUs(driver);
        cd.clickContactUs();
        cd.scrollpage();
    }

    @Test(priority=1)
    public void testnumber() 
    {
        cd=new ContactUs(driver);

        String act_num=cd.phoneNumber();
        Assert.assertEquals(act_num, "+91-471-2700811");
        System.out.println("phone_number is " +act_num);
    }
    @Test(priority=2)
    public void testemail() 
    {
        cd=new ContactUs(driver);

        String act_email=cd.email();
        Assert.assertEquals(act_email, "dm@ictkerala.org");
        System.out.println("email is "+act_email);
    }
    @Test(priority=3)
    public void testaddress()
    {
        cd=new ContactUs(driver);

        String act_address=cd.address();
        Assert.assertEquals(act_address, "G1 Ground Floor Thejaswini Building Technopark Thiruvananthapuram Kerala India");
        System.out.println("address is "+act_address);
    }
	
}	

	

