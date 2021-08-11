package freeCRMStepDef;

import org.testng.Assert;

import freeCRM.pageActions.FreeCRMLoginPageActions;
import freeCRM.utilities.DriverSetUp;
import io.cucumber.java.en.*;


public class FreeCRMLoginStepDef {
	
	FreeCRMLoginPageActions freeCRMLoginPageAction = new FreeCRMLoginPageActions();

	@Given("Customer in FreeCRM login page")
	public void customer_in_FreeCRM_login_page() {
		freeCRMLoginPageAction.getFreeCRMLoginPage();
	}

	@When("Customer gives E-mail address input {string}")
	public void customer_gives_E_mail_address_input(String emailAddress) {
		freeCRMLoginPageAction.inputEmailAddress(emailAddress);
	}

	@When("Customer gives password input {string}")
	public void customer_gives_password_input(String password) {
		freeCRMLoginPageAction.inputPassword(password);
	}

	@When("Customer clicks the Login button")
	public void customer_clicks_the_Login_button() {
		freeCRMLoginPageAction.clickLoginButton();
	}

	@Then("Customer should be able to login")
	public void customer_should_be_able_to_login() {
		String expectedURL = "https://ui.cogmento.com/";
		String actualURL = DriverSetUp.chromeDriver.getCurrentUrl();
		Assert.assertNotEquals(expectedURL, actualURL );
	}

	@When("Customer gives  input {string}")
	public void customer_gives_input(String emailAddress) {
	    freeCRMLoginPageAction.inputEmailAddress(emailAddress);
	}

	@Then("Customer should NOT be able to login")
	public void customer_should_NOT_be_able_to_login() {
		String expectedURL = "https://ui.cogmento.com/";
		String actualURL = DriverSetUp.chromeDriver.getCurrentUrl();
		Assert.assertNotEquals(expectedURL, actualURL);
	}

}
