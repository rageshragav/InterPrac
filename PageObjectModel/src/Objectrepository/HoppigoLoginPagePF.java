package Objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HoppigoLoginPagePF {

	WebDriver driver;
	
	
	public HoppigoLoginPagePF(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="")
	WebElement username;
	public WebElement username(){
		return username;
	}
}
