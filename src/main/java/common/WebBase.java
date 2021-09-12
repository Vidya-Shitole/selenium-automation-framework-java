package common;

import org.testng.annotations.DataProvider;

public class WebBase {

	@DataProvider(name="Login Data")		//name can be anything-its name of data provider
	public String [][] getLoginData()					//defining 2 dimensional array
	{
		String loginData[][] = {
								{"admin","admin123"},	//array 0th index value
									{"ess","ess123"}		//array 1st index value
								};
				return loginData;
	}

/*	public static void main(String[] args)
	{
		String loginData[][] = {{"admin","admin123","Welcome Admin"},{"ess","ess123"}};
	System.out.println(loginData[0][0]);
	System.out.println(loginData[0][1]);
	System.out.println(loginData[0][2]);
	System.out.println(loginData[1][0]);
	System.out.println(loginData[1][1]);
	}  */
}