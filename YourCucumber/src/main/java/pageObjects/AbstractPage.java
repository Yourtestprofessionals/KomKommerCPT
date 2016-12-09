package pageObjects;


import org.openqa.selenium.WebDriver;



public class AbstractPage {

	protected static  WebDriver driver;
	
	public AbstractPage (WebDriver driver){
		this.driver = driver;
		}

public static LoginPage navigateToWebApp() {
	driver.navigate().to("https://accept.yourtestprojects.com/portal/");
	return new LoginPage (driver);
	
}

}	

	
