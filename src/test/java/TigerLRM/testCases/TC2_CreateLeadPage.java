package TigerLRM.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import TigerLRM.pageObjects.CreateLeadPage;
import TigerLRM.pageObjects.LoginPage;



public class TC2_CreateLeadPage extends BaseClass {

	@Test
	public void CreateLeadPage() throws IOException, InterruptedException
	{
				
		LoginPage lp= new LoginPage(driver);
		
		Logger.info("Entered Account Name");
		lp.setAccountName(AccountName);
		
		Logger.info("Entered Email id");
		lp.setEmail(Email);
		
		Logger.info("Entered Password");
		lp.setPassword(Password);
		
		Logger.info("Click on submit button");
		lp.clickLogin();
		Thread.sleep(8000);
				
		
		
		//To create object of Create Lead Page
		CreateLeadPage clp= new CreateLeadPage(driver);
		
		Logger.info("Click on Lead button");
		Thread.sleep(3000);
		clp.clickLeadBtn();
		
		Logger.info("Click on Create Lead Button");
		Thread.sleep(2000);
		clp.clickCreateLeadBtn();
		Thread.sleep(3000);
		
		Logger.info("Fill Lead information details......");
		
		
		Logger.info("Entered  Salutation");
		clp.setSalutation();
		Thread.sleep(1000);
		
		Logger.info("Entered First Name");
		clp.setFirstName("Gaurav Automation");
		
		Logger.info("Entered Last Name");
		clp.setlastName("Singh");
				
		Logger.info("Entered valid Email id");
		//Enter dynamic email id
		String email=radomString()+"@yopmail.com";
		clp.setEmail(email);
		
		Logger.info("Entered Company");
		clp.setCompany("Chetu");
		Thread.sleep(3000);
		
		Logger.info("Click on Laead source Dropdown");
		clp.setLeadSource();
		Thread.sleep(3000);
		
		Logger.info("Select Enquiry Forma on Laead source Dropdown");
		clp.selectLeadDropdown();
		
		Thread.sleep(2000);
		Logger.info("Entered Rating");
		Thread.sleep(3000);
		clp.setRating();
		
		Logger.info("Entered Vertical/Industry");
		Thread.sleep(2000);
		clp.setIndustry();
		Thread.sleep(3000);
		
		Logger.info("Click on Save Button after creating new Lead");
		clp.clickSubmitBtn();
		Thread.sleep(3000);
		
		Logger.info("Click on confirm button after creating new Lead");
		clp.clickConfirm();
		
		Logger.info("Click on Edit button");
		Thread.sleep(5000);
		clp.clickEdit();
		Thread.sleep(9000);
		
		Logger.info("Edit in Last Name");
		clp.setEditLastName("Singh123");
		Thread.sleep(5000);
		
		Logger.info("Edit in Rating Dropdown");
		clp.setdownEditRatingDrop();
		Thread.sleep(3000);
		
		Logger.info("Click on Save button after edited Last Name");
		clp.EditSaveButton();
		Thread.sleep(2000);
		
		Logger.info("Click on Confirm button after edited Last Name");
		clp.EditConfirmButton();
		
		
		Logger.info("Validation started");
		boolean result=driver.getTitle().contains("LRM-Lead-Gaurav Automation, Singh");
		
		if(result==true)
		{
			Assert.assertTrue(true);
			Logger.info("Create/Edit Lead Test case is passed");
		}
		else
		{
	    captureScreen(driver,"CreateLead test");
		   Assert.assertTrue(false);
		   Logger.info("Create/Edit Lead Test case is Failed");
		}
		
		
		
		
		
		
	}
	
	
}
