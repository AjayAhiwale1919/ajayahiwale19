package com.saucedemo.TestPack;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.saucedemo.POMPack.Home1POMClass;
import com.saucedemo.POMPack.LoginPOMClass;
import com.saucedemo.UtilityPack.UtilityClass;

public class TestBaseClass 
{
	
		WebDriver driver;
		
		@BeforeMethod
		public void setUp() throws IOException
		{
			System.setProperty("webdriver.chrome.driver", 
					"C:\\New ChromeDriver\\chromedriver_win32\\chromedriver.exe");	
	         	
			driver = new ChromeDriver();
			System.out.println("Browser is opened");
			
	
		    driver.get("https://www.saucedemo.com/");
		    System.out.println("URL is open");
		    

		    
		    //take screenshot
		    UtilityClass.screenshotMethod(driver, "TC01_loginPageScreenshot");
		    System.out.println("Screenshot is Taken");
		    
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));	   	    

		    LoginPOMClass lp = new LoginPOMClass(driver);   
		    
		    lp.sendUsername();
		    System.out.println("Username is entered");
		    		    
		    lp.sendPassword();
		    System.out.println("Password is entered");
		    
		    lp.clickLoginBtn();
		    System.out.println("Clicked on login button");

		    //homePage
		    System.out.println("Went on homePage");
		  
		  	
		  	//take screenshot
		  	UtilityClass.screenshotMethod(driver, "TC1_homePageScreenshot");
		  	System.out.println("Screenshot is taken");	
		  
		}
		
	
		@AfterMethod
	    public void tearDown()
	   { 
			
			Home1POMClass hp = new Home1POMClass(driver);
			
			
			hp.clickSettingBtn();
			System.out.println("Clicked on setting button");

			hp.clickLogOutBtn();
			System.out.println("Clicked on logOut Button");
			
			System.out.println("Went on loginPage");
		
			
			
		driver.quit();
		System.out.println("Browser is closed");
		System.out.println("End of Program");
		  	    
	  }

}