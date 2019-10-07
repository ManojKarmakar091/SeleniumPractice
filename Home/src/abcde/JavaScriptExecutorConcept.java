package abcde;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorConcept {

	public static void main(String[] args) throws IOException {
		
	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		
	    WebDriver driver =    new ChromeDriver();
	    
	  
	    
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    
	    
	    driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    
	    driver.get("https://ui.freecrm.com/");
	    
	  
	 
	    driver.findElement(By.xpath("//input[@placeholder='E-mail address'] ")).sendKeys("manojkarmkar091@gmail.com");
	    driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Vicky8123");
//	    driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button'] ")).click();
	    
	    WebElement loginBtn = driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']"));
	    
	    
	    flash(loginBtn, driver); //highlight the element
	    
	    //loginBtn.click();
	    
	    drawBorder(null, loginBtn, driver);// draw a border
	    
	    File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(src, new File("C:\\Users\\manoj.karmkar\\workspace\\Home\\src\\abcde\\border.png"));// Taking screenshot at desire location
		 
		 
		 //generateAlert(driver, "This is the issue with Login Button in Login Page");   //  generate Alert
		 
		 
		 
		 clickElementByJavaScript(loginBtn, driver); // click on any element by Java Script Executor
		 
		 
		 //---------------------------------------refresh the page By using Selenium--------------------------//
		 
		 driver.navigate().refresh();
		 
		 
		 //---------------------------------------refresh the page By using Java script executor--------------------------//
		 

		 refreshBrowserByJavaScriptExecotor(null, driver);
		 
		 
		 //----------------------------------------Get the Title of the Page by JS-----------------------------------------//
		 
		System.out.println(getTitleByJS(driver)); 
		
		
		//----------------------------------------Get the Page Text--------------------------------------------------------//
		
		
	 System.out.println(getPageInnerText(driver));	
	 
	 //---------------------------------------------Scroll Page down-----------------------------------------------------------//
	 
	 
		 
	 //scrollPageDown(driver);
	 
	 
	 //-------------------------------------------Scroll Page down until found the "Sign Up" link or any element----------------------------------//
		
	 
	 WebElement signInLink = driver.findElement(By.xpath("//a[contains(text(),'Sign Up')]"));
	 
	 scrollIntoView(signInLink, driver);
	 
	 
	}
	
	
	

		 public static void flash(WebElement element, WebDriver driver) {
		  JavascriptExecutor js = ((JavascriptExecutor) driver);
		  String bgcolor = element.getCssValue("backgroundColor");
		  for (int i = 0; i < 10; i++) {
		   changeColor("rgb(0,200,0)", element, driver);// 1
		   changeColor(bgcolor, element, driver);// 2
		  }
		 }

		 public static void changeColor(String color, WebElement element, WebDriver driver) {
		  JavascriptExecutor js = ((JavascriptExecutor) driver);
		  js.executeScript("arguments[0].style.backgroundColor = '" + color + "'", element);

		  try {
		   Thread.sleep(20);
		  } catch (InterruptedException e) {
		  }
}
		 
		 public static void drawBorder(String color, WebElement element, WebDriver driver) {
			  JavascriptExecutor js = ((JavascriptExecutor) driver);
			  js.executeScript("arguments[0].style.border = '3px solid red'", element);
		 
		 
}
		 
		 public static void generateAlert(WebDriver driver , String message){
			 
			 JavascriptExecutor js = ((JavascriptExecutor) driver);
			 js.executeScript("alert('"+message+"')");
		 }
		 
		 public static void clickElementByJavaScript(WebElement element, WebDriver driver){
			 JavascriptExecutor js = ((JavascriptExecutor) driver);
			 js.executeScript("arguments[0].click();", element);
			 
			 
		 }
		 
		 public static void  refreshBrowserByJavaScriptExecotor(WebElement element, WebDriver driver){
			 JavascriptExecutor js = ((JavascriptExecutor) driver);
			 js.executeScript("history.go(0)");
			 
		 }
		 
		 public static String getTitleByJS(WebDriver driver){
			 JavascriptExecutor js = ((JavascriptExecutor) driver);
			String title = js.executeScript("return document.title;").toString();
			 return title;
		 }
		 
		 public static String getPageInnerText(WebDriver driver){
			 
			 JavascriptExecutor js = ((JavascriptExecutor) driver);
			 String pageText =js.executeScript("return document.documentElement.innerText;").toString();
			 return pageText;
			 
		 }
		 
		 public static void scrollPageDown(WebDriver driver){
			 JavascriptExecutor js = ((JavascriptExecutor) driver);
			 js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
			 
		 }
		 
		 public static void scrollIntoView(WebElement element , WebDriver  driver){
			 JavascriptExecutor js = ((JavascriptExecutor) driver);
			 js.executeScript("arguments[0].scrollIntoView(true);", element);
			 
			 
		 }
		 
		 
		 
}
