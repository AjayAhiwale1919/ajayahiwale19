package testngPack;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNg3 
{
	@BeforeMethod
	public void setUp()
	{
		System.out.println("browser-url-loginActivity");	
	}
	
	
	@Test
	public void verifyLoginFunctionality()
	{
		System.out.println("TC01_login-validation-TC-P/F");		
	}
	
	
	@Test
	public void verifyLogOutFunctionality()
	{
		System.out.println("TC02_logOut-validation-TC-P/F");		
	}
	

	@AfterMethod
	public void tearDown()
	{
		System.out.println("browser close-end of program");	
	}
	

}



