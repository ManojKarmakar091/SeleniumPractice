package abcde;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	    WebDriver driver =    new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
		driver.get("https://ui.freecrm.com/");
		Thread.sleep(6000);
	    driver.findElement(By.xpath("//input[@placeholder='E-mail address']")).sendKeys("manojkarmkar091@gmail.com");
	    driver.findElement(By.xpath("//input[@placeholder='Password'] ")).sendKeys("Vicky8123");
	    driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button'] ")).click();
	    
	    driver.switchTo().frame(1);
	    driver.findElement(By.xpath("//span[contains(text(),'Contacts')]")).click();
	    
	    
	    
	    
}

}
