package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CheckOutPage {
		
	@FindBy(how=How.ID, using="billing_first_name")
	public WebElement txt_FirstName;
	
	@FindBy(how=How.ID, using="billing_last_name")
	public WebElement txt_LastName;
	
	@FindBy(how=How.ID, using="billing_email")
	public WebElement txt_Email;
	
	@FindBy(how=How.ID, using="billing_phone")
	public WebElement txt_Phone;
	
	@FindBy(how=How.ID, using="select2-chosen-1")
	public WebElement drp_BillingCountry;	
	
	@FindBy(how=How.ID, using="billing_country")
	public WebElement sel_BillingCountry;
	
	@FindBy(how=How.ID, using="billing_address_1")
	public WebElement txt_addLine1;
	
	@FindBy(how=How.ID, using="billing_address_2")
	public WebElement txt_addLine2;
	
	@FindBy(how=How.ID, using="billing_city")
	public WebElement txt_billing_city;
	
	@FindBy(how=How.ID, using="billing_postcode")
	public WebElement txt_billing_postcode;
	
	@FindBy(how=How.ID, using="select2-chosen-2")
	public WebElement drp_County;
		
	@FindBy(how=How.ID, using="billing_state")
	public WebElement sel_billing_state;
	
	@FindBy(how=How.ID, using="ship-to-different-address-checkbox")
	public WebElement chk_DifferentAdd;
	
	@FindBy(how=How.ID, using="payment_method_cheque")
	public WebElement rd_CheqPayment;
	
	@FindBy(how=How.ID, using="terms")
	public WebElement chk_TermsAndC;
		
	@FindBy(how=How.ID, using="place_order")
	public WebElement btn_PlaceOrder;
	
		
	

}
