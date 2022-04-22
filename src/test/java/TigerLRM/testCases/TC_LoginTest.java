package TigerLRM.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import TigerLRM.pageObjects.LoginPage;


public class TC_LoginTest extends BaseClass {
	
	@Test
	public void loginTest()throws IOException, InterruptedException
	{
				
		LoginPage lp= new LoginPage(driver);
		
		Logger.info("Entered Account Name");
		lp.setAccountName(AccountName);
		
		Logger.info("Entered Email id");
		lp.setEmail(Email);
		
		Logger.info("Entered Password");
		lp.setPassword(Password);
		Thread.sleep(8000);
		
		Logger.info("Click on submit button");
		lp.clickLogin();
		Thread.sleep(12000);
		
		
		Logger.info("Validation started");	  
		if(driver.getTitle().equals("LRM-Dashboard"))
		{
			Assert.assertTrue(true);
			Logger.info("Login test Passed");
		}
				
		else
		{
		captureScreen(driver,"LoginTest");
		Assert.assertTrue(false);		
		Logger.info("Login test failed");
	}
		
	}
	

}
