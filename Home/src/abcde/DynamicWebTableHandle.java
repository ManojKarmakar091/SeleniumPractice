package abcde;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTableHandle {

	public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		
	    WebDriver driver =    new ChromeDriver();
	    
	  
	    
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	   
	    
	    driver.get("https://ui.freecrm.com/");
	    

	    driver.findElement(By.xpath("//input[@placeholder='E-mail address'] ")).sendKeys("manojkarmkar091@gmail.com");
	    driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Vicky8123");
	    driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//span[contains(text(),'Contacts')]")).click();
	    Thread.sleep(2000);
	   
	 
		   
		  //*[@id="ui"]/div/div[2]/div[2]/div/div[2]/table/tbody/tr[1]/td[2]
		  //*[@id="ui"]/div/div[2]/div[2]/div/div[2]/table/tbody/tr[2]/td[2]
		  //*[@id="ui"]/div/div[2]/div[2]/div/div[2]/table/tbody/tr[3]/td[2]
		    
		    
		    String beforeXpath = "//*[@id='ui']/div/div[2]/div[2]/div/div[2]/table/tbody/tr[";
		    String afterXpath = "]/td[2]";
		    
		    for(int i =1;i<=3; i++){
		    	
		    	String actualXpath = beforeXpath+i+afterXpath;
		    	
		    	String name =  driver.findElement(By.xpath(actualXpath)).getText();
		    	System.out.println(name);
		    	
		    	if(name.contains("Manoj Karmakar")){
		    		
		    		driver.findElement(By.xpath("//*[@id='ui']/div/div[2]/div[2]/div/div[2]/table/tbody/tr["+i+"]/td[1]/div/input")).click();
		    	}
		    
		    }

	}

}
