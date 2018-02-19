package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pageObjects.CheckOutPage;
import utilities.Utils;

public class CheckOutPageAction {
	
	public CheckOutPage checkOutPage;
	
	public CheckOutPageAction(WebDriver driver){
		
		checkOutPage = new CheckOutPage();
		PageFactory.initElements(driver, checkOutPage);
		
	}
	
	
	public void enterFirstName(String fname){
		checkOutPage.txt_FirstName.sendKeys(fname);
	}
	
	public void enterlastName(String lname){
		checkOutPage.txt_LastName.sendKeys(lname);
	}
	
	public void enterEmail(String email){
		checkOutPage.txt_Email.sendKeys(email);
	}
	
	public void enterPhone(String phone){
		checkOutPage.txt_Phone.sendKeys(phone);
	}
	
	public void enterAdress(String line1, String line2){
		checkOutPage.txt_addLine1.sendKeys(line1);
		checkOutPage.txt_addLine2.sendKeys(line2);
	}
	
	public void enterCity(String city){
		checkOutPage.txt_billing_city.sendKeys(city);
	}
	
	public void enterZip(String zip){
		checkOutPage.txt_billing_postcode.sendKeys(zip);
	}
	
	public void selectCountry(String countryname){
		checkOutPage.drp_BillingCountry.click();
		Utils.sel_dropDown(checkOutPage.sel_BillingCountry, countryname);
	}
	
	public void selectState(String stateName){
		checkOutPage.drp_County.click();
		Utils.sel_dropDown(checkOutPage.sel_billing_state, stateName);
	}
	
	public void fill_PersonalDetails(){
		enterFirstName("test1");
		enterlastName("test2");
		enterEmail("TestEmail@test.com");
		enterPhone("1234567890");
		enterAdress("Line1", "Line 2");
		enterCity("TestCity");
		enterZip("12345");
		selectCountry("Algeria");
		selectState("Maharashtra");
	}
		
	public void selectDeliveryAddress(){
		if(!checkOutPage.chk_DifferentAdd.isSelected())
			checkOutPage.chk_DifferentAdd.click();
			
	}
	
	public void paymentMode(){
		if(!checkOutPage.rd_CheqPayment.isSelected())
			checkOutPage.rd_CheqPayment.click();
	}
	
	public void clickAcceptTNC(){
		checkOutPage.chk_TermsAndC.click();
	}
	
	public void clickPlaceorder(){
		checkOutPage.btn_PlaceOrder.click();
	}
	

}
