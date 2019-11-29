package crossbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowTest {
	public WebDriver driver;
	 @Test
	 @Parameters("browser")
	 public void test(String browtype){
		 if(browtype.equalsIgnoreCase("firefox")){
			 System.setProperty("webdriver.firefox.marionette","D:\\geckodriver.exe");
			 driver = new FirefoxDriver();
		 }
		 else if (browtype.equalsIgnoreCase("chrome")) {
			 System.setProperty("webdriver.chrome.driver","D:\\DRIVERS\\chromedriver.exe");
			 driver = new ChromeDriver();
		 }
		 driver.get("http://dev-patientcompanion.azurewebsites.net/account/login");
		 driver.manage().window().maximize();
	 }
}
