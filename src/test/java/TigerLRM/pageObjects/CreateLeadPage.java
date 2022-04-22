package TigerLRM.pageObjects;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateLeadPage {
	
WebDriver driver;
	
	public CreateLeadPage(WebDriver rdriver)
	
	{
		driver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	@FindBy(xpath="//body/app-root[1]/app-home[1]/app-dashboard[1]/app-nav-menu[1]/div[2]/ul[1]/li[3]/a[1]/span[2]")
	@CacheLookup
	WebElement ClickLeadButton;

	
	@FindBy(xpath="//a[contains(text(),'Create Lead')]")
	@CacheLookup
	WebElement ClickCreateLeadBtn;
	
	@FindBy(name="Salutation")
	@CacheLookup
	WebElement txtSalutation;
	
	@FindBy(name="firstName")
	@CacheLookup
	WebElement txtFirstName;
	
	
	@FindBy(name="lastName")
	@CacheLookup
	WebElement txtLastName;
	
	
	@FindBy(name="email")
	@CacheLookup
	WebElement txtEmail;
	
	
	@FindBy(name="company")
	@CacheLookup
	WebElement txtCompany;
	
	
	@FindBy(xpath="//body/app-root[1]/app-leadhome[1]/p[1]/app-new-lead[1]/section[1]/form[1]/div[2]/div[1]/div[1]/div[7]/div[1]/p-dropdown[1]/div[1]/label[1]/span[1]")
	@CacheLookup
	WebElement txtLeadropdown;
	
	
	@FindBy(xpath="//div[contains(text(),'Enquiry Form')]")
	@CacheLookup
	WebElement txtSelectLeadSource;
	
	 
	@FindBy(name="Rating")
	@CacheLookup
	WebElement txtRating;
	
		
	@FindBy(name="Industry")
	@CacheLookup
	WebElement txtVertcitalIndustry;
	
	
	@FindBy(xpath="//button[contains(text(),'Save')]")
	@CacheLookup
	WebElement ClickSubmit;
	
	@FindBy(xpath="//span[contains(text(),'Yes')]")
	@CacheLookup
	WebElement confirmButton;
	
	//To Pass locator to edit Lead Page
	
	@FindBy(xpath="//button[contains(text(),'Edit')]")
	@CacheLookup
	WebElement ClickEdit;
	 
		 
	@FindBy(name="lastName")
	@CacheLookup
	WebElement txtEditLastName;
	
	
	@FindBy(name="Rating")
	@CacheLookup
	WebElement EditRatingdropdown;
	
	@FindBy(xpath="//button[contains(text(),'Save')]")
	@CacheLookup
	WebElement EditSaveButton;
	
	@FindBy(xpath="//span[contains(text(),'Yes')]")
	@CacheLookup
	WebElement EditConfirmButton;
	
		
	
	public void clickLeadBtn()
	{
		ClickLeadButton.click();
		
	}
	
	
	public void clickCreateLeadBtn()
	{
		ClickCreateLeadBtn.click();
		
	}
	
			
	public void setSalutation()
	{
				
		Select drop = new Select(txtSalutation);
	      drop.selectByVisibleText("Dr.");  
	}
	
	
	public void setFirstName(String fname)
	{
		txtFirstName.sendKeys(fname);
		
	}
	
	public void setlastName(String lname)
	{
		txtLastName.sendKeys(lname);
		
	}
	
	public void setEmail(String email)
	{
		txtEmail.sendKeys(email);
		
	}
	
	public void setCompany(String company)
	{
		txtCompany.sendKeys(company);
		
	}
	
	
	public void setLeadSource()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");	
		txtLeadropdown.click();
	}
	

	public void selectLeadDropdown()
	{
		txtSelectLeadSource.click();
	}
	
	
	
	public void setRating()
	{
	   //To scroll down on a web page in Selenium by defining the number of pixels
			
		Select drop = new Select(txtRating);
	      drop.selectByValue("573b174268864bf39153hjyu0f71b466c");  
	}
	
	
	public void setIndustry()
	{
	   
		Select drop1 = new Select(txtVertcitalIndustry);
	      drop1.selectByVisibleText("AVIA - Aviation");
	}
	
	public void clickSubmitBtn()
	{
		ClickSubmit.click();
		
	}
	
	public void clickConfirm()
	{
		confirmButton.click();
		
	}
	
	
	// To edit Lead Page
	
	public void clickEdit()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-3000)", "");		
		ClickEdit.click();
		
	}
	
		
	public void setEditLastName(String eLname) 
	{
	   //To scroll down on a web page in Selenium by defining the number of pixels
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");	
		txtEditLastName.clear();
		txtEditLastName.sendKeys(eLname);
	       
	}
	
	public void setdownEditRatingDrop() 
	{
	   //To scroll down on a web page in Selenium by defining the number of pixels
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-250)", "");	
		Select drop = new Select(EditRatingdropdown);
	    drop.selectByIndex(0);
	}
	
	
	
	public void EditSaveButton() 
	{
		EditSaveButton.click();
	       
	}
	
	
	public void EditConfirmButton() 
	{
		EditConfirmButton.click();
	       
	}
	
	
	
	
	
}

