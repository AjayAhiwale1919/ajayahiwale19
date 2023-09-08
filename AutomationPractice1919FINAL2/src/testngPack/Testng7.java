package testngPack;

import org.testng.annotations.Test;

public class Testng7
{


	@Test(invocationCount=5)
	public void test1() 
	{
		System.out.println("test1");		
	}
	
	@Test(invocationCount=2)
	public void test2() 
	{
		System.out.println("test2");		
	}
}

	
	