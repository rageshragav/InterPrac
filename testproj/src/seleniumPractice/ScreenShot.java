package seleniumPractice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
//System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe");
System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");

		
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
       // String baseUrl = "https://www.katkada.com/";
        String baseUrl =  "https://accounts.google.com";

        // launch Fire fox and direct it to the Base URL
        driver.get(baseUrl);
       // driver.manage().window().maximize();
        driver.findElement(By.id("identifierId")).sendKeys("ragesh@conevo.in" + Keys.ENTER);
        Thread.sleep(3000);
        driver.findElement(By.name("password")).sendKeys("123456" +  Keys.ENTER);
        
        Thread.sleep(3000);
        TakesScreenshot ts = (TakesScreenshot)driver;
        File src = ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File("./Screenshots/email.png"));
        
        

	}

}
