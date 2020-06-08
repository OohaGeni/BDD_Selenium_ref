package StepD;

import Sample.LoginCheck;
import Sample.RegisterCheck;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SampleSteps {

	LoginCheck google = new LoginCheck();
	RegisterCheck register = new RegisterCheck();
	
	//Login code
	 @Given("^Open the chrome and run the application$")
	 public void open_the_chrome_and_run_the_application() throws Throwable {
	 System.out.println("Open chrome and run application");
	 }
	 
	 @When("^User can view the Chrome search page$")
	 public void user_can_view_the_Chrome_search_page() throws Throwable {
	 System.out.println("Chrome search page");
	 }
	 
	 @Then("^User should enter the login link$")
	 public void user_should_enter_the_login_link() throws Throwable {
	 System.out.println("User should enter login link");
	 }
		
	 //Login India
		@Given("^Open the Chrome and start the application_India$")
		public void open_the_Chrome_and_start_the_application_India() throws Throwable {
			google.open_the_chrome_and_start_application_India();
			}
 
		@When("^User navigates to Login Page for India$")
	    public void user_navigates_to_Login_Page() throws Throwable {
			google.user_navigates_to_Login_Page();
		}
		
		@Then("^I enter valid username and valid password$")
		public void i_enter_valid_username_and_valid_password() throws Throwable {
			google.i_enter_valid_username_and_valid_password();
		}
		
		@Then("^User should be able to login successfully$")
		public void user_should_be_able_to_login_successfully() throws Throwable {
			google.user_should_be_able_to_login_successfully();
		}
		
		//Login Aus
		@Given("^Open the chrome and start the application_Aus$")
		public void open_the_chrome_and_launch_the_application_Aus() throws Throwable {
			google.open_the_chrome_and_start_application_Aus();
			}
 
		@When("^User navigates to Login Page for Aus$")
	    public void user_navigates_to_Login_Page_for_Aus() throws Throwable {
			google.user_navigates_to_Login_Page_for_Aus();
		}
		
		//Comment the line "google.I_enter_valid_login_credentials();" while executing the SampleRun.java with features="FF1/Sample2.feature" 
		
		@Then("^I enter valid login credentials$")
		public void I_enter_valid_login_credentials() throws Throwable {
			google.I_enter_valid_login_credentials();
		}
		
		@Then("^User login is successful$")
		public void user_login_is_successful() throws Throwable {
			google.user_login_is_successful();
		}
		
		//Login France
		@Given("^Open the chrome and start the application_France$")
		public void open_the_chrome_and_launch_the_application_France() throws Throwable {
			google.open_the_chrome_and_start_application_France();
			}
 
		@When("^User navigates to Login Page for France$")
	    public void user_navigates_to_Login_Page_for_France() throws Throwable {
			google.user_navigates_to_Login_Page_for_France();
		}
		
		//Comment the line "google.user_enters_valid_credentials();" while executing the SampleRun.java with features="FF1/Sample2.feature" 
		
		@Then("^User enters valid credentials$")
		public void user_enters_valid_credentials() throws Throwable {
			google.user_enters_valid_credentials();
		}
		
		@Then("^User successfully loggedin$")
		public void user_successfully_loggedin() throws Throwable {
			google.user_successfully_loggedin();
		}
		
		// Registration Code
		
		@Given("^Open the Chrome page and run the application$")
		 public void open_the_Chrome_page_and_run_the_application() throws Throwable {
		 System.out.println("Open chrome and run application");
		 }
		 
		 @When("^User can view the Chrome search screen$")
		 public void user_can_view_the_Chrome_search_screen() throws Throwable {
		 System.out.println("Chrome search page");
		 }
		 
		 @Then("^User should enter link for login$")
		 public void user_should_enter_the_link_for_login_() throws Throwable {
		 System.out.println("User should enter login link");
		 }
		 
	// India	 
		 @Given("^Open Chrome and start the application_India$")
			public void open_Chrome_and_run_application_India() throws Throwable {
			register.open_the_chrome_and_run_application_India();
				}
	 
			@When("^User navigates to register Page for India$")
		    public void user_navigates_to_register_page_for_India() throws Throwable {
			register.user_navigates_to_register_page_for_India();
			}
			
			@Then("^User enters all the required details$")
			public void user_enters_all_the_required_details() throws Throwable {
			register.enter_all_the_required_details();
			}
			
			@Then("^User should be able to Register successfully$")
			public void user_shoul_be_able_to_register_successfully() throws Throwable {
			register.user_should_be_able_to_Register_successfully();
			}
			
	//Aus	
			@Given("^Open the Chrome and start the application_Aus$")
			public void open_the_Chrome_and_start_the_application_Aus() throws Throwable {
				register.open_the_Chrome_and_start_the_application_Aus();
				}
	 
			@When("^User navigates to Register Page for Aus$")
		    public void user_navigates_to_register_page_for_Aus() throws Throwable {
				google.user_navigates_to_Login_Page_for_Aus();
				
			}
			
			//UnComment the line "google.user_enters_the_details();" while executing the SampleRun.java with features="FF1/Sample2.feature" 
			
			@Then("^User enters the details$")
			public void user_enters_the_details() throws Throwable {
	//			google.user_enters_the_details();
			}
			
			@Then("^User registration successful$")
			public void user_registration_sucessful() throws Throwable {
				register.user_registration_successful();
			}
		 
	//France		
			@Given("^Open the Chrome and start the application_France$")
			public void open_the_Chrome_and_start_the_application_France() throws Throwable {
				register.open_the_chrome_and_start_the_application_France();
				}
	 
			@When("^User navigates to Register Page for France$")
		    public void user_navigates_to_register_page_for_France() throws Throwable {
				google.user_navigates_to_Login_Page_for_France();
			}
			
		//	UnComment the line "google.user_enters_valid_details();" while executing the SampleRun with features="FF1/Sample2.feature" 
			
			@Then("^User enters valid details$")
			public void user_enter_valid_details() throws Throwable {
	//			google.user_enters_valid_details();
			}
			
			@Then("^User successfully Registered$")
			public void user_successfully_registered() throws Throwable {
				register.user_successfully_registered();
			}
	}

