package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import managers.FileReaderManager;
import pageObjects.HomePage;

public class HomePageAction {
	
	public WebDriver driver;
	public Actions act;
	public HomePage homePage;
	
	public HomePageAction(WebDriver driver){
		
		this.driver=driver;
		homePage = new HomePage();
		PageFactory.initElements(driver, HomePage.class);
		act = new Actions(driver);
	}
	
	public void navigateToHome(){
		driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl());
	}
	
	public void clickOnItem(){
		act.moveToElement(homePage.lnk_WomanHeader).perform();
		homePage.lnk_WomanDresses_Sequin.click();
	}
	
	
	
	
	
}
