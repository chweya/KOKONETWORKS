/**
 * 
 */
package com.Util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

//import org.testng.annotations.Test;

/**
 * @author Chweya Charles
 *
 */
@Test
public class ConfigReader 
{
	Properties pro;
  //Constructor to read data from the configuration file
	public ConfigReader() 
	{
		try
		{
			File src = new File("./Config_File/config.property");
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
			
		}catch(Exception e) 
		{
			System.out.println("Exception is =======" + e.getMessage());
		}
	}
	//This method gets the application URL
	  public String getApplicationURL() 
	  {
		  return pro.getProperty("uat_URL");
	  }
	  
	  //Method returns the email/phone number
	  public String getEmailPhone() 
	  {
		  return pro.getProperty("account");
	  }
	  
	  //Method returns Password
	  public String getPassword()
	   {
		   return pro.getProperty("password");
	   }
	  
	 public String getProductDetails() 
	 {
		 return pro.getProperty("pdt_details_ur");
	 }
	  
	 public String getName() 
	 {
		 return pro.getProperty("name");
	 }
	 
	 public String getMobile() 
	 {
		 return pro.getProperty("mobile");
	 }
	 
	 public String getPincode() 
	 {
		 return pro.getProperty("pincode");
	 }
	 
	 public String getLocality() 
	 {
		 return pro.getProperty("locality");
	 }
	 
	 public String getAddress() 
	 {
		 return pro.getProperty("address");
	 }
	 
	 public String getCity() 
	 {
		 return pro.getProperty("city");
	 }
	 
	  public static void main(String[]args) throws IOException
	   {
		  Properties pro;
		  File src = new File("./Config_File/config.property");
		  FileInputStream fis = new FileInputStream(src);
		  pro = new Properties();
		  pro.load(fis);
		  System.err.println("Browser:"+pro.getProperty("BROWSER"));
		  System.err.println("URL:"+pro.getProperty("uat_URL"));
		  System.err.println("Email:"+pro.getProperty("emailorphone"));
		  System.err.println("Password:"+pro.getProperty("password"));
	   }
}
