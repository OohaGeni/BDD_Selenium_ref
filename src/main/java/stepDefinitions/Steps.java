package stepDefinitions;
 
import Gillette.ForgotPassword;
import Gillette.PasswordAus;
import Gillette.PasswordFrance;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
 
	public class Steps {
		
		ForgotPassword password = new ForgotPassword();
		PasswordAus reset =new PasswordAus();
		PasswordFrance pswd =new PasswordFrance();
		
		// When user executes for India Comment the lines reset and pswd
		// When user executes for Aus Comment the lines password and pswd
		// When user executes for France Comment the lines reset and password
		// The PasswordRun file should be changed accordingly
		// for India - features="Features/Forgotpswd.feature"
		// for Aus - features="Features/PasswordAus.feature"
		// for France - features="Features/PasswordFrance.feature"
		
		@Given("^Open the chrome and launch the application$")
		public void open_the_chrome_and_launch_application() throws Throwable {
			password.open_the_chrome_and_launch_application();
		//	reset.open_the_chrome_and_launch_application();
		//	pswd.open_the_chrome_and_launch_application();
		}
 
		@When("^User directs to Login Page$")
	    public void user_directs_to_Login_Page() throws Throwable {
			password.user_directs_to_Login_Page();
		//	reset.user_directs_to_Login_Page();
		//	pswd.user_directs_to_Login_Page();
		}
		
		@Then("^User enters Valid username$")
		public void user_enters_valid_username() throws Throwable {
			password.user_enters_valid_username();
		//	reset.user_enters_valid_username();
		//	pswd.user_enters_valid_username();
		}
		
		@Then("^User resets the password$")
		public void user_resets_the_password() throws Throwable {
			password.user_resets_the_password();
		//	reset.user_resets_the_password();
		//	pswd.user_resets_the_password();
		}
		
}