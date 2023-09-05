package testngPack;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Testng10
{

	@Test
	public void loginTest() 
	{
		System.out.println("loginTest");
		Assert.assertTrue(true);   //pass/fail
	}
	
	@Test(dependsOnMethods= {"loginTest"})
	public void addToCart() 
	{
		System.out.println("addToCart");		
	}
	
	//-1st tc-pass ---> 2nd tc execute
	//-1st tc fail   ---> 2nd tc skip
}
