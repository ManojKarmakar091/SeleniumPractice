package abcde;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFileUploadPopUps {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	    WebDriver driver =    new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    driver.get("https://html.com/input-type-file/");
	    driver.findElement(By.id("fileupload")).sendKeys("C:\\Users\\manoj.karmkar\\Downloads\\doc1.pdf");

}

}
