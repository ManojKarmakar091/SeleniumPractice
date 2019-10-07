package abcde;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {

	public static void main(String[] args) {
		
    System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		
	    WebDriver driver =    new ChromeDriver();
	    
	  
	    
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	   
	    
	    driver.get("https://www.google.co.in/");

	    
	    driver.findElement(By.name("q")).sendKeys("testing");
	    
	  List<WebElement> list =  driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbl1']//span//b"));
	  
	//*[@id="tsf"]/div[2]/div[1]/div[2]/div[2]/ul/li[2]/div/div[2]/div/span/b
	  
	  System.out.println(list.size());
	  
	  
	    
	    
	    
	    
}

}
