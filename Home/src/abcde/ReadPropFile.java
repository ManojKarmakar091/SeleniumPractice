package abcde;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class ReadPropFile {
	
	static WebDriver driver;

	public static void main(String[] args) throws IOException, InterruptedException {
		
		
		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream("C:\\Users\\manoj.karmkar\\workspace\\Home\\src\\abcde\\config.properties");
		
		prop.load(ip);

		System.out.println("FirstName");
		
		String browserName = prop.getProperty("browser");
		System.out.println(browserName);
		
		String url = prop.getProperty("URL");
		System.out.println(url);
		
		
		if(browserName.equals("chrome")){
			
			System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		else if(browserName.equals("FF")){
			
			System.setProperty("webdriver.chrome.driver", "D:\\geckodriver.exe");
			driver = new FirefoxDriver();
			
		}
		
		else if (browserName.equals("IE")){
			System.setProperty("webdriver.chrome.driver", "D:\\internetexplorerdriver.exe");
			driver = new InternetExplorerDriver();
				
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		driver.get(url);
		driver.findElement(By.xpath(prop.getProperty("FirstName_xpath"))).sendKeys(prop.getProperty("FirstName"));
		driver.findElement(By.xpath(prop.getProperty("LastName_xpath"))).sendKeys(prop.getProperty("LastName"));
		driver.findElement(By.xpath(prop.getProperty("Company_xpath"))).sendKeys(prop.getProperty("Company"));
		driver.findElement(By.xpath(prop.getProperty("Email_xpath"))).sendKeys(prop.getProperty("Email"));
		driver.findElement(By.xpath(prop.getProperty("Username_xpath"))).sendKeys(prop.getProperty("Username"));
		driver.findElement(By.xpath(prop.getProperty("Password_xpath"))).sendKeys(prop.getProperty("Password"));
		driver.findElement(By.xpath(prop.getProperty("Address_xpath"))).sendKeys(prop.getProperty("Address"));
		driver.findElement(By.xpath(prop.getProperty("City_xpath"))).sendKeys(prop.getProperty("City"));
		driver.findElement(By.xpath(prop.getProperty("PostalCode_xpath"))).sendKeys(prop.getProperty("PostalCode"));
		driver.findElement(By.xpath(prop.getProperty("State_xpath"))).sendKeys(prop.getProperty("State"));
		Thread.sleep(3000);
		
		Select select = new Select(driver.findElement(By.xpath(prop.getProperty("Country_xpath"))));
		select.selectByValue("Country");
		
		
		
		
		
}

}
