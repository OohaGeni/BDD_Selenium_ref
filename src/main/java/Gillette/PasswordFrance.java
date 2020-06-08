package Gillette;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PasswordFrance {
	
	WebDriver driver;
	@Given("^Open the chrome and launch the application$")
	public void open_the_chrome_and_launch_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "E:\\ooha\\chromedriver_win32\\chromedriver.exe"); 
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.gillette.fr/");
	}

	@When("^User directs to Login Page$")
    public void user_directs_to_Login_Page() throws Throwable {
        driver.get("https://www.gillette.fr/connexion?");
	}
	
	@Then("^User enters Valid username$")
	public void user_enters_valid_username() throws Throwable {
		driver.findElement(By.id("email")).sendKeys("Guestname@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"login_form\"]/div[2]/p[1]/a")).click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		}
	
	@Then("^User resets the password$")
	public void user_resets_the_password() throws Throwable {
		driver.findElement(By.id("email")).sendKeys("Guestname@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"form_forgotpassword\"]/p/button")).click();
		System.out.println("Reset password successful");
		Thread.sleep(3000);
		driver.close();
	}
}
