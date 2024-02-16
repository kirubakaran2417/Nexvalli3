package basics;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Webelements {

	@Test
	public void Setup() {
		//to open chrome browser
		ChromeOptions options=new ChromeOptions();
		options.addArguments("start-maximized");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.mycontactform.com");
		//to maximize the browser
		driver.manage().window().maximize();
	
		//locating the elements
		//name,id,classname,xpath,linktext,partiallinktext,cssselector,tagname
		
		WebElement username=driver.findElement(By.id("user"));
		//enter any text
		username.sendKeys("kiruba");
		
		driver.findElement(By.linkText("Sample Forms")).click();
		//handling drop down
		WebElement dropdown=driver.findElement(By.id("q3"));
		Select s=new Select(dropdown);	
		s.selectByVisibleText("Third Option");
		Select s1=new Select(driver.findElement(By.name("q11_title")));
		s1.selectByVisibleText("Mr.");
		
		driver.findElement(By.xpath("//input[text()=' Sales']")).click();
		
		//input[@name='email_to[]' and @value='1']
		
		driver.findElement(By.xpath("//input[@name='email_to[]' and @value='1']")).click();
		//input[@value='Second Option']
		driver.findElement(By.xpath("//input[@value='Second Option']")).click();
	}
}
