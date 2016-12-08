package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

public class SeleniumTrainingSteps extends AbstractPageStepsDefinitions{
	
	WebDriver driver = getDriver();
	

	@And("^user clicks on right arrow$")
	public void ShouldClickRightArrow() throws Throwable {
		driver.findElement(By.id("arrow-right-wrapper")).click();
		
	}
	
	
	@And("^user clicks on Issues$")
	public void ShouldClickOnIssues() throws Throwable {
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	driver.findElement(By.linkText("Issues")).click();
	}
	

	}

