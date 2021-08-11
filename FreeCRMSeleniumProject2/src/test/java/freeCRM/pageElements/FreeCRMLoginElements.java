package freeCRM.pageElements;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FreeCRMLoginElements {
	
	@FindBy (xpath = "//INPUT[@type='text']")
	public WebElement emailaddress;
	
	@FindBy (xpath = "//INPUT[@type='password']")
	public WebElement password;
	
	@FindBy (xpath = "//div[@class='ui fluid large blue submit button']")
	public WebElement login;
	
	@FindBy (xpath = "//div[@class='header']")
	public WebElement errorMessage;

}
