package org.ictakproject.pages;

import java.time.Duration;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Memberships 
{
	WebDriver driver;
	
	@FindBy(xpath="//a[contains(text(),' Memberships ')]")
	WebElement Membership;
	
	@FindBy(xpath="//h6[contains(text(),' Corporate Membership ')]")
	WebElement menuoption;
	
	@FindBy(xpath="//button[contains(text(),'Register Here')]")
	WebElement corporateRegisterclick;
	
	@FindBy(xpath="//input[@type='text'and@name='name']")
	WebElement name;
	
	@FindBy(xpath="//input[@type='text'and@name='address']")
	WebElement address;
	
	@FindBy(xpath="//input[@type='text'and@name='head']")
	WebElement ho;
	
	@FindBy(xpath="//input[@type='text'and@name='nature']")
	WebElement no;
	
	@FindBy(xpath="//input[@type='text'and@name='website']")
	WebElement web;
	
	@FindBy(xpath="//select[@formcontrolname='typeof']")
	WebElement tOC;

	@FindBy(xpath="//input[@type='text'and@name='identityNo']")
	WebElement cin;
	
	@FindBy(xpath="//input[@type='text'and@name='GST']")
	WebElement gst;
	
	@FindBy(xpath="//input[@name='nameofContact']")
	WebElement Pocname;
	
	@FindBy(xpath="//label[contains(text(),'Mobile Number')]//parent::Div//following-sibling::Div//child::input")
	WebElement PocMobNum;
	
	@FindBy(xpath="//input[@type='text'and @name='TechnicalSkill']")
	WebElement PocTS;
	
	@FindBy(xpath="//input[@type='text'and @formcontrolname='email' ]")
	WebElement Pocemail;
	
	@FindBy(xpath="//input[@type='text'and @name='employeeCount' ]")
	WebElement POCempcount;
	
	@FindBy(xpath="//span[@class='ng-arrow-wrapper']")
	WebElement collaborate;
	
	@FindBy(xpath="//span[text()='Fresher hiring']")
	WebElement Fresherhiring;
	
	@FindBy(xpath="//input[@formcontrolname='details']")
	WebElement activitydetails;
	
	@FindBy(css="input[id='flexSwitchCheckDefault']")
	WebElement clickchckbox;

	
	@FindBy(xpath="//input[@type='submit' and @value='REGISTER']")
	WebElement Register;
	
	
	public Memberships(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public String clickMembership() throws InterruptedException
	{
		
		Actions builder=new Actions(driver);
		builder.moveToElement(Membership).build().perform();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h6[contains(text(),' Corporate Membership ')]")));
		menuoption.click();
		return driver.getCurrentUrl();
	}
	
	
	public String clickcorporateRegister()
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(corporateRegisterclick));
		corporateRegisterclick.click();
		return driver.getCurrentUrl();
	}
	
	
	                                  
//********************************************************************************************************************************
	                        //Corporate Register Form Filling Functionalities
	
	
	
	public boolean setName(String Name) throws InterruptedException                           //To set up the name
	{
		name.clear();
		name.sendKeys(Name);
        String validname=name.getAttribute("value");
        boolean expCorName=Pattern.matches("^[a-zA-Z\\s]*$", validname);
        return expCorName;
		
	}
	public void setAddress(String Address) throws InterruptedException                       //To set up address
	{
		address.clear();
		address.sendKeys(Address);
		
			
	}
	public boolean setHO(String HeadOfOrg) throws InterruptedException                        //To set up Head of Organisation
	{
		ho.clear();
		ho.sendKeys(HeadOfOrg);
		String ValidHeadofOrg=ho.getAttribute("value");
		boolean expHO=Pattern.matches("^[a-zA-Z\\s]*$", ValidHeadofOrg);
		return expHO;
		
	}
	public boolean setNO(String NatureOfOrg) throws InterruptedException                       //To set up nature of organisation
	{
		no.clear();
		no.sendKeys(NatureOfOrg);
		String ValidNatureofOrg=no.getAttribute("value");
		boolean expNO=Pattern.matches("^[a-zA-Z\\s]*$", ValidNatureofOrg);
		return expNO;
	}
	public boolean setwebsiteurl(String Website) throws InterruptedException                    //To set up website URL
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
		wait.until(ExpectedConditions.visibilityOf(web));
		web.clear();
		web.sendKeys(Website);
		String websitefield=web.getAttribute("value");
		Pattern ptrn=Pattern.compile("^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}");  
		Matcher match = ptrn.matcher(websitefield); 
		boolean iswebsitefield=match.find() && match.group().equals(websitefield);;
		return (iswebsitefield); 
		

	}
	public boolean setTOC() throws Exception                                                    //To set Type of Company
	{
		Select companytype = new Select(tOC);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1000));
		wait.until(ExpectedConditions.visibilityOf(tOC));
		boolean ismultiple=companytype.isMultiple();
		if (ismultiple)
		{
			companytype.selectByIndex(1);
			companytype.selectByValue("Quasi-Govt");
			
		}
		else
		{
			companytype.selectByValue("3: Quasi-Govt");
			
		}
		return ismultiple;
	}

	public boolean setCIN(String CIN) throws Exception                                        //To set Corporate Identify Number
	{
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.visibilityOf(cin));
	cin.clear();
	cin.sendKeys(CIN);
	String Cinfield=cin.getAttribute("value");
	Pattern ptrn=Pattern.compile("^[0-9]{2}[A-Z]{5}[0-9]{4}[A-Z]{1}[1-9A-Z]{1}Z[0-9A-Z]{1}$");  
	Matcher match = ptrn.matcher(Cinfield); 
	boolean isCinvalid=match.find() && match.group().equals(Cinfield);
	return (isCinvalid);
	
	}
	public boolean setGST(String GST) throws InterruptedException                            //To set up GST
	{ 
    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
 	wait.until(ExpectedConditions.visibilityOf(gst));	
	gst.clear();
	gst.sendKeys(GST);
	String Gstfield=gst.getAttribute("value");
	Pattern ptrn=Pattern.compile("^[0-9]{2}[A-Z]{5}[0-9]{4}[A-Z]{1}[1-9A-Z]{1}Z[0-9A-Z]{1}$");  
	Matcher match = ptrn.matcher(Gstfield); 
	boolean isGstvalid=match.find() && match.group().equals(Gstfield);
	return (isGstvalid);
	
	}
	//**************************************************POINT OF CONTACTS***********************************************************
	
	
	
	
		public boolean setPocName(String POCName) throws Exception
		{
			
			Pocname.clear();
			Pocname.sendKeys(POCName);
            String validname=Pocname.getAttribute("value");
            boolean expname=Pattern.matches("[a-zA-Z]+", validname);
            return expname;
		}
		public boolean setPocMobileNum(String POCMN)
		{
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
     		wait.until(ExpectedConditions.visibilityOf(PocMobNum));
     		PocMobNum.clear();
     		PocMobNum.sendKeys(POCMN);
     		String phfield=PocMobNum.getAttribute("value");
     		Pattern ptrn=Pattern.compile("(0/91)?[7-9][0-9]{9}");  
     		Matcher match = ptrn.matcher(phfield); 
     		boolean isphnumvalid=match.find() && match.group().equals(phfield);
     		return (isphnumvalid);
		}
		public boolean setPocTechnicalskill(String POCTS)
		{
		 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
     	 wait.until(ExpectedConditions.visibilityOf(PocTS));	
		 PocTS.clear();
		 PocTS.sendKeys(POCTS);
		 String POCT_skill=PocTS.getAttribute("value");
         boolean expTechnicalSkill=Pattern.matches("[a-zA-Z]+", POCT_skill);
         return expTechnicalSkill;
		 
		}
		public boolean setPocEmail(String POCEMAIL)
		{
		 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
	     wait.until(ExpectedConditions.visibilityOf(Pocemail));
		 Pocemail.clear();
		 Pocemail.sendKeys(POCEMAIL);
     	 String validPocemail=Pocemail.getAttribute("value");
     	 boolean expPocemail=Pattern.matches("[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$", validPocemail);
     	 return expPocemail;
		}
		public void setPocEmployeeCount(String POCEC)
		{
		 POCempcount.clear();
		 POCempcount.sendKeys(POCEC);
		
		}
		public void setcollaborate(String text) throws InterruptedException 
		{
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1000));
			wait.until(ExpectedConditions.visibilityOf(collaborate));
			collaborate.click();
			WebElement Fresherhiring=driver.findElement(By.xpath("//span[text()='"+text+"']"));
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(50));
			wait1.until(ExpectedConditions.visibilityOf(Fresherhiring));
	        Fresherhiring.click();
			
		 }
		 
		public void setNpp() throws InterruptedException
		{
			
			 Select patents = new Select(driver.findElement(By.xpath("//select[@formcontrolname='patents']")));
		     if (patents.isMultiple())
		       {
		         patents.selectByIndex(3);
		         patents.selectByValue("1: 1-10");
		       }
		     else
		       {
		         System.out.println("Multiple selection is not possible");
		       }
		     Thread.sleep(100);
		     patents.selectByValue("1: 1-10");
		     Thread.sleep(100);
		     Select companytype2 = new Select(driver.findElement(By.xpath("//select[@formcontrolname='patents']")));
		     companytype2.selectByIndex(2);
			
		}
		public void setPocAVGHiring() throws InterruptedException
		{
			 Select hire = new Select(driver.findElement(By.xpath("//select[@formcontrolname='hire']")));
		        if (hire.isMultiple())
		        {
		            hire.selectByIndex(3);
		            hire.selectByValue("4: 31-40");
		        }
		        else
		        {
		            System.out.println("Multiple selection is not possible");
		        }
		        Thread.sleep(500);
		        hire.selectByValue("2: 11-20");
		        Thread.sleep(500);
		        Select companytype2 = new Select(driver.findElement(By.xpath("//select[@formcontrolname='hire']")));
		        companytype2.selectByIndex(5);
			
		}
		
		public void Details(String details) throws InterruptedException
		{
		activitydetails.clear();
		activitydetails.sendKeys(details);
		Thread.sleep(500);
		}
		
		public void clickcheckbox()
	    {
	        //WebElement clickchckbox=driver.findElement(By.cssSelector(""));
	        if(clickchckbox.isSelected())
	        {
	            System.out.println("ALready selected");
	        }
	        else
	        {
	            clickchckbox.click();
	        }
	    }

		
//********************************************************************************************************************************		

                                                //To click the register button
		
		public boolean clickRegister() throws InterruptedException
		{
			
			boolean isenabled=Register.isEnabled();
			if(isenabled)
			{
			  Register.click();
			  Alert alt = driver.switchTo().alert();
			  alt.accept();
			}
			return isenabled;
		}

}
