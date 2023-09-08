package com.saucedemo.POMPack;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home1POMClass
{

	WebDriver driver;
	
	
	@FindBy(xpath="//button[@id='react-burger-menu-btn']")
	WebElement settingBtn;
	
	public void clickSettingBtn()
	{
		settingBtn.click();
	}
	
	@FindBy(xpath="//a[@id='logout_sidebar_link']")
	WebElement logOutBtn;
	
	public void clickLogOutBtn()
	{
		logOutBtn.click();
	}
	
	//bag ele-add to cart
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']")
	WebElement bagProduct;
	
	public void clickOnBagProduct()
	{
		bagProduct.click();
	}
	
	@FindBy(xpath="//span[@class='shopping_cart_badge']")
	WebElement addToCart;
	
	public String getTextFromAddToCart()
	{
		String actualProductSelected = addToCart.getText();
	    return actualProductSelected;   //=1
	}
	
	
	@FindBy(xpath="//button[text()='Add to cart']")
	List<WebElement> multiProducts;
	
	public void clickMultiProducts()
	{
		for(int i=0; i<multiProducts.size();i++)
		{
			multiProducts.get(i).click();
		}
	}
	
	//Assignment
	//for regular concept-use for loop
	//for collection concept -always use for each loop
	

	public Home1POMClass(WebDriver driver)
	{
		//global      local
		this.driver = driver;
				
	   PageFactory.initElements(driver, this);
	}
	
	

}


