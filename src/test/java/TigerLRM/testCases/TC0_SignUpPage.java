package TigerLRM.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import TigerLRM.pageObjects.SignUpPage;

public class TC0_SignUpPage extends BaseClass {
	
	
	@Test
	public void SignUpPage() throws IOException, InterruptedException
	{
		
		
		SignUpPage sp= new SignUpPage(driver);
		
		Logger.info("Click on SignUp button");
		sp.clickSignUp();
		
		Logger.info("Fill Sign Up page information details......");
		Thread.sleep(5000);
		sp.SignUpAccountName("Test User");
		sp.SignUpClickTimeZone();
		sp.SingUpSelectTimeZone();
		sp.SignUpFirstName("Gaurav Automation");
		sp.SignUpLasttName("Singh");
	
		//Enter dynamic email id
		String demail=radomString()+"@yopmail.com";
		sp.SignUpEmail(demail);
		sp.SignUpPhone("64475353583");
		sp.SignUpPassword("Gaurav@123");
		sp.SignUpConfirmPassword("Gaurav@123");
		sp.SignUpTermsCheckBox();
		Thread.sleep(3000);
		sp.SignUpSubmit();
		
			
		Logger.info("Validation started");	  
		if(driver.getTitle().equals("TigerLRM | Lead Relationship Management"))
		{
			Assert.assertTrue(true);
			Logger.info("Sign Up test Passed");
		}
				
		else
		{
		captureScreen(driver,"LoginTest");
		Assert.assertTrue(false);		
		Logger.info("Sign Up test failed");
	}
		
		
	}
	

}
