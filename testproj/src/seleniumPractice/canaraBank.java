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
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.firefox.FirefoxDriver;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class canaraBank  {
	 public static ExtentReports extent;
		public static ExtentTest logger;
	public static   WebDriver driver ;
	public static void main(String[] args) throws InterruptedException {
		extent = new ExtentReports(System.getProperty("user.dir")+"/test/STMExtentreport.html",true);
		extent.addSystemInfo("Host Name", "ExtentReportLearning").addSystemInfo("Enviromnet", "AutomationTesting").addSystemInfo("User Name", "Ragesh RB");
		extent.loadConfig(new File(System.getProperty("user.dir")+"\\extent-config.xml"));
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe");
		
		//WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
     
		 driver = new ChromeDriver();
		 logger = extent.startTest("Launching canara bank and register for net banking");
			
       String baseUrl = "https://www.canarabank.com/english/";

       // launch Fire fox and direct it to the Base URL
       driver.get(baseUrl);
       logger.log(LogStatus.INFO,"Landed in canara bank home page");
		 
      // driver.manage().window().maximize();
       Thread.sleep(2000);
       driver.findElement(By.xpath("//div[@class='mainmenu']//a[contains(text(),'Net Banking')]")).click();
       Set<String> win = driver.getWindowHandles();
      
       Iterator<String> itr=win.iterator();
       System.out.println(itr.hasNext());
       System.out.println(win);
       String nxtWin = itr.next();
       System.out.println(nxtWin);
       driver.findElement(By.xpath("//a[@class='nw-user']")).click();
       String windHand = driver.getWindowHandle();
       for(String winHandle : driver.getWindowHandles()){
    	    driver.switchTo().window(winHandle);
    	}
       logger.log(LogStatus.INFO,"registering as a new user");
		 
       
       driver.findElement(By.xpath("//*[@id=\"dunst\"]/form/table/tbody/tr[3]/td/div/input[1]")).click();
       logger.log(LogStatus.INFO,"Filling account number");
		 
       driver.findElement(By.id("account")).sendKeys("1234567891234");
       Thread.sleep(1000);
       logger.log(LogStatus.INFO," Filling the card number ");
   	
       driver.findElement(By.id("atmnumber1")).sendKeys("5678");
       Thread.sleep(1000);
       driver.findElement(By.id("atmnumber2")).sendKeys("5679");
       Thread.sleep(1000);
       driver.findElement(By.id("atmnumber3")).sendKeys("5677");
       Thread.sleep(1000);
       driver.findElement(By.id("atmnumber4")).sendKeys("1278");
       Thread.sleep(1000);
       logger.log(LogStatus.INFO," Flling the country code ");
   	
       WebElement countryCode = driver.findElement(By.id("countryCode"));
       Select sel = new Select(countryCode);
       sel.selectByVisibleText("Japan (+81)");
       logger.log(LogStatus.INFO,"Filling mobile number");
   	
       driver.findElement(By.id("mobilenumber")).sendKeys("12345678");
       driver.findElement(By.id("idcust")).sendKeys("4545678");
       
       JavascriptExecutor js = (JavascriptExecutor) driver;

      

      		
       js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
       
       Thread.sleep(1500);
       driver.findElement(By.xpath("//*[@id=\"maintable\"]/tbody/tr[2]/td/div/div/div[2]/table/tbody/tr/td/input[1]")).click();
       
       Thread.sleep(3000);
       driver.findElement(By.cssSelector("#box > div.middlepanel > table > tbody > tr:nth-child(2) > td > div > input")).click();
       
      // driver.switchTo().alert().accept();
      
       
       
       

	}

}
