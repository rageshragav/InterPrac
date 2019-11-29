package seleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngClass {
	public static  WebDriver driver ;
	@BeforeTest
	public void verify() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe");
		
		
		 driver = new ChromeDriver();
	
	}
	@Test
	public void test() {
		driver.get("http://newtours.demoaut.com/index.php?osCsid=ff2108bb7e7e9474e333ac3bcecb3f30");
	}
	
	

}
