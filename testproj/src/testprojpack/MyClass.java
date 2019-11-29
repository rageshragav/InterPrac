package testprojpack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyClass {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");

		System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe");
		
		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new FirefoxDriver();
        String baseUrl = "https://www.katkada.com/";

        // launch Fire fox and direct it to the Base URL
        driver.get(baseUrl);
       // driver.manage().window().maximize();
       /* driver.findElement(By.id("identifierId")).sendKeys("ragesh@conevo.in" + Keys.ENTER);
        Thread.sleep(3000);
        driver.findElement(By.name("password")).sendKeys("123456" +  Keys.ENTER);*/
     
        List <WebElement> selection = driver.findElements(By.name("connection"));
       System.out.println(selection.size());
       Thread.sleep(2000);
       System.out.println("running");
      driver.findElement(By.xpath("//*[@for='postpaid']")).click();
      System.out.println("taking");
        //WebDriverWait wait=new WebDriverWait(driver,1000);
		// wait.until(ExpectedConditions.elementToBeClickable(postpaid));
     // postpaid.click();
		 Thread.sleep(5000);
         driver.findElement(By.id("mobile_no")).sendKeys("1234567890");
         
         
         Select sel=new Select(driver.findElement(By.id("operator_name")));
 		List<WebElement>dropdown=sel.getOptions();
 		int size = dropdown.size(),i=0;;
 		System.out.println(size);
 		while(i<size) {
 			System.out.println(dropdown.get(i).getText());
 			sel.selectByIndex(i);
 			i++;
 		}
        
        
        //close chrome
       // driver.close();
       
    }

	}


