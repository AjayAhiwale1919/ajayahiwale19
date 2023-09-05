package testngPack;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Testng13 
{
	@Test
	public void loginTest()
	{
		String expectedTitle = "Swag Labs";
		
		String actualTitle  = "Labs";
		
		//Hard Assertion apply
		//Assert-Testng class
		//static methods of Assert class
		
		Assert.assertEquals(actualTitle, expectedTitle,"title does not match");	
	}

}


