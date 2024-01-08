package org.ictaktest.com;
import org.ictakpages.com.home;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.constants.com.*;

public class testclass extends testbase
{
    home obj=null;
    
    @Test(priority=1)
    public void tchme() throws InterruptedException
    {
    	obj = new home(driver);
    	String actualhmurl=(String) obj.homepage();
    	Assert.assertEquals(actualhmurl, automationconstants.exphmurl);
    	Thread.sleep(3000);
    }
    @Test(priority=2)
    public void tcabt() throws InterruptedException
    {
    	obj = new home(driver);
    	String actualabturl= (String) obj.aboutus();
    	Assert.assertEquals(actualabturl, automationconstants.expabturl);
    	Thread.sleep(3000);
    }
    @Test(priority=3)
    public void tccou() throws InterruptedException
    {
    	obj = new home(driver);
    	String actualcourl=(String)obj.courses();
    	Assert.assertEquals(actualcourl, automationconstants.expcourseurl);
    	Thread.sleep(3000);
    	
    }
    
    @Test(priority=4)
    public void tcmember() throws InterruptedException
    {
    	obj = new home(driver);
    	String actualmemurl=(String)obj.membership();
    	Assert.assertEquals(actualmemurl, automationconstants.expmemurl);
    	Thread.sleep(3000);
    	
    }
    @Test(priority=5)
    public void tcevents() throws InterruptedException
    {
    	obj = new home(driver);
    	String actualeveurl=(String)obj.Events();
    	Assert.assertEquals(actualeveurl, automationconstants.expeventsurl);
    	Thread.sleep(3000);
    	
    }
    @Test(priority=6)
    public void tccontact() throws InterruptedException
    {
    	obj = new home(driver);
    	String actualconurl=(String)obj.ContactUS();
    	Assert.assertEquals(actualconurl, automationconstants.expcontacturl);
    	Thread.sleep(3000);
    	
    }
    @Test(priority=8)
    public void tclog() throws InterruptedException
    {
    	
    	obj=new home(driver);
    	String actlgurl=obj.login();
    	Assert.assertEquals(actlgurl,automationconstants.explogurl );
    	Thread.sleep(3000);
    	
    	
    }
    @Test(priority=7)
    public void tccourse() throws InterruptedException 
    {

	     obj=new home(driver);
	     obj.courselist();
    
    }
    @Test(priority=8)
    public void tccourselist() throws InterruptedException
    {
    	obj=new home(driver);
    	String actlist=obj.listitem();
	     Assert.assertEquals(actlist,"Retail");
	     Thread.sleep(3000);
    }
    	
  }
    
  
	
	

