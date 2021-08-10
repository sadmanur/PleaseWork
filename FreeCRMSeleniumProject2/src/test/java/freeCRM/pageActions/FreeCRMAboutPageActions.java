package freeCRM.pageActions;

import org.openqa.selenium.support.PageFactory;

import freeCRM.pageElements.FreeCRMAboutElements;
import freeCRM.utilities.DriverSetUp;

public class FreeCRMAboutPageActions extends FreeCRMPricingPageActions {

	FreeCRMAboutElements aboutElements;

	public FreeCRMAboutPageActions() {

		this.aboutElements = new FreeCRMAboutElements();
		PageFactory.initElements(DriverSetUp.chromeDriver, aboutElements);

	}

	
	public void clickAboutButton() {
	  aboutElements.About.click();
		
	}


	
		
}

