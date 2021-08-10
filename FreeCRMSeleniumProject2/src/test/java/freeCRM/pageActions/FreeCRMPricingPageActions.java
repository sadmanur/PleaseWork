package freeCRM.pageActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import freeCRM.pageElements.FreeCRMPricingElements;
import freeCRM.utilities.DriverSetUp;

public class FreeCRMPricingPageActions {

	FreeCRMPricingElements pricingElements;

	public FreeCRMPricingPageActions() {

		this.pricingElements = new FreeCRMPricingElements();
		PageFactory.initElements(DriverSetUp.chromeDriver, pricingElements);

	}

	public void getFreeCRMHomePage() {
		DriverSetUp.chromeDriver.get("https://freecrm.com/");
		DriverSetUp.chromeDriver.manage().window().maximize();
		DriverSetUp.chromeDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	public void clickPricingPage() {
		pricingElements.Pricing.click();
	}
}
