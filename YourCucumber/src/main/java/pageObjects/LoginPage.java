package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends AbstractPage {
	
	public LoginPage(WebDriver driver) {
		super(driver);
		
	}
	public LoginPage setUserNamefield (String value){
		driver.findElement(By.name("name")).sendKeys(value);
		return new LoginPage(driver);
	}
	public LoginPage setPasswordfield(String value) {
		driver.findElement(By.name("pass")).sendKeys(value);
		return new LoginPage(driver);
	
	}
	
	public LoginPage clickLoginButton() {
		driver.findElement(By.name("pass")).click();
		return new LoginPage(driver);
		
	}
}


