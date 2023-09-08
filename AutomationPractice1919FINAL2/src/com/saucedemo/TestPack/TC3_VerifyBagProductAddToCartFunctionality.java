package com.saucedemo.TestPack;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.saucedemo.POMPack.Home1POMClass;

public class TC3_VerifyBagProductAddToCartFunctionality extends TestBaseClass 
{
	@Test
	public void verifyBagProductAddToCartFunctionality() throws IOException
	{
		//bag product add to cart
		Home1POMClass hp = new Home1POMClass(driver);
		
		hp.clickOnBagProduct();
		System.out.println("Clicked on bag product");
		
		System.out.println("Apply the validation");
		
		String expectedProductSelected = "1";
		
		String actualProductSelected = hp.getTextFromAddToCart();
		
		Assert.assertEquals(actualProductSelected, expectedProductSelected);	
	}

}
