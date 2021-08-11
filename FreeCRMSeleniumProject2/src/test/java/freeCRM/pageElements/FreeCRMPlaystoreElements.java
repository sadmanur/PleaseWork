package freeCRM.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FreeCRMPlaystoreElements {
	@FindBy (xpath= "(//A[@href='https://freecrm.com'])[1]")
	public WebElement HomePage;
	
	@FindBy (xpath = "//img[@alt='Android']")
	public WebElement Playstore;

}

