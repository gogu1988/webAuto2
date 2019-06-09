package com.gogu.webauto.pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;	
	
	public HomePage(WebDriver driver){
		this.driver = driver;	
	}
	
	public LoginPage gotoLoginPage(){
		driver.get("http://thermofisher.com");
		return PageFactory.initElements(driver, LoginPage.class);
	}
	

}
