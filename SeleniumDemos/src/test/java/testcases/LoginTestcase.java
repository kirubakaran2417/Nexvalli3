package testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import miniFramework.BrowserConfiguration;
import miniFramework.LoginPage;

public class LoginTestcase {

	WebDriver driver;
	@BeforeTest
	public void setup() {
		driver=BrowserConfiguration.browserConfiguration();
		driver.get("https://www.mycontactform.com");
	}

	@Test
	public void login() {
		LoginPage login=new LoginPage(driver);
		login.setUsername("kiruba");
		login.setPassword("password");
		//login.clickLogin();
		//assertEquals("https://www.mycontactform.com", driver.getCurrentUrl());
	}
	@AfterTest
	public void teardown() {
		driver.quit();
	}
}
