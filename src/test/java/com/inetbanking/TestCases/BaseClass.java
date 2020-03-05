package com.inetbanking.TestCases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.inetbanking.Utilities.ReadConfig;



public class BaseClass {
	
	
	
	ReadConfig readconfig=new ReadConfig();

	public String baseURL = readconfig.getApplicationURL();
	public String username = readconfig.getusername();
	public String password = readconfig.getpassword();
	public static WebDriver driver;
	
	public static Logger logger;
	
	
	
     @Parameters("browser")
	@BeforeClass
	public void setup(String br) {
		
		
		logger  = Logger.getLogger("ebanking Hybrid Project");
		PropertyConfigurator.configure("Log4j.Properties");
		
		if(br.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", readconfig.getChromePath());
		driver = new ChromeDriver();
		}
		else if(br.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver",readconfig.getfirefoxPath());
			driver =new FirefoxDriver();
		}
		else if (br.equals("ie")) {
			System.setProperty("webdriver.ie.driver", readconfig.getIEpath());
			driver =new InternetExplorerDriver();
		}

	}

	@AfterClass

	public void tearDown() {
		driver.quit();
	}
}