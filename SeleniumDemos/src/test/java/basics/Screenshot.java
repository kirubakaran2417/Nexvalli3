package basics;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Screenshot {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--start-maximized");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.mycontactform.com");
		driver.findElement(By.linkText("Sample Forms")).click();
		//take the screenshot
		
		File screenshot=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		//save the screenshot
		try {
			FileUtils.copyFile(screenshot, new File("D:\\Workspaces\\Nexvali3\\SeleniumDemos\\screenshots\\photo.jpg"));
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
