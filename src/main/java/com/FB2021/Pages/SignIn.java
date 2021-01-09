package com.FB2021.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.FB2021.Base.BrowserUtility;

public class SignIn extends BrowserUtility 
{
	WebElement email= driver.findElement(By.xpath("//input[@id=\"email\"]"));
	WebElement password=driver.findElement(By.id("pass"));

}
