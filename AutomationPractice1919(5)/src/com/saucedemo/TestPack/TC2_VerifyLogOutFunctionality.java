package com.saucedemo.TestPack;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.saucedemo.POMPack.Home1POMClass;
import com.saucedemo.UtilityPack.UtilityClass;

public class TC2_VerifyLogOutFunctionality extends TestBaseClass
{
	@Test
	public void verifyLogOutFunctionality() throws IOException, InterruptedException
	{

		
//logOutActivity
//		Home1POMClass hp = new Home1POMClass(driver);
//		
//		
//		hp.clickSettingBtn();
//		System.out.println("Clicked on setting button");
//
//		hp.clickLogOutBtn();
//		System.out.println("Clicked on logOut Button");
//		
//		System.out.println("Went on loginPage");
	
		
	    UtilityClass.screenshotMethod(driver, "TC2_loginPage_PageScreenshot");
	  	System.out.println("Screenshot is taken");
		
		
		System.out.println("Apply verification");
		
		
		  //BA/PO/Dev-> acceptanace criteria
		String expectedTitle = "Swag Labs";   //given
		  
		String actualTitle   = driver.getTitle();
		  
		Assert.assertEquals(actualTitle, expectedTitle);	
		
		
	}

}
