package testngPack;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testng2
{
	@AfterMethod
	public void postCode()
	{
		System.out.println("browser close-end of program");	
	}
	
	@BeforeMethod
	public void preCode()
	{
		System.out.println("browser-url-loginActivity");	
	}
	
	@Test
	public void verifyLoginFunctionality()
	{
		System.out.println("validation-TC-P/F");		
	}
	

	
}
