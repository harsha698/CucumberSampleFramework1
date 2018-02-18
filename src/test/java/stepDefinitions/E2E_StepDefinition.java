package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class E2E_StepDefinition {

	@Given("^User is on Home page$") 
	public void launchHomePage() {
		
	}
	@When("^He searches for an item$") 
		public void itemSearch() {
				
			}
    @And("^Choose to buy first item$") 
		public void chooseItemToBePurchased() {
				
			}
    @And("^Moves to check out from mini cart$") 
		public void moveToCheckOut() {
				
			}
    @And("^enter personal details on checkout page$") 
		public void enterDetails() {
				
			}
    @And("^select same delivery address$") 
		public void selectSameDelivery() {
				
			}
    @And("^select payment method as \"check\" payment$") 
		public void selectPaymentMode() {
				
			}
    @And("^click on Place order button$") 
		public void clickPlaceOrder() {
				
			}
    @Then("^he received an order confirmation page$") 
		public void verifyConfirmationPage() {
				
			}
	
	
}
