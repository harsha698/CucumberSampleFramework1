package testRunners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\Public\\CucumberSampleFramework1\\src\\test\\resources\\featureFiles\\E2EFeatureTest.feature",
		glue= {"stepDefinitions"}
		)

public class TestRunner1 {

}
