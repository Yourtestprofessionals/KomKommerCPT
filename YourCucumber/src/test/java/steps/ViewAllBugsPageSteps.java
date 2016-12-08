package steps;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class ViewAllBugsPageSteps extends AbstractPageStepsDefinitions{
	
	WebDriver driver = getDriver();
	
	
	
	@And("^user clicks on Print Reports$")
	public void shouldClickOnPrintReports() throws Throwable {
		driver.findElement(By.linkText("Print Reports")).click();
	}

	@And("^user clicks on CSV Export$")
	public void shouldClickOnCsvExport() throws Throwable {
		driver.findElement(By.linkText("CSV Export")).click();
	}
	
	@And("^user clicks on XML Export$")
	public void shouldClickOnXmlExport() throws Throwable {
		driver.findElement(By.linkText("XML Export")).click();
	}
	
	@Then("^a CSV report is created$")
	public boolean CsvReportisCreated() throws Throwable {
		Thread.sleep (1500);
boolean outcome = false;
		
		String home = System.getProperty("user.home");		
		File f = new File(home+"/Downloads/test.csv");
			if(f.exists()){ 
			    System.out.println("Success");
			    outcome = true;
			}
			else{
			    System.out.println("fail");
			    }
			f.delete();

		return outcome;
	   	}
	
	@Then("^a XML report is created$")
	public boolean XmlReportisCreated() throws Throwable {
		Thread.sleep (1500);
boolean outcome = false;
		
		String home = System.getProperty("user.home");		
		File f = new File(home+"/Downloads/test.xml");
			if(f.exists()){ 
			    System.out.println("Success");
			    outcome = true;
			}
			else{
			    System.out.println("fail");
			    }
			f.delete();

		return outcome;
	   	}
}
