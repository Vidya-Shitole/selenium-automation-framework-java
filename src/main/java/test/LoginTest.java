package test;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import common.IInvokedMethodImpl;
import common.WebBase;
//import pages.HomePage;
import pages.LoginPage;

@Listeners(IInvokedMethodImpl.class)
public class LoginTest extends WebBase{
	
	@Test(dataProvider="Login Data")
	public void verifyuserLoginsuccessful(String userName, String password, String WelcomeText)
	{
		LoginPage lp = new LoginPage();
		lp.Login(userName, password)
		.verifyWelcomeText(WelcomeText);
	}
	
	/*
	@Test
	public void verifyuserLoginsuccessful() {
		LoginPage lp=new LoginPage();
		lp.Login("Admin", "admin123");
		
		HomePage hp=new HomePage();
		hp.verifyWelcomeText("Welcome Meghana");
	}
	@Test
	public void verifyuserUnsuccessful()
	{
		LoginPage lp=new LoginPage();
		lp.Login("Ad","admi");
	}
	*/
}


