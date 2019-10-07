package abcde;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovementConcept {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	    WebDriver driver =    new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://colorlib.com/wp/free-website-menu-templates/");
	

		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Free Themes')]"))).build().perform();

		action.moveToElement(driver.findElement(By.linkText("Illdy Theme"))).build().perform();		
		
//		action.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'About Activello')]"))).build().perform();
		Thread.sleep(1000);

		driver.findElement(By.xpath(" //span[contains(text(),'About Illdy')] ")).click();
		
		
		

}

}
