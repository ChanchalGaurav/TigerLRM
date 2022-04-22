package TigerLRM.testCases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.RandomStringUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import TigerLRM.utilities.ReadConfig;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	ReadConfig readConfig=new ReadConfig();
	public String baseURL=readConfig.getApplicationURL();
	public String AccountName=readConfig.getAccountname();
	public String Email=readConfig.getEmail();
	public String Password=readConfig.getPassword();
			
	public static WebDriver driver;
	public static Logger Logger;
	@BeforeClass
	public void setup()
	{
		Logger= Logger.getLogger("Relationship Management");
		PropertyConfigurator.configure("Log4j.properties");  
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		Logger.info("URL is opened");
		driver.get("https://Chetu:Mkpb@123@uatapp.tigerlrm.com/");
			}
	
	@AfterClass
	public void close()
	{
		driver.quit();  
	}
	
	public void captureScreen(WebDriver driver, String tname) throws IOException
	{
		TakesScreenshot ts= (TakesScreenshot) driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File target=new File(System.getProperty("user.dir")+"/Screenshots/" +tname+".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");
	}
	
	//to create method for dynamic enter the data for email id
		public String radomString()
		{
			String generateString=RandomStringUtils.randomAlphabetic(8);
			return(generateString);
		}
		
		public String radomNum()
		{
			String generateString2=RandomStringUtils.randomNumeric(4);
			return(generateString2);
		}
}
