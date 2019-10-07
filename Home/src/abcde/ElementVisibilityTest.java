package abcde;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementVisibilityTest {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		
	    WebDriver driver =    new ChromeDriver();
	    
	  
	    
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    
	    
	    driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    
	    driver.get("https://api.cogmento.com/register/");
	    
	    
	    //1. isdisplayed() method: applicable for all elements
	     
	   boolean b1 = driver.findElement(By.xpath("//button[@name='action']")).isDisplayed(); //for Submit button
	    System.out.println(b1);
	    
	    //2. isEnabled() method :
	    
	    boolean b2 = driver.findElement(By.xpath("//button[@name='action']")).isEnabled(); //for Submit button
	    System.out.println(b2);
	    
	    //3. isSelected() method:
	    
	    boolean b3 = driver.findElement(By.xpath("//input[@id='terms']")).isSelected(); 
	    System.out.println(b3);
	    
	    
	    //--------------Click "I Agree to the terms and conditions"--------------------------------//
	    
	    driver.findElement(By.xpath("//input[@id='terms']")).click();
	    boolean b4 = driver.findElement(By.xpath("//input[@id='terms']")).isSelected();
	    System.out.println(b4);
	    
	    

	}

}
