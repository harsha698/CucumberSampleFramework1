package stepDefinitions;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import junit.framework.Assert;
import pageClasses.ConfirmationPageAction;
import testContext.TestContext;


@SuppressWarnings("deprecation")
public class ConfirmationPageStepDefi {

	public WebDriver driver;
	public ConfirmationPageAction confirm;
	public TestContext testContext;
		
	public ConfirmationPageStepDefi(TestContext testContext){
		this.testContext = testContext;
		confirm = testContext.getPageObjectManager().getConfirmationPageAction();
	}
	
	@Then("^he received an order confirmation page$") 
	public void verifyConfirmationPage() {
			String text = confirm.getConfirmationText();
			Assert.assertEquals("cdcd", text);
			}
}
