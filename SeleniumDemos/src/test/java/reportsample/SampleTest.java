package reportsample;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import miniFramework.BrowserConfiguration;
@Listeners(ListenersSample.class)
public class SampleTest {

	WebDriver driver;
	@BeforeTest
	public void beforeTest() {
		driver=BrowserConfiguration.browserConfiguration();
	}
	@Test
	public void test() {
		driver.get("https://www.mycontactform.com");
		assert true;
	}
	@Test
	public void test1() {
		driver.get("https://www.amazon.com");
		assert false;//this will fail
	}
	public WebDriver getDriver() {
		// TODO Auto-generated method stub
		return driver;
	}
}
