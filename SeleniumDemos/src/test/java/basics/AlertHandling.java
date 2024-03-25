package basics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AlertHandling {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--start-maximized");
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		//alert interface reference
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
			alert.accept();//click on ok
		//click js confirm
		alert.dismiss();//click on cancel
		//click js prompt
		alert.sendKeys("Your input here");
		alert.accept();
	}
}
