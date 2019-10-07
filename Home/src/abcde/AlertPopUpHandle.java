package abcde;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpHandle {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	    WebDriver driver =    new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	    driver.findElement(By.xpath("//input[@name='proceed']")).click();
	    
	    Alert alert = driver.switchTo().alert();
	  
//	    System.out.println( alert.getText());
//	    Thread.sleep(5000);
//	    alert.accept();
	    
	    
	   String text = alert.getText();
	   
	   if(text.equals("Please enter a valid user name")){
		   
		   System.out.println("Testcase is pass");
	   }
	   else{
		   System.out.println("Testcase is Fail");
	   }
}

}
