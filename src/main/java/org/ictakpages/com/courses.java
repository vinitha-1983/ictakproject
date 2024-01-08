package org.ictakpages.com;
import java.util.regex.Pattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class courses 
{

	WebDriver driver;
	@FindBy(xpath="//a[@id='dropdownMenuBlocks']")
	WebElement pathtocourses;
	@FindBy(xpath="//span[text()='FULL TIME']")
	WebElement dropdownlist;
	@FindBy(xpath="//button[contains(text(),'Apply Now')]")
	WebElement registerbutton;
	@FindBy(name="name")
	WebElement cname;
	@FindBy(xpath="//input[@placeholder='Email']")
	WebElement cemail;
	@FindBy(xpath="//input[@placeholder='Number']")
	WebElement cpnum;
	@FindBy(name="courseAmount")
	WebElement coursefees;	
	@FindBy(xpath="//button[text()='Register']")
	WebElement csubmit;
	@FindBy(name="name")
	WebElement invname;
	@FindBy(xpath="//input[@placeholder='Email']")
	WebElement invemail;
	@FindBy(xpath="//input[@placeholder='Number']")
	WebElement invphone;
	@FindBy(name="courseAmount")
	WebElement invcoufee;
	public courses(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	public void pathtocourses()
	{
		
		pathtocourses.click();
	}
	public void dropdownlist()
	{
		dropdownlist.click();
	}
	public void registerbutton()
	{
		registerbutton.click();
		  
		
	}
	public void cname(String name)
	{
		
		
		cname.sendKeys(name);
		
	}
	public void cemail(String email)
	{
		
		
		cemail.sendKeys(email);
	}
	public void cpnum(String number)
	{
		
		
		cpnum.sendKeys(number);
	}
	/*public void coursename(String cname)
	{
		
		WebElement courname=driver.findElement(By.name("courseTitle"));
		
		
	}*/
	public void coursefees(String cfees)
	{
		
	
		coursefees.clear();
		coursefees.sendKeys(cfees);
	}
	
    public void csubmit()
    {
    	
    csubmit.click();
   
 
    }
    public boolean invname(String name)
	{
		
	  invname.sendKeys(name);
	  String val=invname.getAttribute("value");
	  boolean expname=Pattern.matches("[a-zA-Z]+", val);
	  return expname;
	  
	 }
    public boolean invemail(String email)
   	{
   		
   	  invemail.sendKeys(email);
   	  String val=invemail.getAttribute("value");
   	  boolean expemail=Pattern.matches("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$", val);
   	  return expemail;
   	  
   	 }
    public boolean invphone(String phone)
    {
    	  invphone.sendKeys(phone);
      	  String val=invphone.getAttribute("value");
      	  boolean expphone=Pattern.matches("[0-9]{10} ", val);
      	  return expphone;
    	
    }
    public boolean invcoufee(String fees)
    {
    	  invcoufee.sendKeys(fees);
      	  String val=invcoufee.getAttribute("value");
      	  boolean expcoufee=Pattern.matches("[0-9]+ ", val);
      	  return expcoufee;
    	
    }
}
