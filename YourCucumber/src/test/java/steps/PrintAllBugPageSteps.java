package steps;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class PrintAllBugPageSteps extends AbstractPageStepsDefinitions{
	
	WebDriver driver = getDriver();
	
	@And("^user selects the Word icon$")
	public void shouldClickWordIcon() throws Throwable {
		driver.findElement(By.xpath("/html/body/form[1]/table/tbody/tr/td/a[1]/img")).click();
	 
	}
	
	@And("^user selects the IE icon$")
	public void shouldClickIeIcon() throws Throwable {
		driver.findElement(By.xpath("/html/body/form[1]/table/tbody/tr/td/a[2]/img")).click();
		
	}
		
	@Then("^a wordreport is created$")
	
	public boolean ReportisCreated() throws Throwable {
		Thread.sleep (1500);
boolean outcome = false; 
		
		String home = System.getProperty("user.home");		
		File f = new File(home+"/Downloads/test.doc");
			if(f.exists()){ 
			    System.out.println("Success");
			    outcome = true;
			}
			else{
			    System.out.println("failed");
			    }
			f.delete();

		return outcome;
	   	}


}