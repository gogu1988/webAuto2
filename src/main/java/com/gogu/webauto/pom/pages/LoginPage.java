package com.gogu.webauto.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

	public class LoginPage {
	
		WebDriver driver;	
	
	public LoginPage(WebDriver driver){
		this.driver = driver;	
	}
	
	public LandingPage doLogin(String UserName, String Password){
		driver.findElement(By.xpath("")).sendKeys("");
		driver.findElement(By.xpath("")).sendKeys("");
		driver.findElement(By.xpath("")).sendKeys(Keys.TAB);
		return PageFactory.initElements(driver, LandingPage.class);
	}

}
