package common;

import org.openqa.selenium.WebDriver;

	public class WebDriverFactory 				
	{	
		public static ThreadLocal<WebDriver> threadStorage = new ThreadLocal<>();	 
		//public static WebDriver driver;				
	}


	