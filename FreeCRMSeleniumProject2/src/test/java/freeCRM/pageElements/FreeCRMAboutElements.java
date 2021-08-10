package freeCRM.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FreeCRMAboutElements {
	
	@FindBy (xpath= "(//A[@href='https://freecrm.com'])[1]")
	public WebElement HomePage;
	
	@FindBy (xpath = "//A[@href='about.html'][text()='About']")
	public WebElement About;

	
}
