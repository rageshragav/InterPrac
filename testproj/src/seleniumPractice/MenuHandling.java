package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MenuHandling {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\king\\Downloads\\POC_ver1.0\\POC_ver1.0\\target\\classes\\BrowserDrivers\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		
         WebDriver driver = new ChromeDriver();
         driver.get("https://www.flipkart.com/");
         System.out.println("running till");
        // driver.findElement(By.cssSelector("body > div.mCRfo9 > div > div > button")).click();
         driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
         
       
         driver.manage().window().maximize();
         Thread.sleep(3000);
         
         WebElement parent=driver.findElement(By.xpath("//span[contains(text(),'Electronics')]"));
         WebElement child=driver.findElement(By.xpath("//a[@title='Mobiles']"));
         Actions act=new Actions(driver);
         act.moveToElement(parent).perform();
         Thread.sleep(4000);
         child.click();
	}
	}
