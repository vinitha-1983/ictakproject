package org.ictaktest.com;
import org.ictakpages.com.partnership;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ptestclass extends testbase
{

	partnership partnerobj=null;
	SoftAssert softAssert = new SoftAssert();
	@Test(priority=1)
	public void tcvalid() throws InterruptedException
	{
		
		
		partnerobj=new partnership(driver);
		partnerobj.pathtopartnership();
		partnerobj.pfname("vinitha");
		partnerobj.pemail("vinitha@gmail.com");
		partnerobj.pphn("7510295437");
		Thread.sleep(3000);
		partnerobj.pfirm("12/12/2023");
		partnerobj.paddress("sdas");
		partnerobj.pdis("thrissur");
		partnerobj.poffspace("123");
		partnerobj.pemp("200");
        partnerobj.pbr("sdasd");
        partnerobj.pexpects("dwqw");
        partnerobj.ppromoters("asdas");
        partnerobj.psendmess();
        driver.switchTo().alert().accept();

        
	}
	@Test(priority=2)
	public void tcinvalidname()
	{
		
		
		partnerobj=new partnership(driver);
		partnerobj.pathtopartnership();
		boolean actual_name=partnerobj.invalidname("1223");
		softAssert.assertTrue(actual_name,"Only alphabtes is allowed");
		boolean act_email=(boolean) partnerobj.invemail("123&%$12we");
	    softAssert.assertTrue(act_email, "please enter valid mail id");
	    softAssert.assertAll();
		
	}
	
	
	@Test(priority=3)
	public void tcinvalidphn()
	{
		partnerobj=new partnership(driver);
		partnerobj.pathtopartnership();
		boolean act_phn=partnerobj.invpphn("75102964371");
		Assert.assertTrue(act_phn,"Please enter valid phone number");
		
	}	
	@Test(priority=4)
	public void tcinvalidaddress()
	{

		partnerobj=new partnership(driver);
		partnerobj.pathtopartnership();
		boolean act_add=partnerobj.invaddress(" ");
		Assert.assertTrue(act_add,"Found space:Enter value");
		
		
		
	}
	
	@Test(priority=4)
	public void tcinvalidfirm()
	{
		partnerobj=new partnership(driver);
		partnerobj.pathtopartnership();
		boolean act_date=partnerobj.invpfirm("03/13/2024");
		Assert.assertTrue(act_date,"Please enter valid date");
	}
	@Test(priority=5)
	public void tcinvaliddis()
	{

		partnerobj=new partnership(driver);
		partnerobj.pathtopartnership();
		boolean act_dis=(boolean) partnerobj.invpdis("1234");
		Assert.assertTrue(act_dis,"Please enter valid district");
		
	}
	@Test(priority=6)
	public void tcinvalidemp()
	{
		

		partnerobj=new partnership(driver);
		partnerobj.pathtopartnership();
		boolean act_empcount=(boolean) partnerobj.invpemp("asds");
		Assert.assertTrue(act_empcount, "Please enter numbers");
		
		
	}
	@Test(priority=7)
	public void tcinvalidsq()
	{
		partnerobj=new partnership(driver);
		partnerobj.pathtopartnership();
		boolean act_sq=(boolean) partnerobj.invoffspace("sw12");
		Assert.assertTrue(act_sq, "Please enter numbers");
		
	}
	
	
	@Test(priority=8)
	public void tcinvalbrief()
	{

		partnerobj=new partnership(driver);
		partnerobj.pathtopartnership();
		boolean act_brief=(boolean) partnerobj.invpbr(" ");
		Assert.assertTrue(act_brief," Please enter brief report");
		
	}
	
	@Test(priority=9)
	public void tcinvalexpects()
	{

		partnerobj=new partnership(driver);
		partnerobj.pathtopartnership();
		boolean act_exep=(boolean) partnerobj.invpexpects(" ");
		Assert.assertTrue(act_exep,"Please enter expects report");
		
	}
	@Test(priority=10)
	public void tcinvalpromoters()
	{

		partnerobj=new partnership(driver);
		partnerobj.pathtopartnership();
		boolean act_exep=(boolean) partnerobj.invppromoters(" ");
		Assert.assertTrue(act_exep,"Please enter brief profile of promoters");
		
	}
	
	
}
