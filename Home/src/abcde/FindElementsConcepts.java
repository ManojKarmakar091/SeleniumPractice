package abcde;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsConcepts {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	    WebDriver driver =    new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("manojkarmakar095@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("myloveisu");
		driver.findElement(By.id("loginbutton")).click();
				
		// 1. get Total count of links on the page
		// 2. get the text of each link on the page
		
		List <WebElement> linklist = driver.findElements(By.tagName("a"));
		
		System.out.println(linklist.size());
		
		for(int i=0; i<linklist.size(); i++){
			
		String linkText = linklist.get(i).getText();
		
		System.out.println(linkText);
			
			
			
			
		}
	

	}

}
