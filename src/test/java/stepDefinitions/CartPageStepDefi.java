package stepDefinitions;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.And;
import pageClasses.CartPageAction;
import testContext.TestContext;

public class CartPageStepDefi {

	public WebDriver driver;
	public CartPageAction cart;
	public TestContext testContext;
	
	public CartPageStepDefi(TestContext testContext){
		this.testContext = testContext;
		cart = testContext.getPageObjectManager().getCartPageAction();
	}
	
	 @And("^Moves to check out from mini cart$") 
		public void moveToCheckOut() {
 			cart.addToCart();
 			cart.checkOut();
			}
	
	
}
