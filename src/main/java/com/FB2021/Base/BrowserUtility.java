package com.FB2021.Base;

import java.io.FileInputStream;
import com.FB2021.config.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.FB2021.Utility.TestUtil;

public class BrowserUtility 
{
  
   public static WebDriver driver;   //driver variable
   public static Properties prop;   //prop variable to read properties from config
   
   //constructor for reading config data
   public BrowserUtility()
   { 
	   try {
		   
	   Properties prop=new Properties();
	   FileInputStream ip=new FileInputStream("C:/Users/AbhishekPriya/Selenium/Maven_FB2021/src/main/java/com/FB2021/config/config.properties");
	   
	   prop.load(ip);
	   
	   System.out.println("1.browser utility constrctor");
	   
		String browserName= prop.getProperty("browser");
		
		System.out.println("2.initialization method_get browser name"+browserName);
	   
	} catch (FileNotFoundException e) 
	   {
		e.printStackTrace();
	   } catch (IOException e) 
	   {
		e.printStackTrace();
	   }
   } // constructor ends
   
   
	public static void initialization()
	{
		System.out.println("5.initialization method");
		
		String browserName= prop.getProperty("browser");
		
	//	System.out.println("6.initialization method_get browser name"+browserName);
		
		String urlName= prop.getProperty("url");
		
		if(browserName.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\AbhishekPriya\\Downloads\\Software\\Selenium drivers\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("IE"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\AbhishekPriya\\Downloads\\Software\\Selenium drivers\\chromedriver.exe");
			driver=new InternetExplorerDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.page_load_timeoutTime, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.implicit_time, TimeUnit.SECONDS);
		
		driver.get(urlName);
		
	}
	
}
