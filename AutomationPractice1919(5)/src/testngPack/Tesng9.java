package testngPack;

import org.testng.annotations.Test;

public class Tesng9
{

	@Test(enabled=false,priority=1)
	public void test1() 
	{
		System.out.println("test1");		
	}
	
	@Test(enabled=false,priority=2)
	public void test2() 
	{
		System.out.println("test2");		
	}
	
	@Test
	public void test3() 
	{
		System.out.println("test3");		
	}
	
	@Test(enabled=false)
	public void test4() 
	{
		System.out.println("test4");		
	}
	
	@Test(enabled=false)
	public void test5() 
	{
		System.out.println("test5");		
	}

}
