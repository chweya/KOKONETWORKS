package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.Util.ConfigReader;

//This Class contains the Login Page Objects and methods 
public class LoginPage 
{
	WebDriver driver;
	ConfigReader conf = new ConfigReader();
	
	@FindBy(how=How.XPATH,using="//input[@class='_2zrpKA']")private WebElement emailMobile;
	@FindBy(how=How.XPATH,using="//input[@class='_2zrpKA _3v41xv']")private WebElement password;
	@FindBy(how=How.XPATH,using="//button[contains(.,'Login')]")private WebElement loginbutton;
	@FindBy(how=How.XPATH,using="//div/div/div/button")private WebElement cancelbutton;
	
	//Method to set Email or Mobile Number
	 public void setEmailMobileNumber() 
	 {
		 emailMobile.sendKeys(conf.getEmailPhone());
	 }
	 
	//Method to set Password
	 public void setPassword() 
	 {
		 password.sendKeys(conf.getPassword());
	 }
	 
	 
	 public void ClickLoginPassword() 
	 {
		 loginbutton.click();
	 }
	 
	 public void ClickCancel() 
	 {
		 cancelbutton.click();
	 }

	 
	 public LoginPage(WebDriver driver) 
	 {
		 this.driver = driver;
		 PageFactory.initElements(driver, this);
	 }
	 
}
