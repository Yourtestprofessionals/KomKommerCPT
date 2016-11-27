package steps;

import codebase.LoginPortal;
import codebase.Beoordeling_Login;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;


public class InloggenSteps{

    private Beoordeling_Login Beoordeling_Login;

    @Before
    public void setUp() {
    	Beoordeling_Login = new Beoordeling_Login();
    }

    @Given("^I have a login module$")
    public void i_have_a_login_module() throws Throwable {
        assertNotNull(Beoordeling_Login);
    }

    @When("^I login with the parameters \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"")
    public void I_login_with_the_parameters(String arg1, String arg2, String arg3) throws Throwable{ 
    	assertTrue (codebase.Beoordeling_Login.correctinloggen(arg1, arg2, arg3));
    }

    @Then("^i can succesfully login$")
    public void the_result_is () throws Throwable {
        	//assertTrue(codebase.Beoordeling_Login.getResult());
    }
}
