package miniFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

	//create page object using PageFactory for login page
public WebDriver driver;
	
	public Login(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);//initElements is used to initialize all the elements
	}
	
	@FindBy(id="user")
	private WebElement username;  //WebElement username=driver.findElement(By.id("user"));
	
	@FindBy(id="pass")
	private WebElement password;
	
	public void setUsername(String user) {
		username.sendKeys(user);
	}
	
	public void setPassword(String pass) {
		password.sendKeys(pass);
	}
}
