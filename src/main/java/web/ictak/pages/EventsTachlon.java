package web.ictak.pages;
import java.time.Duration;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EventsTachlon {
	
	WebDriver driver;
	
	@FindBy(xpath="//a[contains(text(),' Events ')]")
	WebElement Events;
	
	@FindBy(xpath="//h6[contains(text(),' Techathlon ')]")
	WebElement clickTac;
	
	@FindBy(xpath="//button[contains(text(),'Apply Now')]")
	WebElement Apply;
	
	@FindBy(name="name")
	WebElement name;
	
	@FindBy(xpath="//input[@placeholder='Email']")
	WebElement email;
	
	@FindBy(name="phoneno")
	WebElement phnum;
	
	@FindBy(xpath="//button[contains(text(),'Register')]")
	WebElement register;
	
	
	
	
	public EventsTachlon(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void clickEvents()
	{
	
		Events.click();
		
	}
	
	public String clickTac() 
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(clickTac));
		clickTac.click();
		return driver.getCurrentUrl();
	}
	
	public void clickApply() 
	{
		
		Apply.click();
		
	}
	public boolean setName(String uname)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(name));
		name.clear();
		name.sendKeys(uname);
		String namefield=name.getAttribute("value");
		Pattern ptrn=Pattern.compile("^[a-zA-Z]*$");  
		Matcher match = ptrn.matcher(namefield); 
		boolean isnamevalid=match.find() && match.group().equals(namefield);;
		return (isnamevalid); 
	}
	public boolean setEmail(String mail) 
	{
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(email));
		email.clear();
		email.sendKeys(mail);
		String emailfield=email.getAttribute("value");
		Pattern ptrn=Pattern.compile("^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}");  
		Matcher match = ptrn.matcher(emailfield); 
		boolean isemailvalid=match.find() && match.group().equals(emailfield);;
		return (isemailvalid); 
	}
	public boolean setNumber(String num) 
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(phnum));
		phnum.clear();
		phnum.sendKeys(num);
		String phfield=phnum.getAttribute("value");
		Pattern ptrn=Pattern.compile("(0/91)?[7-9][0-9]{9}");  
		Matcher match = ptrn.matcher(phfield); 
		boolean isphnumvalid=match.find() && match.group().equals(phfield);
		return (isphnumvalid);  
		
	}
	/*public boolean register()
	{
		boolean reg=register.isEnabled();
		return reg;
	}*/
	public boolean clickregister()
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(register));
		boolean isreg=register.isEnabled();
		if(isreg==true)
		{
			register.click();
			Alert alt = driver.switchTo().alert();
			alt.accept();
			
		}
		//System.out.println(isreg);
		return isreg;
	}

}
