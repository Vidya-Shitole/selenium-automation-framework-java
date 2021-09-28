package test;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import common.IInvokedMethodImpl;
import pages.LoginPage;

@Listeners(IInvokedMethodImpl.class)
public class AddUserTest {
	
	@Test
	public void VerifyAddEmployeeSuccessfully()
	{  
		new LoginPage()
		.Login("Admin","admin123")
		.verifyWelcomeText("Welcome Meghana")
		.navigateToAdminpage()
		.NavigatetoAddUserPage()
		.adduser("ESS", "vidya", "VGS", "vidya11", "vidya11");
		 System.out.println("hello");
	}
}
