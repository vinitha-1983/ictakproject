package ictakwebsiteproject;

import org.ictakproject.pages.Memberships;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class Membershipclass extends Testbase
{
	Memberships obj1=null;
	private SoftAssert softassert= new SoftAssert();
	
@Test(priority=1)

    public void Memberships() throws Exception
    {
	obj1=new Memberships(driver);
	String Currenturl=obj1.clickMembership();
	Assert.assertEquals(Currenturl, "http://64.227.132.109/LandingPage/corporate");
	System.out.println("CuurentURL" +Currenturl);
	obj1.clickcorporateRegister();
    }


@Test(priority=2)
public void ValidTestDatas() throws Exception                                          // Positive Test Cases
{

obj1.setName("VijayammaL");
obj1.setAddress("Lf2,block6,vrindhavan10,Nalanchira,Trivandrum");
obj1.setHO("ProductManager");
obj1.setNO("Product");
obj1.setwebsiteurl("www.ictak.com");
obj1.setTOC();
obj1.setCIN("356456");
obj1.setGST("555555555555555");
obj1.setPocName("InduVijayamma");
obj1.setPocMobileNum("8129876954");
obj1.setPocTechnicalskill("Software developing");
obj1.setPocEmail("indu@gmail.com");
obj1.setPocEmployeeCount("100");
//obj1.setcollaborate("Fresher hiring");
obj1.setNpp();
obj1.setPocAVGHiring();
obj1.Details("Live Project ICTAK");
obj1.clickcheckbox();
obj1.clickRegister();
}

@Test(priority=3)                                                 //  Negative Test Cases
                                                                  //invalid Test datas
public void InvalidTestData() throws Exception
{

boolean name=obj1.setName("VijayammaL5689");
softassert.assertTrue(name, "Invalid Name");
obj1.setAddress("hgjhgsjd66546847646413131");
boolean headofOrg=obj1.setHO("5hkjhk5646464");
softassert.assertTrue(headofOrg,"Invalid HO");
boolean NatureofOrg=obj1.setNO("%^^&*&*&*");
softassert.assertTrue(NatureofOrg,"Invalid NO");
boolean website=obj1.setwebsiteurl("wwwww.ictak.com.com.com");
softassert.assertTrue(website,"Invalid URL");
boolean TypeofCmpny=obj1.setTOC();
softassert.assertTrue(TypeofCmpny, "Invalid TOC");
boolean cinnum=obj1.setCIN("56hkk796");
softassert.assertTrue(cinnum, "Invalid CIN Number");
boolean gstnum=obj1.setGST("99999999999999");
softassert.assertTrue(gstnum, "Invalid GST Number");
boolean pocnam=obj1.setPocName("indu4667");
softassert.assertTrue(pocnam, "Invalid POC Name");
boolean mobNum=obj1.setPocMobileNum("812991695454223");
softassert.assertTrue(mobNum, "invalid Mobile Number");
boolean Techskills=obj1.setPocTechnicalskill("654656565656565");
softassert.assertTrue(Techskills, "Invalid Skill");
boolean mail=obj1.setPocEmail("lvijayamma@gmail@hotmail.com");
softassert.assertTrue(mail, "Check your email id");
obj1.setPocEmployeeCount("200");
//obj1.setcollaborate("Fresher hiring");
obj1.setNpp();
obj1.setPocAVGHiring();
obj1.Details("Live Project");
obj1.clickcheckbox();
obj1.clickRegister();
//softassert.assertTrue(regbutton, "Button Disabled");
}

@Test(priority=4)                                                                             //Blank Test Case

public void BlankTestdata() throws Exception
{

obj1.setName("");
obj1.setAddress("");
obj1.setHO("");
obj1.setNO("");
obj1.setwebsiteurl("");
obj1.setTOC();
obj1.setCIN("");
obj1.setGST("");
obj1.setPocName("");
obj1.setPocMobileNum("");
obj1.setPocTechnicalskill("");
obj1.setPocEmail("");
obj1.setPocEmployeeCount("");
obj1.setNpp();
obj1.setPocAVGHiring();
obj1.Details("");
obj1.clickcheckbox();
//obj1.clickRegister();
softassert.assertFalse(obj1.clickRegister(),"Register button is enabled");
}
}
