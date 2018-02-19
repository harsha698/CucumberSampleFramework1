package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CartPage {
	
	@FindBy(how=How.XPATH, using="//button[text()='Add to cart']")
	public WebElement btn_AddToCart;
	
	@FindBy(how=How.XPATH, using="//*[@id='nav-menu-item-cart']/a/span/i")
	public WebElement icon_cart;
	
	@FindBy(how=How.XPATH, using="//span[text()='Checkout']")
	public WebElement btn_CheckOut;
	
	

}
