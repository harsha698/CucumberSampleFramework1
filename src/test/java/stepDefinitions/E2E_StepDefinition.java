package stepDefinitions;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import managers.PageObjectManager;
import managers.WebDriverManager;
import pageClasses.CartPageAction;
import pageClasses.CheckOutPageAction;
import pageClasses.ConfirmationPageAction;
import pageClasses.HomePageAction;
import pageClasses.ProductListingPageAction;

@SuppressWarnings("deprecation")
public class E2E_StepDefinition {
	
	public WebDriver driver;
	
	public HomePageAction home;
	public ProductListingPageAction product;
	public CartPageAction cart;
	public CheckOutPageAction checkOut;
	public ConfirmationPageAction confirm;
	
		
	public PageObjectManager pageObjectManager;
	public WebDriverManager manager ;
	
	@Given("^User is on Home page$") 
	public void launchHomePage() {
		
		manager = new WebDriverManager();
		driver = manager.getDriver();
		pageObjectManager = new PageObjectManager(driver);
		home = pageObjectManager.getHomePageAction();
		home.navigateToHome();
	}
	
	@When("^He searches for an item$") 
		public void itemSearch() {
				home.clickOnItem();
			}
    
	@And("^Choose to buy first item$") 
		public void chooseItemToBePurchased() {
	    	product = pageObjectManager.getProductListingPageAction();
	    	product.clickOnPurchaseItem();
    	    }
	
    @And("^Moves to check out from mini cart$") 
		public void moveToCheckOut() {
    			cart = pageObjectManager.getCartPageAction();
    			cart.addToCart();
    			cart.checkOut();
			}
    
    @And("^enter personal details on checkout page$") 
		public void enterDetails() {
    			checkOut = pageObjectManager.getCheckOutPageAction();
    			checkOut.fill_PersonalDetails();
			}
    
    @And("^select same delivery address$") 
		public void selectSameDelivery() {
    			checkOut.selectDeliveryAddress();
			}
    
    @And("^select payment method as check payment$") 
		public void selectPaymentMode() {
    			checkOut.paymentMode();
			}
    @And("^accept TNC$")
		    public void acceptTNC() {
		    	checkOut.clickAcceptTNC();
			}
    
    @And("^click on Place order button$") 
		public void clickPlaceOrder() {
    			checkOut.clickPlaceorder();
			}
    @Then("^he received an order confirmation page$") 
		public void verifyConfirmationPage() {
    			confirm = pageObjectManager.getConfirmationPageAction();
    			String text = confirm.getConfirmationText();
    			Assert.assertEquals("cdcd", text);
    			manager.quitDriver();
			}
	
	
}
