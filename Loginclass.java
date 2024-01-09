package ictakwebsiteproject;

//import java.io.File;
//import java.io.IOException;
//import java.util.HashMap;
//import java.util.Map;
//import org.apache.commons.io.FileUtils;
import org.ictakproject.pages.Loginpage;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
import org.project.constants.Automationconstants;
import org.testng.Assert;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Loginclass extends Testbase
{
	
 Loginpage obj=null;
 
 //WebDriver driver;
 //final String expFinalName="ExcelSheet.xlsx";
 //final String downloadLoctn="C:\\Users\\DELL\\Downloads\\exceldwnld";
 
 
 //@BeforeTest
 
 /*public void clearFolder() throws IOException
 {
	 File directory=new File(downloadLoctn);
	 FileUtils.cleanDirectory(directory);
 }*/
 
 @Test(priority=1)
 
 public void ValidTestcase() throws InterruptedException
 {
	 obj=new Loginpage(driver);
	 obj.clickLogin();
	 obj.setAdminusername("superadmin");
	 obj.setAdminpassword("12345");
	 obj.signin();
	 obj.CorporateMembershipclick();
	 obj.buttondownload();
	 obj.adminbutton();
	 obj.clicklogout();	  
 }
 
 //@Test(priority=1)
 /*public void corporatedownload() throws Throwable
 {
	 ChromeOptions options=new ChromeOptions();
	 Map<String,Object>prefs=new HashMap<>();
	 prefs.put("download.default_directory", downloadLoctn);
	 options.setExperimentalOption("prefs", prefs);
	 obj.buttondownload();
	 obj.adminbutton();
	 obj.clicklogout(); 
 }/*
                        //************Negative Test Case******************///
 
 @Test(priority=2)
	public void setwrongpass() throws InterruptedException 
	{
		obj=new Loginpage(driver);
		obj.clickLogin();
		obj.setAdminusername("superadmin");
		obj.setAdminpassword("5689");
		Assert.assertTrue(obj.signin(),"Register button is disabled");
		Assert.assertEquals(obj.warningMsg1(), Automationconstants.warningMsg1);
		Assert.assertEquals(obj.warningMsg2(), Automationconstants.warningMsg2);
		obj.login_warning_click();;
		
	}
 
 @Test(priority=3)
     public void setWrong_uname() throws InterruptedException
     {
	   obj=new Loginpage(driver);
	   obj.clickLogin();
	   obj.setAdminusername("superadmin123");
	   obj.setAdminpassword("12345");
	   Assert.assertTrue(obj.signin(),"Register button is disabled");
     }
 
 @Test(priority=4)
     public void setBlank_uname_passwd() throws Exception
     {
	   obj=new Loginpage(driver);
	   obj.clickLogin();
	   obj.setAdminusername("");
	   obj.setAdminpassword("");
	   Assert.assertEquals(obj.uname_err_msg(), Automationconstants.exp_uname_err_msg);
	   Assert.assertEquals(obj.password_err_msg(), Automationconstants.exp_psswd_err_msg);
	   Assert.assertTrue(obj.signin(),"Register button is disabled");
     }
 
}
