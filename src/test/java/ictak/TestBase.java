package ictak;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop=null;

	@BeforeTest
	public void setup() throws IOException
	{
		prop=new Properties();
		FileInputStream ip=new FileInputStream("D:\\Users\\prasoona\\eclipse-workspace\\NewProjectICTAK\\config.properties");
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
		
		driver.get(prop.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}
}