package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pageObjects.CheckOutPage;
import testDataTypes.Customer;
import utilities.Utils;
import utilities.Wait;

public class CheckOutPageAction {
	
	public CheckOutPage checkOutPage;
	public WebDriver driver;
	
	public CheckOutPageAction(WebDriver driver){
		this.driver=driver;
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
		Wait.untilJqueryIsDone(driver);
		Utils.sel_dropDown(checkOutPage.sel_BillingCountry, countryname);
	}
	
	public void selectState(String stateName){
		checkOutPage.drp_County.click();
		Wait.untilJqueryIsDone(driver);
		Utils.sel_dropDown(checkOutPage.sel_billing_state, stateName);
	}
	
	public void fill_PersonalDetails(Customer customer){
		enterFirstName(customer.firstName);
		enterlastName(customer.lastName);
		enterEmail(customer.emailAddress);
		enterPhone(customer.phoneNumber.home);
		enterAdress(customer.address.streetAddress1, customer.address.streetAddress2);
		enterCity(customer.address.city);
		enterZip(customer.address.postCode);
		selectCountry(customer.address.country);
		selectState(customer.address.county);
	}
		
	public void selectDeliveryAddress(){
		if(!checkOutPage.chk_DifferentAdd.isSelected())
			checkOutPage.chk_DifferentAdd.click();
			Wait.untilJqueryIsDone(driver);
			
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
		Wait.untilJqueryIsDone(driver);
	}
	

}
