package ictakwebsiteproject;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
//import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Testbase 
{
	public static WebDriver driver;
	public static Properties prop=null;
	
   @BeforeTest
   
   public void Loadpage() throws IOException
   {
	//driver=new ChromeDriver();
	//driver.get("http://64.227.132.109/");
	//driver.manage().window().maximize();
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	        prop=new Properties();
	        FileInputStream ip=new FileInputStream("C:\\Users\\DELL\\OneDrive\\Desktop\\ictakproject\\ICTAK_website_Project\\src\\test\\resources\\config.properties");
	        prop.load(ip);
	        String newBrowser=prop.getProperty("browser");
	        if(newBrowser.equalsIgnoreCase("Chrome"))
	        {
	            driver=new ChromeDriver();
	        }
	        else if(newBrowser.equalsIgnoreCase("Firefox"))
	        {
	            driver=new FirefoxDriver();
	        }
	        else if(newBrowser.equalsIgnoreCase("Edge"))
	        {
	        	driver=new EdgeDriver();
	        }
	        else if(newBrowser.equalsIgnoreCase("Safari"))
	        {
	        	driver=new SafariDriver();
	        }

	        driver.get(prop.getProperty("url"));
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        driver.manage().window().maximize();
	   
	        }
   
   
     }

