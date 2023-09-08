package testngPack;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNg14 
{


	@Test
	public void loginTest()
	{
//		Assert.assertTrue(true);  //pass
//		Assert.assertTrue(false); //fail
		
		Assert.assertFalse(false);  //??
		Assert.assertFalse(true);   //??
	}

}
