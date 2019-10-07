package abcde;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDropboxHandle {

	public static void main(String[] args) {
		
    System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		
	    WebDriver driver =    new ChromeDriver();
	    
	    
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    
	    
	    driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    
	    driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		
		driver.findElement(By.xpath("//button[@class='multiselect dropdown-toggle btn btn-default'] ")).click();
//		driver.findElement(By.xpath("//label[contains(text(),'Angular')]")).click();
		
	List<WebElement> list = driver.findElements(By.xpath("//ul[contains(@class,'multiselect-container dropdown-menu')]//li//a//label"));
	System.out.println(list.size());
	
	
	for(int i=0; i<list.size(); i++){
	
    //	System.out.println(list.get(i).getText());// Select all check boxes
   //	list.get(i).click();
		
		
		System.out.println(list.get(i).getText());
		
	//Select "Angular" check box
		if(list.get(i).getText().contains("Angular")){
		  list.get(i).click();
		  break;
	  }
	}
	
		
		
		
		
}

}
