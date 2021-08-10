package freeCRM.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FreeCRMPricingElements {
	
	@FindBy (xpath= "(//A[@href='https://freecrm.com'])[1]")
	public WebElement HomePage;

	@FindBy (xpath = "//A[@href='pricing.html'][text()='Pricing']")
	public WebElement Pricing;
}
