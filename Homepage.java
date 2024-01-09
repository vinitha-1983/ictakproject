package org.ictakproject.pages;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Homepage 
{
	WebDriver driver;
	@FindBy(xpath="//a[contains(text(),'Home')]")
	
	WebElement Home;
	
	@FindBy(xpath="//a[contains(text(),' About Us ')]")
	WebElement About;
	
	@FindBy(xpath="//a[contains(text(),' Courses ')]")
	WebElement Courses;
	
	@FindBy(xpath="//a[contains(text(),' Contact Us ')]")
	WebElement ContactUs;
	
	//@FindBy(xpath="//a[contains(text(),' Courses ')]")
	//WebElement Membership;
	
	//@FindBy(xpath="//a[contains(text(),' Courses ')]")
	//WebElement Events;
	
	
	
	public Homepage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
		public String Homepagemenu()
		{
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(100));
	        wait.until(ExpectedConditions.visibilityOf(Home));
			Home.click();
			return driver.getCurrentUrl();
			
		}
		public String Aboutmenu() 
		{
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(100));
	        wait.until(ExpectedConditions.visibilityOf(About));
			About.click();
			return driver.getCurrentUrl();
			//driver.navigate().back();
	        
		}
		public String Coursesmenu() throws InterruptedException
		{
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(100));
	        wait.until(ExpectedConditions.visibilityOf(Courses));
			Courses.click();
			return driver.getCurrentUrl();
		
			//driver.navigate().back();
		}
		
		 // @throws InterruptedException
		 
		 /**public void Membershipmenu() throws InterruptedException
		{
			Membership.click();
			//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(100));
	        //wait.until(ExpectedConditions.visibilityOf(Membership));
			wait(1000);
			driver.navigate().back();
		}
		public void Eventsmenu()
		{
			Events.click();
			//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(100));
	        // wait.until(ExpectedConditions.visibilityOf(Events));
			try
			{
				wait(1000);
			} 
			catch (InterruptedException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver.navigate().back();
		}*/
		public String ContactUsmenu()
		{
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(100));
	        wait.until(ExpectedConditions.visibilityOf(ContactUs));
			ContactUs.click();
			return driver.getCurrentUrl();
		}
				
}
