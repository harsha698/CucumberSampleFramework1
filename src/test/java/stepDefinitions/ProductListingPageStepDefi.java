package stepDefinitions;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.And;
import pageClasses.ProductListingPageAction;
import testContext.TestContext;

public class ProductListingPageStepDefi {
	public WebDriver driver;
	public ProductListingPageAction product;
	public TestContext testContext;

	public ProductListingPageStepDefi(TestContext testContext){
		this.testContext=testContext;
		product = testContext.getPageObjectManager().getProductListingPageAction();
	}
	
	
	@And("^Choose to buy first item$") 
		public void chooseItemToBePurchased() {
	    	product.clickOnPurchaseItem();
    	  }
	
	
}
