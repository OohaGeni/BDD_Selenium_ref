package Sample;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginCheck {
	
		WebDriver driver;
		
		@Given("^Open the chrome and start application_India$")
		public void open_the_chrome_and_start_application_India() throws Throwable{
		System.setProperty("webdriver.chrome.driver", "E:\\ooha\\chromedriver_win32\\chromedriver.exe"); 
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.gillette.co.in/en-in");
		}
		
		@When("^User navigates to Login Page$")
	    public void user_navigates_to_Login_Page() throws Throwable {
	        driver.get("https://www.gillette.co.in/en-in/loginpage");
	    }
		
		@Then("^I enter valid username and valid password$")
		public void i_enter_valid_username_and_valid_password() {
		driver.findElement(By.id("phdesktopbody_0_username")).sendKeys("Guestname@gmail.com");
		driver.findElement(By.name("phdesktopbody_0$ctl04")).sendKeys("Password123");
		driver.findElement(By.id("phdesktopbody_0_Sign In")).click();
		
		}
		@Then("^User should be able to login successfully$")
		public void user_should_be_able_to_login_successfully() throws Throwable {
			System.out.println("User login successful");
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			driver.close();
		}

		
		@Given("^Open the Chrome and start the application_Aus$")
		public void open_the_chrome_and_start_application_Aus() {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "E:\\ooha\\chromedriver_win32\\chromedriver.exe"); 
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://www.gillette.de/");
			}
		
		@When("^User navigates to Login Page for Aus$")
	    public void user_navigates_to_Login_Page_for_Aus() throws Throwable {
			driver.get("https://www.gillette.de/login.jsp");
		}

		@Then("^I enter valid login credentials$")
	
		// Uncomment the below lines while executing the SampleRun.java with features="FF1/Sample2.feature" for Registration Check
	
//		public void user_enters_the_details() throws Throwable {
//			driver.get("https://www.gillette.de/accountCreate.account?");
//			Thread.sleep(8000);
//			driver.findElement(By.name("customerName")).sendKeys("Name");
//			driver.findElement(By.id("customerEmail")).sendKeys("Abc@gmail.com");
//			driver.findElement(By.id("confirmCustomerEmail")).sendKeys("Abc@gmail.com");
//			driver.findElement(By.id("customerPassword")).sendKeys("Password123");
//			driver.findElement(By.id("confirmPassword")).sendKeys("Password123");
//			Thread.sleep(3000);
//			driver.findElement(By.id("onetrust-accept-btn-handler")).click();
//			driver.findElement(By.name("OptInReceiveNewsLetterRadio")).click();
//			driver.findElement(By.id("continue")).click();
//				}
		
		// Comment the below lines while executing the Sample Run with features="FF1/Sample.feature" & Vice versa
		
		public void I_enter_valid_login_credentials() throws Throwable {
				driver.findElement(By.id("username")).sendKeys("Guestname@gmail.com");
				driver.findElement(By.id("password")).sendKeys("Password123");
				Thread.sleep(5000);
				driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]")).click();
				driver.findElement(By.id("login-submit")).click();
				}
		
		@Then("^User login is successful$")
		public void user_login_is_successful() throws Throwable {
			// TODO Auto-generated method stub
			System.out.println("User login successful");
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			driver.close();
		}

		@Given("^Open the chrome and start the application_France$")
		public void open_the_chrome_and_start_application_France() throws Throwable {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "E:\\ooha\\chromedriver_win32\\chromedriver.exe"); 
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://www.gillette.fr/");
			}

		@When("^User navigates to Login Page for France$")
		public void user_navigates_to_Login_Page_for_France() throws Throwable {
			// TODO Auto-generated method stub
			driver.get("https://www.gillette.fr/connexion");
		}

		@Then("^User enters valid credentials$")
		
		// Uncomment the below lines while executing the Sample Run with features="FF1/Sample2.feature" for Registration Check & Vice versa
		
//		public void user_enters_valid_details() throws Throwable {
//			 // TODO Auto-generated method stub
//			driver.findElement(By.id("SubmitCreate")).click();
//			driver.findElement(By.id("customer_firstname")).sendKeys("Guest"); 
//			driver.findElement(By.id("customer_lastname")).sendKeys("name");
//			driver.findElement(By.id("email")).sendKeys("Guestname@gmail.com");
//			driver.findElement(By.id("passwd")).sendKeys("Password123");
//			driver.findElement(By.id("years")).sendKeys("1995");
//			driver.findElement(By.id("months")).sendKeys("October");
//			driver.findElement(By.id("days")).sendKeys("5");
//			Thread.sleep(3000);
//			driver.findElement(By.xpath("//*[@id=\"authentication\"]/div[1]/div[2]/div[4]/div[2]/div/button")).click();
//			driver.findElement(By.id("uniform-noThanks")).click();
//			WebDriverWait wait = new WebDriverWait(driver,60);  // user needs to click on the captcha
//			driver.findElement(By.id("submitAccount")).click();
//			}
		
		// Comment the below lines while executing the Sample Run with features="FF1/Sample.feature" & Vice versa
		
		public void user_enters_valid_credentials() throws Throwable {
			// TODO Auto-generated method stub
				driver.findElement(By.id("email")).sendKeys("Guestname@gmail.com");
				driver.findElement(By.id("passwd")).sendKeys("Password123");
				driver.findElement(By.id("SubmitLogin")).click(); 
				}

		@Then("^User successfully loggedin$")
		public void user_successfully_loggedin() throws Throwable {
			// TODO Auto-generated method stub
			System.out.println("User login successful");
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			driver.close();
		}
		}


	
	
