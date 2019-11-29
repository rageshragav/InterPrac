package testng;

import java.util.ArrayList;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

public class Hoopi_Patient extends Hoppigo_Test {

	
	//@Test(priority = 5)
	@Test(dependsOnMethods = { "fillDepartmentdetails" })
public void runPatient() throws InterruptedException{
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript("window.open();");
		Thread.sleep(1000);
		try{
		  ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
		    driver.switchTo().window(tabs.get(1)); //switches to new tab
		   // driver.get("http://dev-patientcompanion.azurewebsites.net/#/lang=en");
		    driver.get("file:///C:/Users/conevo/eclipse-workspace/testproj/test/STMExtentreport.html");
		    logger.log(LogStatus.PASS,"Test ran successfully and extent report generated");
		}
		catch(Exception e){
			System.out.print(e);
		}
		
	/*	WebElement selHospital = driver.findElement(By.xpath("//div[@class='btn-group disclaimer-dropdown row col-xs-12 col-sm-12 col-lg-5 dropdown-right dropdown']//button[@id='single-button']"));
		selHospital.click();
		WebElement hospitalList = driver.findElement(By.xpath("//ul[@class='dropdown-menu dropdown-list ng-pristine ng-untouched ng-valid ng-empty']"));
		String options = hospitalList.getText();
		System.out.print(options);
		if(options.contains("Automated hospital"))
		{
			driver.findElement(By.xpath("//a[contains(text(),'Automated hospital')]")).click();
			Thread.sleep(1000);
		}
		
		WebElement selDep = driver.findElement(By.xpath("//div[@class='btn-group disclaimer-dropdown row col-xs-12 col-sm-12 col-lg-5 dropdown-left-list dropdown']//button[@id='single-button']"));
		selDep.click();
		WebElement depList = driver.findElement(By.xpath("//a[contains(text(),'Automated department')]"));
		String options1 = depList.getText();
		System.out.print(options);
		if(options1.contains("Automated department"))
		{
			driver.findElement(By.xpath("//a[contains(text(),'Automated department')]")).click();
			Thread.sleep(1000);
		}
		
		WebElement selSurgery = driver.findElement(By.xpath("//div[@class='btn-group disclaimer-dropdown row col-xs-12 col-sm-12 col-lg-5 dropdown-right-list dropdown']//button[@id='single-button']"));
		selSurgery.click();
		WebElement surList = driver.findElement(By.xpath("//a[contains(text(),'Heart surgery')]"));
		String options2 = surList.getText();
		System.out.print(options);
		if(options2.contains("Heart surgery"))
		{
			scrollDown();
			driver.findElement(By.xpath("//a[contains(text(),'Automated department')]")).click();
			Thread.sleep(1000);
		}*/
}
}
