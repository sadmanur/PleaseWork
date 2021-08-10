package freeCRMStepDef;

import org.testng.Assert;

import freeCRM.pageActions.FreeCRMPricingPageActions;
import freeCRM.pageActions.FreeCRMSupportPageActions;
import freeCRM.utilities.DriverSetUp;
import io.cucumber.java.en.*;



public class FreeCRMSupportStepDef extends FreeCRMPricingPageActions {
	
	FreeCRMSupportPageActions freeCRMSupportPageAction = new FreeCRMSupportPageActions();
	
	
	@Given("User is in the homepage of FreeCRM {string}")
	public void user_is_in_the_homepage_of_FreeCRM(String string) {
		freeCRMSupportPageAction.getFreeCRMHomePage();
	 
	}

	@When("User clicks on the support option")
	public void user_clicks_on_the_support_option() {
		freeCRMSupportPageAction.clickSupportButton();
	 
	}

	@Then("User should be able to open the support page of FreeCRM {string}")
	public void user_should_be_able_to_open_the_support_page_of_FreeCRM(String string) {
		String expectedURL = "https://support.cogmento.com/en/collections/1398782-webinars-videos";
		String actualURL = DriverSetUp.chromeDriver.getCurrentUrl();
		Assert.assertNotEquals(expectedURL, actualURL );
		
	}
}