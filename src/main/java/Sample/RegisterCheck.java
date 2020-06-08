package Sample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegisterCheck {
		// TODO Auto-generated method stub
		WebDriver driver;
		
		@Given("^Open the Chrome and start the application_India$")
		public void open_the_chrome_and_run_application_India() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "E:\\ooha\\chromedriver_win32\\chromedriver.exe"); 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.gillette.co.in/en-in");
		}
		 
		 @When("^User navigates to register Page for India$")
		 public void user_navigates_to_register_page_for_India() throws Throwable {
			 driver.get("https://www.gillette.co.in/en-in/createprofilepage");
		 }
		 
		 @Then("^Enter all the required details$")
		 public void enter_all_the_required_details() throws Throwable {
			 // TODO Auto-generated method stub
			 driver.findElement(By.id("phdesktopbody_0_grs_consumer[firstname]")).sendKeys("Guest");
			 driver.findElement(By.id("phdesktopbody_0_grs_consumer[lastname]")).sendKeys("Name");
			 driver.findElement(By.id("phdesktopbody_0_grs_account[emails][0][address]")).sendKeys("GuestName@gmail.com");
			 driver.findElement(By.id("phdesktopbody_0_grs_account[password][password]")).sendKeys("Password123");
			 driver.findElement(By.id("phdesktopbody_0_grs_account[password][confirm]")).sendKeys("Password123");
			 driver.findElement(By.id("phdesktopbody_0_grs_consumer[birthdate][month]")).sendKeys("10");
			 driver.findElement(By.id("phdesktopbody_0_grs_consumer[birthdate][year]")).sendKeys("1995");
			 driver.findElement(By.id("phdesktopbody_0_grs_account[addresses][0][postalarea]")).sendKeys("560100");
			 driver.findElement(By.id("phdesktopbody_0_submit")).click();
				}
			
		 @Then("^User should be able to Register successfully$")
		 public void user_should_be_able_to_Register_successfully() throws Throwable {
			 driver.findElement(By.id("phdesktopbody_0_submit")).click();
			 System.out.println("User Register successful");
			 
				driver.close();
		 }
		 
		 //Aus
		 
			@Given("^Open the chrome and start the application_Aus$")
			public void open_the_Chrome_and_start_the_application_Aus() throws Throwable {
				System.setProperty("webdriver.chrome.driver", "E:\\ooha\\chromedriver_win32\\chromedriver.exe"); 
				driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.get("https://www.gillette.de/");
				}
	 
			@When("^User navigates to Register Page for Aus$")
		    public void user_navigates_to_Register_Page_for_Aus() throws Throwable {
				driver.get("https://www.gillette.de/login.jsp");
			}
			
			@Then("^User enters the details$")
			public void user_enters_the_details() throws Throwable {
					driver.get("https://www.gillette.de/accountCreate.account?");
					Thread.sleep(8000);
					driver.findElement(By.name("customerName")).sendKeys("Guest");
					driver.findElement(By.id("customerEmail")).sendKeys("Nameguest@gmail.com");
					driver.findElement(By.id("confirmCustomerEmail")).sendKeys("Nameguest@gmail.com");
					driver.findElement(By.id("customerPassword")).sendKeys("Password123");
					driver.findElement(By.id("confirmPassword")).sendKeys("Password123");
					Thread.sleep(3000);
					driver.findElement(By.id("onetrust-accept-btn-handler")).click();
					driver.findElement(By.name("OptInReceiveNewsLetterRadio")).click();
					driver.findElement(By.id("continue")).click();
					}
			
			@Then("^User registration successful$")
			public void user_registration_successful() throws Throwable {
				System.out.println("User Register successful");
			}
			
			//France
			
			@Given("^Open the chrome and start the application_France$")
			public void open_the_chrome_and_start_the_application_France() throws Throwable {
				System.setProperty("webdriver.chrome.driver", "E:\\ooha\\chromedriver_win32\\chromedriver.exe"); 
				driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.get("https://www.gillette.fr/");
				}
	 
			@When("^User navigates to Register Page for France$")
		    public void user_navigates_to_register_page_for_France() throws Throwable {
				driver.get("https://www.gillette.fr/connexion");
			}
			
			@Then("^User enters valid details$")
			public void user_enters_valid_details() throws Throwable {
				 // TODO Auto-generated method stub
				driver.findElement(By.id("SubmitCreate")).click();
				driver.findElement(By.id("customer_firstname")).sendKeys("Guest"); 
				driver.findElement(By.id("customer_lastname")).sendKeys("name");
				driver.findElement(By.id("email")).sendKeys("Guestname@gmail.com");
				driver.findElement(By.id("passwd")).sendKeys("Password123");
				driver.findElement(By.id("years")).sendKeys("1995");
				driver.findElement(By.id("months")).sendKeys("October");
				driver.findElement(By.id("days")).sendKeys("5");
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@id=\"authentication\"]/div[1]/div[2]/div[4]/div[2]/div/button")).click();
				driver.findElement(By.id("uniform-noThanks")).click();
				driver.findElement(By.id("submitAccount")).click();
				driver.findElement(By.id("logout_link")).click();
				}
			
			@Then("^User successfully Registered$")
			public void user_successfully_registered() throws Throwable {
				System.out.println("User Register successful");
				
			}
	
}
	



