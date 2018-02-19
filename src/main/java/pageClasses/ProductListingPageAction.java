package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageObjects.ProductListingPage;

public class ProductListingPageAction {
	public ProductListingPage productListingPage;
	public WebDriver driver;
	
	
	public ProductListingPageAction(WebDriver driver){
		this.driver=driver;
		productListingPage = new ProductListingPage();
		PageFactory.initElements(driver, ProductListingPage.class);
				
	}
	
	public void clickOnPurchaseItem(){
		productListingPage.lnk_Item.click();
	}
	
	

}
