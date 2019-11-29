package seleniumPractice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class MercuryTours {

	 public static ExtentReports extent;
		public static ExtentTest logger;
	public static  WebDriver driver ;
	static String name = "mercury";
	public static void main(String[] args) throws InterruptedException, AWTException {
		
		extent = new ExtentReports(System.getProperty("user.dir")+"/test/STMExtentreport.html",true);
		extent.addSystemInfo("Host Name", "ExtentReportLearning").addSystemInfo("Enviromnet", "AutomationTesting").addSystemInfo("User Name", "Ragesh RB");
		extent.loadConfig(new File(System.getProperty("user.dir")+"\\extent-config.xml"));
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		 driver = new ChromeDriver();
        String baseUrl = "http://newtours.demoaut.com/mercurysignon.php";
        logger = extent.startTest("Launching Mercury travel and booking flight tickets");
		
        // launch Fire fox and direct it to the Base URL
        driver.get(baseUrl);
        driver.manage().window().maximize();
        
        logger.log(LogStatus.INFO,"Landed in canara bank home page");
        logger.log(LogStatus.INFO,"Filling user name field");
        driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(name);
        logger.log(LogStatus.INFO,"Filling password field");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys(name);
        logger.log(LogStatus.INFO,"Clicking on login button");
        driver.findElement(By.xpath("//input[@name='login']")).click();
        Thread.sleep(2000);
        
       // List <WebElement> trip = driver.findElements(By.name("tripType"));
       
        driver.findElement(By.cssSelector("body > div > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(5) > td > form > table > tbody > tr:nth-child(2) > td:nth-child(2) > b > font > input[type=radio]:nth-child(2)")).click();
        Select passCount = new Select(driver.findElement(By.xpath("//select[@name='passCount']")));
        logger.log(LogStatus.INFO,"Selected number of passengers");
        passCount.selectByVisibleText("2");
        Select departPort = new Select(driver.findElement(By.xpath("//select[@name='fromPort']")));
        logger.log(LogStatus.INFO,"Selected from port");
        departPort.selectByVisibleText("London");
        Select fromMonth = new Select(driver.findElement(By.xpath("//select[@name='fromMonth']")));
        logger.log(LogStatus.INFO,"Selected travel month");
        fromMonth.selectByVisibleText("August");
        Select fromDay = new Select(driver.findElement(By.xpath("//select[@name='fromDay']")));
        logger.log(LogStatus.INFO,"Selected travel day");
        fromDay.selectByVisibleText("11");
        Select toPort = new Select(driver.findElement(By.xpath("//select[@name='toPort']")));
        logger.log(LogStatus.INFO,"Selected to port");
        toPort.selectByVisibleText("Paris");
        Select toMonth = new Select(driver.findElement(By.xpath("//select[@name='toMonth']")));
        logger.log(LogStatus.INFO,"Selected return month");
        toMonth.selectByVisibleText("October");
        Select toDay = new Select(driver.findElement(By.xpath("//select[@name='toDay']")));
        logger.log(LogStatus.INFO,"Selected return date");
        toDay.selectByVisibleText("15");
        driver.findElement(By.xpath("//font[contains(text(),'Economy class')]")).click();
        Select airLines = new Select(driver.findElement(By.xpath("//select[@name='airline']")));
        logger.log(LogStatus.INFO,"Selected airling type");
        airLines.selectByVisibleText("Blue Skies Airlines");
        driver.findElement(By.xpath("//input[@name='findFlights']")).click();
        Thread.sleep(1000);
        logger.log(LogStatus.INFO,"Clicking on logout button");
        driver.findElement(By.cssSelector("body > div > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(2) > td > table > tbody > tr > td:nth-child(1) > a")).click();
        //driver.close();
        extent.endTest(logger);
	      extent.flush();
	      extent.close();
	      driver.get("file:///C:/Users/conevo/eclipse-workspace/testproj/test/STMExtentReport.html#!");

	}

}
