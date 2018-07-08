package com.Pages;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

//This Class contains the Home Page Objects and methods 
public class HomePage 
{
   WebDriver driver;
   @FindBy(how=How.XPATH,using=".//*[@id='container']//a/span[text()='Mobiles']")private WebElement Mobile;
   @FindBy(how=How.XPATH,using="//input[@name='q']")private WebElement search;
   @FindBy(how=How.XPATH,using="//button[@type='submit']")private WebElement searchbutton;
 
   public void NavigateToMobiles() 
   {
	   driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
	   driver.findElement(By.xpath("//span[contains(.,'Electronics')]")).click();
	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	   Mobile.click();
	   driver.navigate().refresh();
   }
   public HomePage(WebDriver driver) 
   {
	   this.driver = driver;
	   PageFactory.initElements(driver, this);
   }
}
