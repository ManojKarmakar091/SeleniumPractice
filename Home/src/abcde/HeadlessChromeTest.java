package abcde;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessChromeTest {

	public static void main(String[] args) {
	
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
        
        ChromeOptions options = new ChromeOptions();
        options.addArguments("window-size=1400,800");
        options.addArguments("headless");
		
	    WebDriver driver =    new ChromeDriver(options);
	  
	    driver.manage().deleteAllCookies();
	    
	    
	    driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    
	    driver.get("https://ui.freecrm.com/");
	    System.out.println("Login Page Title ="+ driver.getTitle());
	  
	 
	    driver.findElement(By.xpath("//input[@placeholder='E-mail address'] ")).sendKeys("manojkarmkar091@gmail.com");
	    driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Vicky8123");
	    driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button'] ")).click();
		
		
		
		
		
		
		
		
		
		
		
		
}

}
