package StepDef;

import Goibibo.LaunchGoibibo;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GoibiboSteps {

	LaunchGoibibo website = new LaunchGoibibo();
		
	 @Given("^Open the firefox page and run the application$")
	 public void open_the_firefox_page_and_run_the_application() throws Throwable {
	 System.out.println("Open firefox and run application");
	 }
	 
	 @When("^User can view the firefox search screen$")
	 public void user_can_view_the_firefox_search_page() throws Throwable {
	 System.out.println("Firefox search page");
	 }
	 
	 @Then("^User should enter link for login$")
	 public void user_should_enter_link_for_login() throws Throwable {
	 System.out.println("User should enter login link");
	 }
	 
		@Given("^Open the Firefox and start the application$")
		public void open_the_firefox_and_start_the_application() throws Throwable {
			website.open_the_firefox_and_start_application();
		}
		
		@When("^Select any one option$")
	    public void select_any_one_option() throws Throwable {
			website.select_any_one_option();
		}
		
		@Then("^User fills the required details$")
	    public void user_fills_the_required_details() throws Throwable {
			website.user_fills_the_required_details();
		}
		
	}

