package com.gogu.webauto.pom.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.gogu.webauto.pom.pages.HomePage;

public class ProfileTest {
	
	@Test	
	public void testProfile(){
		
		System.setProperty("webdriver.gecko.driver", "D:/Learning/Software/geckodriver.exe");
		//System.setProperty("webdriver.chrome.driver", "D:/Learning/Software/chromedriver.exe");
		WebDriver driver = new FirefoxDriver();
		HomePage gotoLoginPage = PageFactory.initElements(driver, HomePage.class);
	}
	

}
