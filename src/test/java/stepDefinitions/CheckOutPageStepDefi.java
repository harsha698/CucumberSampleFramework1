package stepDefinitions;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.And;
import managers.FileReaderManager;
import pageClasses.CheckOutPageAction;
import testContext.TestContext;
import testDataTypes.Customer;


public class CheckOutPageStepDefi {
	public WebDriver driver;
	public CheckOutPageAction checkOut;
	public TestContext testContext;
	
	public CheckOutPageStepDefi(TestContext testContext){
		this.testContext = testContext;
		checkOut = testContext.getPageObjectManager().getCheckOutPageAction();
	}
	
	@And("^enter \"(.*)\" details on checkout page$") 
	public void enterDetails(String customerName) {
			Customer customer = FileReaderManager.getInstance().getJsonReader().getCustomerByName(customerName);
			checkOut.fill_PersonalDetails(customer);
		}

	@And("^select same delivery address$") 
		public void selectSameDelivery() {
				checkOut.selectDeliveryAddress();
			}

	@And("^select payment method as check payment$") 
		public void selectPaymentMode() {
				checkOut.paymentMode();
			}
	
	@And("^accept TNC$")
		    public void acceptTNC() {
		    	checkOut.clickAcceptTNC();
			}

	@And("^click on Place order button$") 
		public void clickPlaceOrder() {
				checkOut.clickPlaceorder();
			}
	
}
