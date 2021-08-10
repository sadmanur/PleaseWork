package freeCRM.pageActions;

import org.openqa.selenium.support.PageFactory;

import freeCRM.pageElements.FreeCRMSupportElements;
import freeCRM.utilities.DriverSetUp;

public class FreeCRMSupportPageActions extends FreeCRMPricingPageActions  {

	FreeCRMSupportElements supportElements;

	public FreeCRMSupportPageActions() {

		this.supportElements = new FreeCRMSupportElements();
		PageFactory.initElements(DriverSetUp.chromeDriver, supportElements);
	
		
		
	}

	public void clickSupportButton() {
		supportElements.Support.click();
		
		
	}
}
