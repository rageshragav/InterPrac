package testng;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


public class Hoppigo_Base {

	public WebDriver driver;
	public static ExtentReports extent;
	public static ExtentTest logger;
	public ExtentHtmlReporter htmlReporter;
	public static By FILL_EMAIl = By.id("Email");
	  public WebDriverWait webDriverWait;
	  public static final int DELAY = 5;
	
	//public  static String forenaame_1 = testData("username");
	//public static String surname_1 = testData("password");
	/*public Hoppigo_Base() {
        webDriverWait = new WebDriverWait(driver, DELAY);
    }
	 public WebElement waitForVisibilityOfElementLocatedBy( By locator) {
	        return webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}*/
  @BeforeSuite
  public void beforeMethod() {
	 
	  // Create a new instance of the chrome driver
	  System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
      driver = new ChromeDriver();
      
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      driver.get("http://dev-patientcompanion.azurewebsites.net/account/login");
      
     
  }	

 
  public void launchPatient(){	
	  ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs.get(1)); //switches to new tab
	    driver.get("http://dev-patientcompanion.azurewebsites.net/#/lang=en");
  }
  /*public void testData() throws IOException {
		String returnText = "";
		//Properties obj = new Properties();
		//FileInputStream objfile = new FileInputStream(System.getProperty("user.dir")+"\\config.properties");
		//obj.load(objfile);
		
		Properties prop= new Properties();
			File file = new File("C:\\Users\\conevo\\eclipse-workspace\\testproj\\config.properties");
			FileInputStream fileInput = new FileInputStream(file);
			
			prop.load(fileInput);
			String un = prop.getProperty("username");
			
		}*/
public static String testData(String key) {
	String returnText = "";
	//Properties obj = new Properties();
	//FileInputStream objfile = new FileInputStream(System.getProperty("user.dir")+"\\config.properties");
	//obj.load(objfile);
	try {
		
		File file = new File("	C:\\Users\\conevo\\eclipse-workspace\\testproj\\config.properties");
		FileInputStream fileInput = new FileInputStream(file);
		Properties properties = new Properties();
		properties.load(fileInput);
		returnText = properties.getProperty(key);
		fileInput.close();
		
	} catch (Exception e) {	
	}
	return returnText;
} 	
@BeforeTest
public void extentReports(){
	extent = new ExtentReports(System.getProperty("user.dir")+"/test/STMExtentreport.html",true);
	extent.addSystemInfo("Host Name", "ExtentReportLearning").addSystemInfo("Enviromnet", "Hoppigo AutomationTesting").addSystemInfo("User Name", "Ragesh RB");
	extent.loadConfig(new File(System.getProperty("user.dir")+"\\extent-config.xml"));
}
@AfterMethod
	public void getResult(ITestResult result){
		if(result.getStatus() == ITestResult.FAILURE){
			logger.log(LogStatus.FAIL, "Test Case Failed is "+result.getName());

			//logger.log(LogStatus.FAIL, "Test Case Failed is "+result.getName());
			//logger.log(LogStatus.FAIL, "Test Case Failed is "+result.getThrowable());
		}
		// ending test
		//endTest(logger) : It ends the current test and prepares to create HTML report
		extent.endTest(logger);
	}
@AfterTest
public void endReport(){

//extent.endTest(logger);
extent.flush();
extent.close();
}
}

  //@AfterMethod

 


