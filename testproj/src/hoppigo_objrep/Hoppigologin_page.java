package hoppigo_objrep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Hoppigologin_page {
	WebDriver driver;
	

	public Hoppigologin_page(WebDriver driver) {
		this.driver = driver;	
	}
	
	
	By email = By.id("Email");
	By password = By.id("Password"); 
	public WebElement email() {
		return driver.findElement(email);
	}
	public WebElement password() {
		return driver.findElement(password);
	}
	
}
