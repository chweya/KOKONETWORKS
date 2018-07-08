package com.Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.Pages.AddToCart;
import com.Pages.HomePage;
import com.Pages.LoginPage;
import com.Pages.MobilesHomePage;
import com.Util.ConfigReader;

@Test
public class FlipCartTestCases 
{
	WebDriver driver;
	ConfigReader conf = new ConfigReader();
	
	public void ExecuteTestCases() 
	{
		//Launching of the Application
		driver = new FirefoxDriver();
 		driver.manage().window().maximize();
 		driver.get(conf.getApplicationURL());
 		
 		//Login to the application using Correct credentials
		LoginPage login = new LoginPage(driver);
		login.setEmailMobileNumber();
		login.setPassword();
		login.ClickLoginPassword();
		
		
		//Verifying Presence of Electronics Menu and selecting Mobiles Menu
		HomePage home = new HomePage(driver);
		home.NavigateToMobiles();
		
		//Verifying Access to Mobile Home Page 
		MobilesHomePage mobiles = new MobilesHomePage(driver);
		mobiles.SelectRam();
		mobiles.SearchBrands();
		mobiles.clearalldata();
		
		//Opening Product Details
		driver.get(conf.getProductDetails());
		
		//Adding a product to Cart
		AddToCart add = new AddToCart(driver);
		add.gotocart();
		/*add.setName();
		add.setMobile();
		add.setPincode();
		add.setLocality();
		add.setAddress();
		//add.setCity();
		//add.selectstate();
		add.selectaddresstype();*/
	}
}
