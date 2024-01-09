package web.ictak.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import web.ictak.constants.AutomationConstants;
import org.openqa.selenium.JavascriptExecutor;
import dev.failsafe.internal.util.Assert;

	public class ContactUs{
	    WebDriver driver;
@FindBy(xpath="//a[text()=' Contact Us ']") 
WebElement contact;

	public ContactUs(WebDriver driver){

	        // TODO Auto-generated constructor stub
	        this.driver=driver;
	        PageFactory.initElements(driver, this);
	    }

	    //Navigate to Contact Us Page
	    public void clickContactUs()
	    {
	    contact.click();
	    }

	    public void scrollpage()
	    {
	        JavascriptExecutor js=(JavascriptExecutor)driver;
	        js.executeScript("window.scrollBy(40,400)");

	    }

	    public String phoneNumber()
	    {
	        String number=driver.findElement(By.xpath("//i[@class='fas fa-phone text-sm']//following::span[1]")).getText();
	        return number;
	    }
	    public String email()
	    {
	        String mail=driver.findElement(By.xpath("//i[@class='fas fa-phone text-sm']//following::span[2]")).getText();
	        return mail;
	    }
	    public String address()
	    {
	        String add=driver.findElement(By.xpath("//i[@class='fas fa-phone text-sm']//following::span[3]")).getText();
	        return add;
	    }



	}
	
	

