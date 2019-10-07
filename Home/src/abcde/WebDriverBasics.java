package abcde;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasics {

public static void main(String[] args) throws InterruptedException {
	
System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	
//System.setProperty("webdriver.gecko.driver", "C:\\Users\\manoj.karmkar\\Downloads\\geckodriver-v0.25.0-win64\\geckodriver.exe");
	
		
 WebDriver driver =    new ChromeDriver();
	
driver.get("http://www.google.com");



String title = driver.getTitle();
System.out.println(title);

if(title.equals("Google")){
	
System.out.println("Correct Title");

}
else{
	
System.out.println("Incorrect Title");

}

System.out.println(driver.getCurrentUrl());
driver.close();




	
	
}

}
