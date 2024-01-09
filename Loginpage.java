package org.ictakproject.pages;

import java.time.Duration;
import java.util.NoSuchElementException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Loginpage 
{
	WebDriver driver;
	
	@FindBy(xpath="//a[contains(text(),'Login')]")
	WebElement button;
	
	@FindBy(xpath="//input[@placeholder='Enter Your Email']")
	WebElement username;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement password;
	
	@FindBy(xpath="//button[contains(text(),'Sign in')]")
	WebElement buttons;
	
	@FindBy(xpath="//div[@class='swal2-actions']//child::button[contains(text(),'OK')]")
	WebElement clickOK;
	
	@FindBy(xpath="//a[@href='/adminpage/corporate']")
	WebElement corpbutton;
	
	@FindBy(xpath="//button[@target='_blank' and @style='cursor: pointer;']")
	WebElement downloadcorporate;
	
	@FindBy(xpath="//a[@aria-controls='ProfileNav']")
	WebElement Adminbutton;
	
	@FindBy(xpath="//div[@id='ProfileNav']//child::a")
	WebElement logoutmenu;
	
	@FindBy(xpath="//input[@placeholder='Enter Your Email']//following-sibling::small")
	WebElement uname_err;
	
	@FindBy(xpath="//input[@name='password']//following-sibling::small")
	WebElement passwd_err;

	
	
	public Loginpage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickLogin() throws InterruptedException
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(button));
		button.click();
		
	}
	public void setAdminusername(String Username) throws InterruptedException
	{

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(username));
		username.clear();
		username.sendKeys(Username);

	}
	
	public void setAdminpassword(String Password) throws InterruptedException
	{	
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(password));
		password.clear();
		password.sendKeys(Password);
		
	}
	
	public boolean signin()
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(buttons));
		boolean signInvalue=buttons.isEnabled();
		if(buttons.isEnabled())
		{
			buttons.click();
		 	
		}
		
		return signInvalue;
	
	}
	public void CorporateMembershipclick() throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(corpbutton));
		corpbutton.click();	
	}
	
	public void buttondownload() throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(downloadcorporate));
		downloadcorporate.click();
	}
	/*
	 * public void viewexcelsheet() { options=webdriver.ChromeOptions(); }
	 */
	
	public void adminbutton() throws InterruptedException
	{  
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(Adminbutton));
	    Adminbutton.click();
	}
	
	public void clicklogout() throws InterruptedException
	{	
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(logoutmenu));
		logoutmenu.click();

	}
//**********************************************************************************************************
	                                   //warnings
	
	public String uname_err_msg() 
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(uname_err));
		String err_mail=uname_err.getText();
		return err_mail;
	}
	public String password_err_msg() 
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(passwd_err));
		String err_pass=passwd_err.getText();
		return err_pass;
	}
	public String warningMsg1()
	{
		String warngmsg1=driver.findElement(By.id("swal2-title")).getText();
		return warngmsg1;
	}
	public String warningMsg2()
	{
		String warngmsg2=driver.findElement(By.id("swal2-html-container")).getText();
		return warngmsg2;
	}
	
	public boolean warning()
	{
		boolean val=clickOK.isDisplayed();
		return val;
	}
    public boolean login_warning_click()
    {
    try
    	{
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(clickOK));
		clickOK.click();
		return true;
		
		} 
    catch(NoSuchElementException e)
       {
        return false;
       }
    }
    

}
