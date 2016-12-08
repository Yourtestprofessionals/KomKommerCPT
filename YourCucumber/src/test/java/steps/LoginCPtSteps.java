package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class LoginCPtSteps extends AbstractPageStepsDefinitions {

    
  WebDriver driver = getDriver();


@Given("^user enters CP/T webbrowser$")
public void ShouldEnterCPTBrowser() throws Throwable {
        String InlogUrl = "http://www.yourtestprojects.com/";
        driver.navigate().to(InlogUrl);
        
    }

@When("^user logins with \"([^\"]*)\" and \"([^\"]*)\"$")
public void ShouldLoginWith(String Rol, String Wachtwoord) throws Throwable {
		System.out.println(Rol);
		driver.findElement(By.name("name")).sendKeys(Rol);
		System.out.println(Wachtwoord);
		driver.findElement(By.name("pass")).sendKeys(Wachtwoord);
        }

@And("^Clicks on the Submitbutton$")
public void ShouldSubmitLoginButton() throws Throwable {
	driver.findElement(By.name("op")).click();
}
}