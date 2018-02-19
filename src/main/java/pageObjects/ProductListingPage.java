package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ProductListingPage {
	
	@FindBy(how=How.XPATH, using="//div[@class='products noo-row']/div[1]/div[1]/div[1]/a")
	public WebElement lnk_Item;
	
	

}
