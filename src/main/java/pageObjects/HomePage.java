package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {

	@FindBy(how=How.XPATH, using="//*[@id='menu-item-2213']/a")
	public WebElement lnk_WomanHeader;
	
	@FindBy(how=How.XPATH, using="//*[@id='menu-item-2219']/a")
	public WebElement lnk_WomanDresses_Sequin;
	
	
	
	
	
	
	
}
