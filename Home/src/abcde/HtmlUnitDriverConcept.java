package abcde;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HtmlUnitDriverConcept {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		
//	    WebDriver driver =    new ChromeDriver();
	    
	    WebDriver driver = new HtmlUnitDriver();
//	    
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    
	    
	    driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    
	    driver.get("https://ui.freecrm.com/");
	    
	    System.out.println("Before login, title is:==" + driver.getTitle());
	    
	    driver.findElement(By.xpath("//input[@placeholder='E-mail address'] ")).sendKeys("manojkarmkar091@gmail.com");
	    driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Vicky8123");
	    driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button'] ")).click();
	    
	    System.out.println("After login, title is:==" + driver.getTitle());
		

}

}
