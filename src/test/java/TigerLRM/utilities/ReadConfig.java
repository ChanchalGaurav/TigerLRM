package TigerLRM.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

Properties pro;
	
	//  Use Constractor to load the file
	public ReadConfig()
	{
	File src=new File("./Configuration/config.properties");	
	
	try{
		
		FileInputStream fis=new FileInputStream(src);  //to read data from configuration file
		pro=new Properties();
		pro.load(fis);
			}
    catch(Exception e){
	
	System.out.println("Exception  "+e.getMessage());
	
}
	}
	
	
	public String getApplicationURL()
	{
	String url=pro.getProperty("baseURL");
	return url;
	}
	
	
	public String getAccountname()
	{
		String username=pro.getProperty("AccountName");
		return username;
	}
	
	public String getEmail()
	{
		String email=pro.getProperty("Email");
		return email;
	}
	
	public String getPassword()
	{
		String password=pro.getProperty("Password");
		return password;
	}
	
}
