package managers;

import org.openqa.selenium.WebDriver;

import pageClasses.CartPageAction;
import pageClasses.CheckOutPageAction;
import pageClasses.ConfirmationPageAction;
import pageClasses.HomePageAction;
import pageClasses.ProductListingPageAction;

public class PageObjectManager {
	
	public WebDriver driver;
	public HomePageAction homePageAction;
	public ProductListingPageAction productListingPageAction;
	public CartPageAction cartPageAction;
	public CheckOutPageAction checkOutPageAction;
	public ConfirmationPageAction confirmationPageAction;
	
	
	public PageObjectManager(WebDriver driver){
		this.driver=driver;
	}
	
	public HomePageAction getHomePageAction(){
		return (homePageAction==null) ? new HomePageAction(driver) : homePageAction;
	}
	
		
	public ProductListingPageAction getProductListingPageAction(){
		return (productListingPageAction==null) ? new ProductListingPageAction(driver) : productListingPageAction;
	}
	
	public CartPageAction getCartPageAction(){
		return (cartPageAction==null) ? new CartPageAction(driver) : cartPageAction;
	}
	
	public CheckOutPageAction getCheckOutPageAction(){
		return (checkOutPageAction==null) ? new CheckOutPageAction(driver) : checkOutPageAction;
	}
	
	public ConfirmationPageAction getConfirmationPageAction(){
		return (confirmationPageAction==null) ? new ConfirmationPageAction(driver) : confirmationPageAction;
	}
}
