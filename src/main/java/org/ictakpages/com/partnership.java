package org.ictakpages.com;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class partnership 
{
	WebDriver driver;
	

	public partnership(WebDriver driver)
	{
		
		this.driver=driver;
	}
	public void pathtopartnership()
	{

		 JavascriptExecutor js=(JavascriptExecutor)driver;
		
		WebElement mem=driver.findElement(By.xpath("//a[contains(text(),' Memberships ')]"));
		  mem.click();
		  WebElement smemb=driver.findElement(By.xpath("//h6[text()=' Partnership ']"));
		  smemb.click();
		  driver.findElement(By.xpath("//button[text()='Register Here']")).click();
		  js.executeScript("window.scrollBy(0,400)","");
	}
	
	public void pfname(String name)
	{
		
		WebElement fn=driver.findElement(By.xpath("//input[@name='name']"));
		fn.sendKeys(name);
	   
		
		
	}
	public void pemail(String email)
	{
		
		WebElement ema=driver.findElement(By.xpath("//input[@placeholder=' Email']"));
		ema.sendKeys(email);
		
		
	}
	public void pphn(String phone)
	{
		
		WebElement ppnum=driver.findElement(By.xpath("//input[@name='phone']"));
		ppnum.sendKeys(phone);
		
		
	}
	public void paddress(String add)
	{
		WebElement padd=driver.findElement(By.xpath("//input[@name='address']"));
		padd.sendKeys(add);
		
		
	}
	public void poffspace(String sqfeet)
	{
		
		WebElement poff=driver.findElement(By.xpath("//input[@name='officeSpace']"));
		poff.sendKeys(sqfeet);
		
		
	}
	public void pfirm(String firm)
	{
		

		WebElement fm=driver.findElement(By.xpath("//input[@name='firm']"));
		fm.sendKeys(firm);
		
	}
	public void pdis(String dis)
	{
		
		WebElement dist=driver.findElement(By.xpath("//input[@name='district']"));
		dist.sendKeys(dis);
		
		
	}
	public void pemp(String count)
	{
		
		WebElement empc=driver.findElement(By.xpath("//input[@name='employeeCount']"));
		empc.sendKeys(count);
		
		
	}
	public void pbr(String brief)
	{
		WebElement br=driver.findElement(By.xpath("//textarea[@name='report']"));
		br.sendKeys(brief);
		
		
	}
	public void pexpects(String expect)
	{
		
		WebElement exe=driver.findElement(By.xpath("//textarea[@name='expect']"));
		exe.sendKeys(expect);
		
	}
	public void ppromoters(String promoters)
	{
	 
		WebElement pro=driver.findElement(By.xpath("//textarea[@name='profile']"));
		pro.sendKeys(promoters);
		
	}
	public void psendmess()
	{
		WebElement send=driver.findElement(By.xpath("//button[@value='Submit']"));
		send.click();

		
    }
	public boolean invalidname(String name)
	{
		
		WebElement fn=driver.findElement(By.xpath("//input[@name='name']"));
		fn.sendKeys(name);
		String val=fn.getAttribute("value");
		boolean expname=Pattern.matches("[a-zA-Z]+", val);
		return expname;
		
	}
	public boolean invemail(String email)
	{
		
		WebElement ema=driver.findElement(By.xpath("//input[@placeholder=' Email']"));
		ema.sendKeys(email);
		String valemail=ema.getAttribute("value");
		boolean expemail=Pattern.matches("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$", valemail);
		return expemail;
		
		
	}
	public boolean invpphn(String phone)
	{
		
		WebElement ppnum=driver.findElement(By.xpath("//input[@name='phone']"));
		ppnum.sendKeys(phone);
		String phnval=ppnum.getAttribute("value");
		boolean expphn=Pattern.matches("[0-9]{10}", phnval); 
		return expphn;
		
	}
	public boolean invaddress(String add)
	{
		WebElement padd=driver.findElement(By.xpath("//input[@name='address']"));
		padd.sendKeys(add);
		String addressval=padd.getAttribute("value");
		boolean expadd=Pattern.matches("[a-zA-Z0-9,.]", addressval);
		return expadd;
		
	}
	public boolean invoffspace(String sqfeet)
	{
		
		WebElement poff=driver.findElement(By.xpath("//input[@name='officeSpace']"));
		poff.sendKeys(sqfeet);
		String valsq=poff.getAttribute("value");
		boolean expsq=Pattern.matches("[0-9]+", valsq);
		return expsq;
	
	}
	public boolean invpfirm(String firm)
	{
		

		WebElement fm=driver.findElement(By.xpath("//input[@name='firm']"));
		fm.sendKeys(firm);
		String valdate=fm.getAttribute("value");
		boolean expdate=Pattern.matches("^(0?[1-9]|[12][0-9]|3[01])[\\/\\-](0?[1-9]|1[012])[\\/\\-]\\d{4}$", valdate);
		return expdate;
	
		
	}
	public boolean invpdis(String dis)
	{
		
		WebElement dist=driver.findElement(By.xpath("//input[@name='district']"));
		dist.sendKeys(dis);
		String valdis=dist.getAttribute("value");
		boolean expdis=Pattern.matches("[0-9]{6}", valdis);
		return expdis;

		
		
	}
	public boolean invpemp(String count)
	{
		
		WebElement empc=driver.findElement(By.xpath("//input[@name='employeeCount']"));
		empc.sendKeys(count);
		String valemp=empc.getAttribute("value");
		boolean expcount=Pattern.matches("[0-9]+", valemp);
		return expcount;
		
		
	}
	public boolean invpbr(String brief)
	{
		WebElement br=driver.findElement(By.xpath("//textarea[@name='report']"));
		br.sendKeys(brief);
		String valbrief=br.getAttribute("value");
		boolean expbrief=Pattern.matches("[a-zA-Z0-9,.]", valbrief);
		return expbrief;
		
		
		
	}
	public boolean invpexpects(String expect)
	{
		
		WebElement exe=driver.findElement(By.xpath("//textarea[@name='expect']"));
		exe.sendKeys(expect);
		String valexe=exe.getAttribute("value");
		boolean exepects=Pattern.matches("[a-zA-Z0-9,.]", valexe);
		return exepects;
		
	}
	public boolean invppromoters(String promoters)
	{
	 
		WebElement pro=driver.findElement(By.xpath("//textarea[@name='profile']"));
		pro.sendKeys(promoters);
		String valpro=pro.getAttribute("value");
		boolean exepro=Pattern.matches("[a-zA-Z0-9,.]", valpro);
		return exepro;
		
	}
	/*public boolean submit()
	{
	   
		WebElement sub=driver.findElement(By.xpath("//button[@value='Submit']"));
        sub.click();
		String message=sub.getText();
		boolean val;
		if (message.equals("Registration Successful"))
		{
		boolean val=true;
		return val=true;
			
		}
		else
		{
			val=false;
		return val=false;
		}
		
		
		
	}*/
	
	
	
}
