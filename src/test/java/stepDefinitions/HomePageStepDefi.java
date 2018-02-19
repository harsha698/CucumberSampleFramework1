package stepDefinitions;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pageClasses.HomePageAction;
import testContext.TestContext;


public class HomePageStepDefi {

	public WebDriver driver;
	public HomePageAction home;
	public TestContext testContext;
	
	
	public HomePageStepDefi(TestContext testContext){
		this.testContext = testContext;
		home = testContext.getPageObjectManager().getHomePageAction();
	}
	
	@Given("^User is on Home page$") 
	public void launchHomePage() {
		home.navigateToHome();
	}
	
	@When("^He searches for an item$") 
	public void itemSearch() {
			home.clickOnItem();
		}
}
