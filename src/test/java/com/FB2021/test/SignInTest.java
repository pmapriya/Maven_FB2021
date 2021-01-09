package com.FB2021.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.FB2021.Base.BrowserUtility;
import com.FB2021.Pages.SignIn;



public class SignInTest extends BrowserUtility
{
	
	SignIn signIn;   // variable created for of SignIn pagn at class level to use it throughout the class.
	
	//this non-parameteric constructor to call BrowserUtility() constructor 
	//of parent class"BrowserUtility", to initialize prop
	public SignInTest()
	{
		super();
		System.out.println("inside test");
	}
	
	
	
	@BeforeMethod
	public void setUp()
	{


		initialization();   //method called from base class to open browser & app
		SignIn signIn=new SignIn();   //object of SignIn page from "com.FB2021.Page" is created to use it's variable and methods
	}
	


	@Test
	public void loginPageTitle()
	{
		String expectedTitle="Facebook - Log In or Sign Up";
		String actualTitle=driver.getTitle();
		
		Assert.assertEquals(actualTitle, expectedTitle);
		
	}
	
	
	@AfterMethod
	public void TearDown()
	{
		driver.quit();
	}

}
