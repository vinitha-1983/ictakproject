package ictak;

import org.testng.Assert;
import org.testng.annotations.Test;

import web.ictak.constants.AutomationConstants;
import web.ictak.pages.LoginCorporateMembership;
import web.ictak.pages.LoginCourseRegistration;
import web.ictak.pages.LoginPage;
import web.ictak.pages.LoginPartnership;

public class TestClassLogin extends TestBase{

	LoginPage obj=null;
    LoginCorporateMembership obj1=null;
	LoginPartnership obj2=null;

@Test(priority=1)
public void ValidTestcase() throws InterruptedException
{
    obj=new LoginPage(driver);
    obj.LoginBtn();
    obj.setUsername("superadmin");
    obj.setPassword("12345");
    boolean act_value=obj.signin();
    Assert.assertTrue(act_value,"sign in enabled");
    
//    obj1.Logincorporate();
//    obj1.Corporatedownload();
//    obj2.NavCtrl();
//    obj2.Logout();
}
                       //**Negative Test Cases**//
@Test(priority=2)
public void InValidTestcase() throws InterruptedException
{
    obj=new LoginPage(driver);
    obj.LoginBtn();
    obj.setUsername("superadmin2");
    obj.setPassword("1234");
    Assert.assertTrue(obj.signin(),"Register button is disabled");
}
@Test(priority=3)
   public void setwrongpass() throws InterruptedException 
   {
       obj=new LoginPage(driver);
       obj.LoginBtn();
       obj.setUsername("superadmin");
       obj.setPassword("123");
       Assert.assertTrue(obj.signin(),"Register button is disabled");
       Assert.assertEquals(obj.warningMsg1(), AutomationConstants.warningMsg1);
       Assert.assertEquals(obj.warningMsg2(), AutomationConstants.warningMsg2);
       obj.login_warning_click();;

   }

@Test(priority=4)
    public void setWrong_uname() throws InterruptedException
    {
      obj=new LoginPage(driver);
      obj.LoginBtn();
      obj.setUsername("superadminn");
      obj.setPassword("12345");
      Assert.assertTrue(obj.signin(),"Register button is disabled");
    }

@Test(priority=5)
    public void setBlank_uname_passwd() throws Exception
    {
      obj=new LoginPage(driver);
      obj.LoginBtn();
      obj.setUsername("");
      obj.setPassword("");
      Assert.assertEquals(obj.uname_err_msg(), AutomationConstants.exp_uname_err_msg);
      Assert.assertEquals(obj.password_err_msg(), AutomationConstants.exp_psswd_err_msg);
      Assert.assertTrue(obj.signin(),"Register button is disabled");
    }







}
