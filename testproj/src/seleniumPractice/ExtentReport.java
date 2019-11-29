package seleniumPractice;


import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


public class ExtentReport {

	
	 public static ExtentReports extent;
	public static ExtentTest logger;
	public static ExtentHtmlReporter htmlReporter;
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") + "/test/STMExtentReport.html");
    	// Create an object of Extent Reports
	  
	extent = new ExtentReports();
	extent.attachReporter(htmlReporter);
	extent.setSystemInfo("Host Name", "SoftwareTestingMaterial");
    	extent.setSystemInfo("Environment", "Production");
	extent.setSystemInfo("User Name", "Ragesh");
	htmlReporter.config().setDocumentTitle("Katkada regression "); 
            // Name of the report
	htmlReporter.config().setReportName("Katkada regression test "); 
            // Dark Theme
	htmlReporter.config().setTheme(Theme.STANDARD);		
		//extent = new ExtentReports(System.getProperty("user.dir")+"/test/STMExtentreport.html",true);
		//extent.addSystemInfo("Host Name", "ExtentReportLearning").addSystemInfo("Enviromnet", "AutomationTesting").addSystemInfo("User Name", "Ragesh RB");
		//extent.loadConfig(new File(System.getProperty("user.dir")+"\\extent-config.xml"));
		
System.setProperty("webdriver.chrome.driver","D:\\DRIVERS\\chromedriver.exe");

		
		driver = new ChromeDriver();
		logger = extent.createTest("Launching katkada and recharging postpaid");
	
		driver.get("https://www.katkada.com");
		logger.pass("Katkada launched successfully");
		  List <WebElement> selection = driver.findElements(By.name("connection"));
	       System.out.println(selection.size());
	       Thread.sleep(2000);
	       //logger.log(LogStatus.INFO,"clicking on Postpaid");
	   	
	      driver.findElement(By.xpath("//*[@for='postpaid']")).click();
	      
	      
	      
	      
	      
	      
	     // extent.endTest(logger);
	      extent.flush();
	      //extent.close();
	      
	
		
	}

}
