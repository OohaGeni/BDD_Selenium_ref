package Goibibo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.Keys;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LaunchGoibibo {
	WebDriver driver;
	@Given("^Open the firefox and start application$")
	public void open_the_firefox_and_start_application() throws Throwable {
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\rohit\\Downloads\\geckodriver-v0.26.0-win32\\geckodriver.exe");
	driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.goibibo.com/");
	}
	
	@When("^Select any one option$")
	public void select_any_one_option() throws Throwable {
		driver.findElement(By.id("oneway")).click();
	}

	@Then("^User fills the required details$")
	public void user_fills_the_required_details() throws Throwable {
		// TODO Auto-generated method stub
		driver.findElement(By.id("gosuggest_inputSrc")).sendKeys("BLR");
		Thread.sleep(5000);
		driver.findElement(By.id("gosuggest_inputSrc")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("gosuggest_inputSrc")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//*[@id=\"gosuggest_inputSrc\"]")).click();
		
		driver.findElement(By.id("gosuggest_inputDest")).sendKeys("BOM");
		Thread.sleep(5000);
		driver.findElement(By.id("gosuggest_inputDest")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("gosuggest_inputDest")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//*[@id=\"gosuggest_inputDest\"]")).click();

		driver.findElement(By.id("departureCalendar")).click();
		driver.findElement(By.xpath("//*[@id=\"fare_20200623\"]")).click();  
		driver.findElement(By.id("pax_link_common")).click();
		
		WebElement travel_element = driver.findElement(By.xpath("//select[@id=\"gi_class\"]"));
		Select sel_travel_class = new Select(travel_element);
		sel_travel_class.selectByValue("B");
		
		driver.findElement(By.id("gi_search_btn")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/div[2]/div[2]/div[2]/div/div[2]/div[1]/div/div/div[1]/div[2]/span/span")).click();
		
		System.out.println("user reviews the booking page");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.close();
	}
			
		}