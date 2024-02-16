package basics;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserSetup {

	@Test
	public void Setup() {
		//to open chrome browser
		WebDriver driver=new ChromeDriver();
		//to open firefox browser
		//WebDriver driver=new FirefoxDriver();
		//to open edge browser
		//WebDriver driver=new EdgeDriver();
		//open an webpage
		driver.get("https://www.google.com");
		//using navigate method
		driver.navigate().to("https://www.saucedemo.com");
		
		
		//navigational methods
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().back();
		
		
		//webdriver methods
		String title=driver.getTitle();
		System.out.println("title of the page is "+title);
		String url=driver.getCurrentUrl();
		System.out.println("url of the page is "+url);
		
		//go to https://www.mycontactform.com
		
		
	}
}
