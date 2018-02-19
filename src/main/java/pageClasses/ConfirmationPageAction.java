package pageClasses;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.PageFactory;

import pageObjects.ConfirmationPage;

public class ConfirmationPageAction {
	
	public ConfirmationPage confirmationPage;
	public WebDriver driver;
		
	public ConfirmationPageAction(WebDriver driver){
		this.driver=driver;
		confirmationPage = new ConfirmationPage();
		PageFactory.initElements(driver, confirmationPage);
	}
	
	public String getConfirmationText(){
		String text = confirmationPage.para_confirm.toString().trim();
		return text;
	}
	
}
