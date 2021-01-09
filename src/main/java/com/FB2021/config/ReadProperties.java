package com.FB2021.config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
   

//currently not using this class in this project 
//but keeping this for future reference,as code below is for reading 
//properties for config.properties file 
//this code i have written in BrowserUtility class (in com.Automation.Maven_FB2021 pakage)


public class ReadProperties {
	
	public static String browser;
	public static String url;
	public static String username;
	public static String password;

	public static void main(String[] args) throws IOException 
	{
		Properties prop=new Properties();
		FileInputStream ip=new FileInputStream("C:/Users/AbhishekPriya/Selenium/Maven_FB2021/src/main/java/com/FB2021/config/config.properties");
		
		prop.load(ip);
		
		browser=prop.getProperty("browser");
		
		System.out.println(browser);
		url=prop.getProperty("url");
		username=prop.getProperty("username");
		password=prop.getProperty("password");
		
	}

}
