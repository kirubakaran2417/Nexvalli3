package basics;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Waitss {
	//synchronization-test scripts are reliably runby managing the timing between the browser and the test
	@Test
	public void test() throws InterruptedException {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("start-maximized");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.jqueryui.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//soft wait
		//to maximize the browser
		driver.manage().window().maximize();
		Thread.sleep(5000);//hard wait(highly not recommended)
		WebElement link=driver.findElement(By.linkText("Droppable"));
		//explicit wait
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(link));
		link.click();
		
	}
}
