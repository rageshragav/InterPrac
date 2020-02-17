package seleniumPractice;

import java.io.File;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

//import org.openqa.selenium.firefox.FirefoxDriver;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Centuri  {
	public static   WebDriver driver ;
	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe");
		
		//WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
     
		 driver = new ChromeDriver();
			
       String baseUrl = "http://demo-centuri.conevo.in/";

       // launch Fire fox and direct it to the Base URL
       driver.get(baseUrl);
      // WebDriverWait wait = new WebDriverWait(driver,10);
       WebElement loader = driver.findElement(By.id("clogo"));
      if(loader.isDisplayed()){
    	  new WebDriverWait(driver,50).until(ExpectedConditions.invisibilityOfElementLocated(By.id("clogo")));
          
       }
      driver.findElement(By.id("username")).sendKeys("james");
      
      Thread.sleep(1000);
       driver.findElement(By.cssSelector("//button[@class='login-button ng-binding ng-scope']")).click();
       
            
       
       

	}

}
