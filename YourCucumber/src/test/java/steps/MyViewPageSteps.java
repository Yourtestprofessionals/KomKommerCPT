package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;

public class MyViewPageSteps extends AbstractPageStepsDefinitions {

	WebDriver driver = getDriver();
	
	@And("^user clicks on View Issues$")
	public void shouldClickOnViewIssues() throws Throwable {
		driver.findElement(By.linkText("View Issues")).click();
	}

}
