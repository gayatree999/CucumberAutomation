package stepDefinations;

import org.junit.runner.RunWith;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class stepDefination {

   @Given("^User is on netbanking landing page$")
    public void user_is_on_netbanking_landing_page() throws Throwable {
        System.out.println("User is on netbanking landing page");
    }
   
   @When("User login to application with {string} and password {string}")
   public void user_login_to_application_with_and_password(String string1, String string2) {
	   System.out.println("User provides username and password");
	   System.out.println(string1);
	   System.out.println(string2);
   }

    /*@When("^User provides username and password$")
    public void user_provides_username_and_password() throws Throwable {
    	System.out.println("User provides username and password");
    }*/
   
    @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable {
    	System.out.println("Home page is populated");
    }

    @And("cards are displayed {string}")
    public void cards_are_displayed(String stringArg1) {
       System.out.println(stringArg1);
    }

}