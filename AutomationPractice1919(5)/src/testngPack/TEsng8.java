package testngPack;

import org.testng.annotations.Test;

public class TEsng8 
{
	@Test(invocationCount=2)
	public void test1() 
	{
		System.out.println("test1");		
	}
	
	@Test(priority=-1,invocationCount=2)
	public void test2() 
	{
		System.out.println("test2");		
	}
	
	@Test()
	public void test3() 
	{
		System.out.println("test3");		
	}
	
	@Test(invocationCount=0)
	public void test4() 
	{
		System.out.println("test4");		
	}
	
	@Test(priority=1,invocationCount=-1)
	public void test5() 
	{
		System.out.println("test5");		
	}

}
