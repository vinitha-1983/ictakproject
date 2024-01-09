package web.ictak.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomeNavigation{
    WebDriver driver;
    @FindBy(xpath="//a[contains(text(),'About Us')]") 
    WebElement about;
    @FindBy(xpath="//a[contains(text(),' Courses ')]") 
    WebElement courses;
    @FindBy(xpath="//a[@routerlink='/LandingPage/contactus']") 
    WebElement contactus;
    @FindBy(xpath="//a[contains(text(),'Login')]")
    WebElement login;
public HomeNavigation(WebDriver driver){

        // TODO Auto-generated constructor stub
        this.driver=driver;
        PageFactory.initElements(driver, this);
}
	public String AboutUs()
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(200));
        wait.until(ExpectedConditions.visibilityOf(about));
		about.click();
		return driver.getCurrentUrl();
	}
	public String Courses()
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(100));
        wait.until(ExpectedConditions.visibilityOf(courses));
        courses.click();
		return driver.getCurrentUrl();
	}
	public String ContactUs()
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(100));
        wait.until(ExpectedConditions.visibilityOf(contactus));
        contactus.click();
		return driver.getCurrentUrl();
	}
	public String Login()
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(100));
        wait.until(ExpectedConditions.visibilityOf(login));
        login.click();
		return driver.getCurrentUrl();
	}
	
	
}
