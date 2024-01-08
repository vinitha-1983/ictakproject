package org.ictakpages.com;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class home 
{
	WebDriver driver;
	
	@FindBy(xpath="//a[contains(text(),'Home')]")
	WebElement homepage;
	@FindBy(xpath="//a[contains(text(),'About Us')]")
	WebElement aboutus;
	@FindBy(xpath="//a[contains(text(),' Courses ')]")
	WebElement courses;		
	@FindBy(xpath="//a[contains(text(),'Memberships')]")
	WebElement membership;
	@FindBy(xpath="//a[contains(text(),'Events')] ")
	WebElement Events;
	@FindBy(xpath="//a[contains(text(),'Contact Us')] ")
	WebElement ContactUS;
	@FindBy(xpath="//a[text()='Login']")
	WebElement login;
	@FindBy(xpath="//a[contains(text(),' Courses ')]")
	WebElement courselist;
	@FindBy(xpath="//span[text()='FULL TIME']")
	WebElement listitem;	
	public home(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	
	}
	public String homepage()
	{
		homepage.click();
	    return driver.getCurrentUrl();
		

	}
	public String aboutus()
	{
		aboutus.click();
		return driver.getCurrentUrl();
	
	}
	public String courses()
	{
		
		courses.click();
        return driver.getCurrentUrl();

		
	}
	public String membership()
	{
		membership.click();
		return driver.getCurrentUrl();
	
	}

	public String Events()
	{
		Events.click();
		return driver.getCurrentUrl();

		
	}
	public String ContactUS()
	{

        ContactUS.click();
		return driver.getCurrentUrl();
		
		
	}
	public String login()
	{
		
		login.click();
	    return driver.getCurrentUrl();
	   
		
	}
	public void courselist()
	{
		courselist.click();
		
		//driver.findElement(By.xpath("//a[contains(text(),"+option+")]"));
	}
	public String listitem()
	{
	
	    String list= listitem.getText();
	    return list;

		
				
	}
	
	

}
