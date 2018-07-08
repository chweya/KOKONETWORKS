package com.Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.Util.ConfigReader;

//This Class contains the Cart Objects and methods to fill the required data in order to add a product
//to the Cart
public class AddToCart 
{
   WebDriver driver;
   ConfigReader conf = new ConfigReader();
   
   //AddToCart Constructor
   public AddToCart(WebDriver driver) 
   {
	   this.driver = driver;
	   PageFactory.initElements(driver, this);
   }	
   
   public void gotocart() 
   {
	   WebElement addtocart = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div/div/div[1]/div/div[1]/div[2]/ul/li[1]/button"));
	   addtocart.click();
	   driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
	   WebElement placeorder =driver.findElement(By.xpath("//button[contains(.,'Place Order')]"));
	   placeorder.click();
   }
  public void setName() 
   {
	   WebElement name = driver.findElement(By.xpath("//input[@name='name']"));
	   name.sendKeys(conf.getName());
   }
   
   public void setMobile() 
   {
	   WebElement phone =driver.findElement(By.xpath("//input[@name='phone']"));
	   phone.sendKeys(conf.getMobile());
   }
   
   public void setPincode() 
   {
	   WebElement pincode =driver.findElement(By.xpath("//input[@name='pincode']"));
	   pincode.sendKeys(conf.getPincode());
   }
   
   public void setLocality() 
   {
	   WebElement locality = driver.findElement(By.xpath("//input[@name='addressLine2']"));
	   locality.sendKeys(conf.getLocality());
   }
   
   public void setAddress() 
   {
	   WebElement Address = driver.findElement(By.xpath("//textarea[@name='addressLine1']"));
	   Address.sendKeys(conf.getAddress());
   }
   
   public void setCity() 
   {
	   WebElement City = driver.findElement(By.xpath("//input[@name='city']"));
	   City.sendKeys(conf.getCity());
   }
   
   public void selectstate() 
   {
	   WebElement statedropdown = driver.findElement(By.xpath("//select[@name='state']"));
	   statedropdown.click();
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   WebElement state = driver.findElement(By.xpath("//option[@value='Bihar']"));
	   state.isSelected();
   }
   
   public void selectaddresstype() 
   {
	   WebElement addresstype = driver.findElement(By.xpath(".//*[@id='container']/div/div[1]/div/div/div[1]/div[2]/div/div/div/div/div/label/div[2]/div/form/div/div[7]/div/div/label[1]/div[1]"));
	   addresstype.click();
	   WebElement save = driver.findElement(By.xpath("//button[contains(.,'Save and Deliver Here')]"));
	   save.click();
   }
}
