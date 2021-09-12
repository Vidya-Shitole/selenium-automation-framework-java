package common;

import org.openqa.selenium.WebDriver;

	public class WebDriverFactory 				
	{	
		public static ThreadLocal<WebDriver> threadStorage = new ThreadLocal<>();	 //TreadLocal -> threadStorage is obj.
		//public static WebDriver driver;				//declare WebDriver static   instead of driver now use<WebDriver> in ThreadLocal
	}


	