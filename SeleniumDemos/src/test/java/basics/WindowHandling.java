package basics;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowHandling {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--start-maximized");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		//to maximize the browser
		driver.manage().window().maximize();
		//scroll down for 5000 pixels
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		driver.findElement(By.id("messageWindowButton")).click();
		Set<String> parent=driver.getWindowHandles();
		System.out.println("Total number of windows "+parent.size());//2-->0,1
		//convert set to list
		List<String> list=new ArrayList<String>(parent);
		driver.switchTo().window(list.get(1));
		System.out.println(driver.getTitle());
		WebElement body=driver.findElement(By.xpath("//body"));
		System.out.println(body.getText());
		driver.switchTo().window(list.get(0));
		
		//switch to new tab
		String windowHandle=driver.getWindowHandle();
		driver.switchTo().newWindow(WindowType.TAB);
	}
}
