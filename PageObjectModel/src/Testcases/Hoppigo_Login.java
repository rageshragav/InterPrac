package Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Objectrepository.HoppigoLoginPage;

public class Hoppigo_Login {

	@Test
	public void login(){
		System.setProperty("webdriver.chrome.driver", "D:\\DRIVERS\\chromedriver.ex");
		WebDriver driver = new ChromeDriver();
		 driver.get("http://dev-patientcompanion.azurewebsites.net/account/login");
		 HoppigoLoginPage hp = new HoppigoLoginPage(driver);
		 hp.username().sendKeys("");
	}
}
