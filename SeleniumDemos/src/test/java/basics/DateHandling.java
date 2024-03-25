package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DateHandling {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		options.addArguments("--start-maximized");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.easemytrip.com/");
		WebElement dd=driver.findElement(By.id("ddate"));
		dd.click();
		
		//to select month
		WebElement month=driver.findElement(By.className("month2"));
		String mon=month.getText();
		String[] arr=mon.split(" ");
		String targetmonth="MAY";
		while(!arr[0].equals(targetmonth)) {
				
					driver.findElement(By.id("img2Nex")).click();
					 month=driver.findElement(By.className("month2"));
						 mon=month.getText();
						arr=mon.split(" ");
						if(arr[0].equals(targetmonth)) {
							break;
						}
			}
			//list
			List<WebElement> list=driver.findElements(By.className("day"));
			for(int i=0;i<list.size();i++) {
				if(list.get(i).getText().equals("25")) {
					list.get(i).click();
				}
			}
		}
	}

