package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import pageObjects.CartPage;
import utilities.Wait;

public class CartPageAction {
	
	public CartPage cartPage;
	public Actions act;
	public WebDriver driver;
		
	public CartPageAction(WebDriver driver){
		this.driver=driver;
		cartPage = new CartPage();
		PageFactory.initElements(driver, CartPage.class);
		act = new Actions(driver);
		
	}
	
	public void addToCart(){
		cartPage.btn_AddToCart.click();
		Wait.untilJqueryIsDone(driver);
	}
	
	public void checkOut(){
		act.moveToElement(cartPage.icon_cart).perform();
		cartPage.btn_CheckOut.click();
	}
	
	

}
