package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import common.WebDriverFactory;

public class AdminPage {

	@FindBy(id="btnAdd")
	WebElement addUserButton;
		
	private WebDriverWait wait;
	
	public AdminPage() 
	{
		PageFactory.initElements(WebDriverFactory.threadStorage.get(), this);
		wait = new WebDriverWait(WebDriverFactory.threadStorage.get(), 20);
		isPageLoaded();
	}
	
	public AddUserPage NavigatetoAddUserPage()
	{
		System.out.println("I am on Admin Page");
		addUserButton.click();
		return new AddUserPage().isPageLoaded();
	}
	
	public AdminPage isPageLoaded()
	{
		wait.until(ExpectedConditions.visibilityOf(addUserButton));
		return this;
	}
	
}
