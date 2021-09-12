package common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

public class IInvokedMethodImpl implements IInvokedMethodListener{

	@Override
	public void beforeInvocation(IInvokedMethod arg0, ITestResult arg1) {
	
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		
		WebDriverFactory.threadStorage.set(new ChromeDriver());   //assignment driver
		//WebDriverFactory.driver.manage().window().maximize();
		WebDriverFactory.threadStorage.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverFactory.threadStorage.get().get("https://opensource-demo.orangehrmlive.com/"); //.get().get = obj. chaining	
	}
	@Override
	public void afterInvocation(IInvokedMethod method, ITestResult testResult) 
	{
		//IInvokedMethodListener.super.afterInvocation(method, testResult);
		WebDriverFactory.threadStorage.get().quit();   //driver = threadStorage.get();
	}
}
