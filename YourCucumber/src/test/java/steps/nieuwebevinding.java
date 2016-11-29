package steps;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import codebase.Beoordeling_Login;
import codebase.CheckArgs;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import codebase.mantisops_db;

public class nieuwebevinding {

	private Beoordeling_Login Beoordeling_Login;
	
	@Before
    public void setUpMantis() {
    	Beoordeling_Login = new Beoordeling_Login();
    }

    @Given("^I have a login module mantis$")
    public void i_have_a_login_module_mantis() throws Throwable {
        assertNotNull(Beoordeling_Login);
    }

    @When("^I login with the parameters \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
    public void i_login_with_the_parameters_and_and_and(String arg1, String arg2, String arg3, String arg4) throws Throwable { 

    	// this workaround burns my eyes. i will get no sleep over this.
    	
    	arg1 = CheckArgs.CheckArg1(arg1);
    	arg2 = CheckArgs.CheckArg2(arg2);
    	arg3 = CheckArgs.CheckArg3(arg3);
        // it had to be done.       	
    	
    	assertTrue (mantisops_db.ReportIssue(arg1, arg2, arg3, arg4));
    	throw new PendingException();
    }

    @Then("^i have succesfully created the testcase$")
    public void i_have_succesfully_created_the_testcase() throws Throwable {
       
        // Write code here that turns the phrase above into concrete actions
        
    }    
}
