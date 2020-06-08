package testRunners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class) 
@CucumberOptions(features= "F1", glue={"StepDef"}, plugin= {
		"junit:target/cucumber-junit-report.xml", 
		"junit:target/allure-maven/index.htm", "json:target/allure-results/Cucumber.json"})
	public class GoibiboRun 
	{
	}