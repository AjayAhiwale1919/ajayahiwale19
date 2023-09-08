package com.saucedemo.TestPack;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC1_VerfiyLoginFunctionality extends TestBaseClass
{
	@Test
	public void verifyLoginFunctionality() throws IOException
	{

		
        System.out.println("Apply verification");
	   
		String expectedTitle = "Swag Labs";   
		  
		String actualTitle   = driver.getTitle();
		  
		Assert.assertEquals(actualTitle, expectedTitle);	
		

	}

}


