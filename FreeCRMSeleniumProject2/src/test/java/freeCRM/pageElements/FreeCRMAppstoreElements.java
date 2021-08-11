package freeCRM.pageElements;


	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;

	public class FreeCRMAppstoreElements {
		@FindBy (xpath= "(//A[@href='https://freecrm.com'])[1]")
		public WebElement HomePage;
		
		@FindBy(xpath = "//img[@alt='iTunes']")
		public WebElement Appstore;

	}

