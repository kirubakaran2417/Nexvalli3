package testcases;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.ResuableFunctions;
import pom.Login;
import utilities.ListenerUtils;

@Listeners(ListenerUtils.class)
public class SampleTest {

	private WebDriver driver;
    private ResuableFunctions reusableFunctions;
    private Login login;
    
    @BeforeTest
    public void beforeTest() {
        driver = ResuableFunctions.invokeBrowser();
        reusableFunctions = new ResuableFunctions(driver);
        login = new Login(driver);
    }
    @Test
    public void tescase1() {
        reusableFunctions.openWebsite("https://mycontactform.com/");
        assertEquals(driver.getCurrentUrl(), "https://mycontactform.com/");
        assertEquals(driver.getTitle(), "Free Contact and Email Forms - myContactForm.com");
    }
    @Test
	public void testcase2() {
		login.enterUsername("admin");
		login.enterPassword("admin");
		login.clickLogin();
		 assertEquals(driver.getCurrentUrl(), "https://mycontactform.com/");
	     assertEquals(driver.getTitle(), "Free Contact and Email Forms - myContactForm.com");
	}
}
//report neeed to have screenshot of failed test
//everytime when i run my test file that need generate unique report file