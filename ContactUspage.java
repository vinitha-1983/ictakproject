package org.ictakproject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactUspage 
{
	WebDriver driver;
	
	public ContactUspage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void contact()
	{
		boolean contact_found=driver.findElement(By.xpath("//a[text()=' Contact Us ']")).isDisplayed();
		System.out.println("Element displayed is :"+contact_found);
	}

	
	public void clickcontact() throws InterruptedException
	{
		WebElement clickContact=driver.findElement(By.xpath("//a[contains(text(),' Contact Us ')]"));
		clickContact.click();
		Thread.sleep(500);
	}

	/*
	 * public void setfullname(String FullName) throws InterruptedException {
	 * WebElement Fullname=driver.findElement(By.
	 * xpath("//input[@placeholder='Full Name' and @type='text']"));
	 * Fullname.clear(); Fullname.sendKeys(FullName); Thread.sleep(500); }
	 * 
	 * public void setemailid(String EmailID) throws InterruptedException {
	 * WebElement Emailid=driver.findElement(By.
	 * xpath("//input[@placeholder='Email id' and @type='email']"));
	 * Emailid.clear(); Emailid.sendKeys(EmailID); Thread.sleep(500); }
	 * 
	 * public void setcourse(String CourseSelect) throws InterruptedException {
	 * WebElement Imlookingfor=driver.findElement(By.
	 * xpath("//input[@placeholder='What you love' and @type='text']"));
	 * Imlookingfor.clear(); Imlookingfor.sendKeys(CourseSelect); Thread.sleep(500);
	 * }
	 * 
	 * public void setmessage(String Yourmessage) throws InterruptedException {
	 * WebElement YourMessage=driver.findElement(By.
	 * xpath("//input[@placeholder='I want to say that...' and @id='message']"));
	 * YourMessage.clear(); YourMessage.sendKeys(Yourmessage); Thread.sleep(500); }
	 * 
	 * public void clicksendmessage() throws InterruptedException { WebElement
	 * sendmessagebutton=driver.findElement(By.
	 * xpath("//button[@type='submit' and text()='Send Message']"));
	 * sendmessagebutton.click(); Thread.sleep(500); }
	 */
	
	public String phoneNumber() throws InterruptedException
	{
		String number=driver.findElement(By.xpath("//i[@class='fas fa-phone text-sm']//following::span[1]")).getText();
		Thread.sleep(1000);	
		return number;
	}
	public String email() throws InterruptedException
	{
		String mail=driver.findElement(By.xpath("//i[@class='fas fa-phone text-sm']//following::span[2]")).getText();
		Thread.sleep(1000);	
		return mail;
	}
	public String address() throws InterruptedException
	{
		String add=driver.findElement(By.xpath("//i[@class='fas fa-phone text-sm']//following::span[3]")).getText();
		Thread.sleep(1000);	
		return add;
	}

	
}

