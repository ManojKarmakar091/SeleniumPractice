package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTitleTest {
	
	 WebDriver driver;
	 
	 @BeforeMethod
	 
	 public void setUp(){
		 
		 System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
			
		    driver =    new ChromeDriver();
		    
		  
		    
		    driver.manage().window().maximize();
		    driver.manage().deleteAllCookies();
		    
		    
		    driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		    
		    driver.get("https://www.google.com/"); 
	 }
		 
		 @Test
		 
		 public void googleTitle(){
		 String title = driver.getTitle();
		 System.out.println(title);	 
		 
		 Assert.assertEquals(title, "Google123", "Title is not matched");
		 
		 }

		 
		 @Test
		 
		 public void googleLogoTest(){
		 boolean b = driver.findElement(By.xpath("//*[@id='hplogo']")).isDisplayed();	 
		 
		 Assert.assertTrue(b);
		// Assert.assertEquals(b, true); //or we can write this way
				 
		 }
		 
		 @AfterMethod
		 public void tearDown() throws InterruptedException{
			
			 driver.close();
		 }
	
	
	

}
