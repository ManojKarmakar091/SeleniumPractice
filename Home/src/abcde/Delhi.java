package abcde;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Delhi {

@Test
public static void dog(){
	
	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	 
	// Initialize browser
	WebDriver driver=new ChromeDriver();
	 
	// Open facebook
	driver.get("http://www.facebook.com");
//	driver.findElement(By.xpath("fsdfsdf")).click();
	 
	// Maximize browser
	 
	driver.manage().window().maximize();
System.out.println();	
	
}
	
	
	
	
	
	
}
