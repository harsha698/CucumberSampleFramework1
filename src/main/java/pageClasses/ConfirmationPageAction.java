package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import pageObjects.ConfirmationPage;

public class ConfirmationPageAction {
	
	public ConfirmationPage confirmationPage;
	@FindBy(how=How.XPATH, using="//p[contains(text(), 'Thank you')]")
	public WebElement para_confirm;
	
	public ConfirmationPageAction(WebDriver driver){
		
		confirmationPage = new ConfirmationPage();
		PageFactory.initElements(driver, confirmationPage);
	}
	
	public String getConfirmationText(){
		String text = confirmationPage.para_confirm.toString().trim();
		return text;
	}
	
}
