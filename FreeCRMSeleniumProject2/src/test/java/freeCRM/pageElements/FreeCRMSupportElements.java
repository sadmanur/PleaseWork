package freeCRM.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FreeCRMSupportElements {
	
	@FindBy (xpath= "(//A[@href='https://freecrm.com'])[1]")
	public WebElement HomePage;

	@FindBy (xpath = "//*[contains(text(),\"Support\")]")
	public WebElement Support;
}
