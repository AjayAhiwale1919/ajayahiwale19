package testngPack;

import org.testng.annotations.Test;

public class Testng11 
{
	@Test
	public void test1() 
	{
		System.out.println("test1");		
	}
	
	@Test(timeOut=7000)
	public void test2() throws InterruptedException 
	{
		Thread.sleep(5000);
		System.out.println("test2");		
	}


}
