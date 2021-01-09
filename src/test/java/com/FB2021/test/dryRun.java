package com.FB2021.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class dryRun 
{

	
	WebDriver driver;
	
	
	@Test
	public void test()
	{
		System.out.println("1.Inside test method");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AbhishekPriya\\Downloads\\Software\\Selenium drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		
		System.out.println("2.launch chrome browser");
		
		driver.get("http://www.facebook.com/");
		System.out.println("3.App open");
		
		System.out.println(driver.getTitle());
		System.out.println("4.title printed");
		
		driver.quit();
		System.out.println("5.browser closed");
		
		
	}
	
}
