package pages;
//import static org.testng.Assert.assertEquals;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import common.WebDriverFactory;

public class HomePage {

	@FindBy(id="welcome")
	private WebElement welcomeText;
	
	@FindBy(id="menu_admin_viewAdminModule")
	private WebElement admintab;
	
	private WebDriverWait wait;

		public HomePage() {
		PageFactory.initElements(WebDriverFactory.threadStorage.get(), this);
		wait = new WebDriverWait(WebDriverFactory.threadStorage.get(), 30);   //Initialized in constructor
		}
	
		public HomePage verifyWelcomeText(String ExpectedWelcomeText)
		{
		Assert.assertEquals(welcomeText.getText().contains("Welcome"),ExpectedWelcomeText,"welcome is ");
		return new HomePage().isPageLoaded();
		}
		
		public AdminPage navigateToAdminpage() {
		admintab.click();
		return new AdminPage().isPageLoaded();
	}
		public HomePage isPageLoaded()
		{
			wait.until(ExpectedConditions.visibilityOf(admintab));
			wait.until(ExpectedConditions.visibilityOf(welcomeText));
			return this;
		}
}
