package miniFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserConfiguration {

	// TODO: Add Browser Configuration
	public static WebDriver browserConfiguration() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");// To disable notifications
		options.addArguments("--start-maximized");
		WebDriver driver = new ChromeDriver(options);
		return driver;
	}
}
