package testRunners;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions; 
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class) 
@CucumberOptions(features="Features/Forgotpswd.feature",glue={"stepDefinitions"}, plugin= {
	"junit:target/cucumber-junit-report.xml", 
		"junit:target/allure-maven/index.htm", "json:target/allure-results/Cucumber.json"}) 
	public class PasswordRun 
	{
	}
