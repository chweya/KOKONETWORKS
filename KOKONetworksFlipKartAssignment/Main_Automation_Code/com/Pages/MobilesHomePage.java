package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

//This Class contains the Mobile Home Page Objects and methods 
public class MobilesHomePage 
{
	   WebDriver driver;
	   //@FindBy(how=How.XPATH,using="//div[text()='4 GB']")private WebElement ram;
	   @FindBy(how=How.XPATH,using="//input[contains(@placeholder,'Search Brand')]")private WebElement SearchBrand;
	   @FindBy(how=How.XPATH,using="//div[text()='Motorola']")private WebElement motorola;
	   @FindBy(how=How.XPATH,using="//*[@id=\"container\"]/div/div[1]/div/div/div[2]/div/div/section[5]/div[2]/div[1]/div[1]/div[2]/span")private WebElement clearall;
	   
	   public MobilesHomePage(WebDriver driver) 
	   {
		   this.driver = driver;
		   PageFactory.initElements(driver, this);
	   }
	public void SelectRam() 
	   {
		   JavascriptExecutor je = (JavascriptExecutor)driver;
		   WebElement selectram = driver.findElement(By.xpath("//div[text()='4 GB']"));
		   je.executeScript("window.scrollBy(0,250)","");
		   Point point = selectram.getLocation();
		   int xcord = point.getX();  
		   int ycord = point.getY();
		   System.out.println("X coordinates are"+xcord);
		   System.out.println("Y coordinates are"+ycord);		   
		   selectram.click();
		   
		   //Verify if Redmi Note 5 Pro(Black, 64 GB) and Redmi Note 5 Pro(Black, 64 GB) are Present
		   WebElement Black = driver.findElement(By.xpath("//div[contains(.,'Redmi Note 5 Pro (Black, 64 GB)')]"));
		   WebElement Gold = driver.findElement(By.xpath("//div[contains(.,'Redmi Note 5 Pro (Gold, 64 GB)')]"));
		      if(Black != null && Gold !=null) 
		         {
		    	   System.out.println("Assertion Successfull-------Elements Present");
		         }else 
		         {
		        	 System.out.println("Assertion UnSuccessfull------Elements not Present");
		         }
	   }
	   
	   public void SearchBrands() 
	   {
		   JavascriptExecutor jse = (JavascriptExecutor)driver;	   
		   jse.executeScript("window.scrollBy(0,340)","");
		   SearchBrand.sendKeys("moto");
		   motorola.click();
		   
		 //Verify if Moto G5s (Lunar Gray, 32 GB) and Moto G5 Plus (Fine Gold, 32 GB) are Present
		   WebElement Moto = driver.findElement(By.xpath("//div[contains(.,'Moto G5s (Lunar Gray, 32 GB)')]"));
		   WebElement Moto1 = driver.findElement(By.xpath("//div[contains(.,'Moto G5 Plus (Fine Gold, 32 GB)')]"));
		      if(Moto != null && Moto1 !=null) 
		         {
		    	   System.out.println("Assertion Successfull-------Elements Present");
		         }else 
		         {
		        	 System.out.println("Assertion UnSuccessfull------Elements not Present");
		         }
		      
		      jse.executeScript("window.scrollBy(0,300)","");
	   }
	   
	   public void clearalldata() 
	   {
		   WebElement brandclearall = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div[2]/div/div[1]/div/div[1]/div/section[5]/div[2]/div[1]/div[1]/div[2]/span"));
		   brandclearall.click();
	   }
}
