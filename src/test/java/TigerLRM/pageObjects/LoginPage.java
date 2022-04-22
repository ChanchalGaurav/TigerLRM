package TigerLRM.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver rdriver)
	{
		driver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	
	@FindBy(name="verifiedaccountName")
	@CacheLookup
	WebElement txtAccountName;
	
	@FindBy(name="userName")
	@CacheLookup
	WebElement txtEmail;
	
	@FindBy(name="hiddenPassword")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(xpath="//span[contains(text(),'Login')]")
	@CacheLookup
	WebElement btnLogin;

		
	public void setAccountName(String accountname)
	{
		txtAccountName.sendKeys(accountname);
		
	}
	
	
	public void setEmail(String email)
	{
		txtEmail.sendKeys(email);
		
	}
	
	public void setPassword(String pwd)
	{
		txtPassword.sendKeys(pwd);
		
	}
	
		
	public void clickLogin()
	{
		btnLogin.click();
	}
}


