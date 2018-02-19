package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ConfirmationPage {
	
	@FindBy(how=How.XPATH, using="//p[contains(text(), 'Thank you')]")
	public WebElement para_confirm;
	
}
