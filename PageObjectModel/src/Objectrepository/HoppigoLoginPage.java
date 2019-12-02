package Objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HoppigoLoginPage {

	WebDriver driver;
	
	
	public HoppigoLoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	By username = By.xpath("");
	By password = By.xpath("");
	By loginBtn = By.xpath("");
	
	public WebElement username(){
		return driver.findElement(username);
	}
}
