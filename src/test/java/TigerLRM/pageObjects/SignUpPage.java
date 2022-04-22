package TigerLRM.pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {

WebDriver driver;
	


	public SignUpPage(WebDriver rdriver)
	
	{
		driver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	@FindBy(xpath="//a[contains(text(),'Sign up')]")
	@CacheLookup
	WebElement SignUpButton;
	
	
	@FindBy(name="AccountName")
	@CacheLookup
	WebElement SignUpAccountName;
	
	@FindBy(xpath="//label[contains(text(),'----Select-----')]")
	@CacheLookup
	WebElement SignUpClickTimeZone;
	
	
	@FindBy(xpath="//span[contains(text(),'(UTC+14:00) Kiritimati Island')]")
	@CacheLookup
	WebElement SignUpSelectTimeZone;
		
	@FindBy(name="FirstName")
	@CacheLookup
	WebElement SignUpFirstName;
	
	@FindBy(name="LastName")
	@CacheLookup
	WebElement SignUpLastName;
	
	
	@FindBy(name="UserEmail")
	@CacheLookup
	WebElement SignUpEmail;
	
	@FindBy(name="txt_UserPhone1")
	@CacheLookup
	WebElement SignUpPhone;
	
	@FindBy(name="UserPassword_1")
	@CacheLookup
	WebElement SignUpPassword;
	
	@FindBy(name="ConfirmPassword")
	@CacheLookup
	WebElement SignUpConfirmPassword;
	
	@FindBy(name="Name")
	@CacheLookup
	WebElement SignUpTermsCheckBox;
	
	@FindBy(xpath="//span[contains(text(),'Submit')]")
	@CacheLookup
	WebElement SignUpSubmit;
	
	
	public void clickSignUp()
	{
		SignUpButton.click();
		
	}
	
	public void SignUpAccountName(String sAccountName )
	{
		SignUpAccountName.sendKeys(sAccountName);
		
	}
	
		
	public void SignUpClickTimeZone( )
	{
		SignUpClickTimeZone.click();
		
	}
	
	public void SingUpSelectTimeZone( )
	{
		SignUpSelectTimeZone.click();
		
	}
	
	public void SignUpFirstName(String sFirstName )
	{
		SignUpFirstName.sendKeys(sFirstName);
		
	}
		
	public void SignUpLasttName(String sLastName )
	{
		SignUpLastName.sendKeys(sLastName);
		
	}
	
	public void SignUpEmail(String semail )
	{
		SignUpEmail.sendKeys(semail);
		
	}
	
	public void SignUpPhone(String sPhone )
	{
		SignUpPhone.sendKeys(sPhone);
		
	}
	
	public void SignUpPassword(String sPassword )
	{
		SignUpPassword.sendKeys(sPassword);
		
	}
	
	public void SignUpConfirmPassword(String sConfirmPassword )
	{
		SignUpConfirmPassword.sendKeys(sConfirmPassword);
		
	}
	
	public void SignUpTermsCheckBox()
	{
		SignUpTermsCheckBox.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");	
		
	}
	
	public void SignUpSubmit()
	{
		
		SignUpSubmit.click();
		
	}
	
	
}
