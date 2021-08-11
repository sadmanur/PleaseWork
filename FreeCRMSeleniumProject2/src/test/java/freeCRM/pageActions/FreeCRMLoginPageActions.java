package freeCRM.pageActions;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.PageFactory;
import freeCRM.pageElements.*;
import freeCRM.utilities.DriverSetUp;

public class FreeCRMLoginPageActions extends FreeCRMLoginElements{

	FreeCRMLoginPageActions loginElements;
	
	public FreeCRMLoginPageActions () {

		this.loginElements = new FreeCRMLoginPageActions();
		PageFactory.initElements(DriverSetUp.chromeDriver, loginElements);
	
	}
	
	public void getFreeCRMLoginPage() {
		DriverSetUp.chromeDriver.get("https://ui.cogmento.com/");
		DriverSetUp.chromeDriver.manage().window().maximize();
		DriverSetUp.chromeDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	}
	public void inputEmailAddress(String emailAddress) {
		loginElements.emailaddress.sendKeys(emailAddress);
	}
	
	public void inputPassword(String password) {
		loginElements.password.sendKeys(password);
		
	}
	public void clickLoginButton() {
		loginElements.login.click();
		
	}
	
	public String errorMessage() {
		String error = loginElements.errorMessage.getText();
		return error;
	
	}

	
}
