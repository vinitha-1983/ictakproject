package web.ictak.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import web.ictak.constants.AutomationConstants;
public class AboutUs{
    WebDriver driver;
@FindBy(xpath="//a[contains(text(),'About Us')]") 
WebElement about;
public AboutUs(WebDriver driver){

        // TODO Auto-generated constructor stub
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }
	public void Aboutus()
	{
		about.click();

	}
}
