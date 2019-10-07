package abcde;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CalenderSelectTest {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		
	    WebDriver driver =    new ChromeDriver();
	    
	  
	    
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    
	    
	    driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    
	    driver.get("https://jqueryui.com/resources/demos/datepicker/dropdown-month-year.html");
	    driver.findElement(By.xpath("//input[@id='datepicker']")).click();
	    
	    String date = "18-Oct-2018";
	    String dateArr[] = date.split("-"); //18,September,2019
	    String day= dateArr[0];
	    String month = dateArr[1];
	    String year = dateArr[2];
	    
	    Select select = new Select(driver.findElement(By.xpath("//select[@data-handler='selectMonth']")));
	    select.selectByVisibleText(month);
	    
	    Select select1 = new Select(driver.findElement(By.xpath("//select[@data-handler='selectYear']")));
	    select.selectByVisibleText(year);
	    
	  //*[@id="ui-datepicker-div"]/table/tbody/tr[1]/td[3]/a
	  //*[@id="ui-datepicker-div"]/table/tbody/tr[1]/td[4]/a
	  //*[@id="ui-datepicker-div"]/table/tbody/tr[1]/td[5]/a
	  
	    
	    String beforeXpath = "//*[@id='ui-datepicker-div']/table/tbody/tr[";
	    String afterXpath = "]/td[";
	    final int totalWeekDays = 7;
	    
	    boolean flag = false;
	    for(int rowNum=1; rowNum<=5; rowNum++){
	    	for(int colNum=1; colNum<=totalWeekDays; colNum++){
	    		
	    	String dayVal = driver.findElement(By.xpath(beforeXpath+rowNum+afterXpath+colNum+"]/a")).getText();
             System.out.println(dayVal);
//             if(dayVal.equals(day)){
//            	 
//            	 driver.findElement(By.xpath(beforeXpath+rowNum+afterXpath+colNum+"]/a")).click();
//            	 flag = true;
//            	 break;
//             }
	    }
	    
//	    	if(flag){
//	    		break;
//	    	}
	    }
	 

}
}
