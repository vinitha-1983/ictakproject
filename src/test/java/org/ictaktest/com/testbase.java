package org.ictaktest.com;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class testbase 
{
	WebDriver driver;
 public static Properties prop1=null;
 @BeforeTest
   public void setup() throws IOException
   {
	   
	   prop1= new Properties();
	   FileInputStream ip=new FileInputStream("C:\\Users\\renju\\OneDrive\\Desktop\\java pjt\\ictakwebsite\\src\\test\\resources\\config.properties");
	   prop1.load(ip);
	   String optbrowser=prop1.getProperty("browser");
	   if(optbrowser.equals("chrome"))
	   {
        
		   driver=new ChromeDriver();
		   
		   
	   }
	   else
	   {
		   driver=new FirefoxDriver();
		   
	   }
	   driver.get(prop1.getProperty("url"));
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   driver.manage().window().maximize();
	   
	   
	   
   }
 @AfterTest
 public void closebrowser()
 {
	 driver.quit();
	 
 }
 
	
}
