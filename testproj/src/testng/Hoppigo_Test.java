package testng;


import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import hoppigo_objrep.Hoppigologin_page;
import hoppigo_objrep.WaitCondition;

public class Hoppigo_Test extends Hoppigo_Base{
	
	String hospitalName = "Automated hospital";
	String dpName = "Automated department";
	
	public void scrollDown(){
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,1300)");
	}

	
	//@Test(priority = 1)
	@Test
	public void Login() throws InterruptedException {
		Hoppigologin_page hlp = new Hoppigologin_page(driver);
		
		logger = extent.startTest("Launching hoppigo and signing in");
	
		
		 //final WaitCondition waitCondition = new WaitCondition();
		 //TC 01 Checking whether user landed in admin tool page
	      Assert.assertEquals("Administration Tool", driver.findElement(By.xpath("//p[@id='adminlogo-para']")).getText());
	      logger.log(LogStatus.PASS,"User landed in adminstration tool page successfully");
	      
	      //TC 02 Checking pagetitle 
	      Assert.assertEquals("Log in - Admin", driver.getTitle());
	      logger.log(LogStatus.PASS,"header of the page verified successfully");
	    
		//TC 03 Verifying login with empty fields and logging in
		driver.findElement(By.id("login-submit")).click();
		WebElement usernameError = driver.findElement(By.xpath("//*[contains(text(),'The Email field is required.')]"));
		WebElement passwordError = driver.findElement(By.xpath("//*[contains(text(),'The Password field is required.')]"));
		
		if(usernameError.isDisplayed() && passwordError.isDisplayed()){
			//driver.navigate().refresh();
			logger.log(LogStatus.PASS,"Username & Password - Empty fields error shown");
			//driver.findElement(By.id("Email")).sendKeys("admin@pc.com");
			//waitForVisibilityOfElementLocatedBy(FILL_EMAIl).sendKeys("admin");
			//waitCondition.waitForVisibilityOfElementLocatedBy(FILL_EMAIl).sendKeys("admin@pc.com");
			hlp.email().sendKeys("admin@pc.com");
		   Thread.sleep(2000);
		    hlp.password().sendKeys("Conevo@2018");
		   // driver.findElement(By.id("Password")).sendKeys("Conevo@2018");
		   Thread.sleep(2000);
		    driver.findElement(By.id("login-submit")).click();
		    Thread.sleep(1000);
		}
		logger.log(LogStatus.PASS,"Signed-in successfully");
	    driver.manage().window().maximize();

	      
	      // Print a Log In message to the screen
	      System.out.println(" Login is Successfull");
	      String expectedTitle = "Disclaimer - Admin";
	      String actualTitle = driver.getTitle();
	      System.out.println(actualTitle);
	      Assert.assertEquals(actualTitle, expectedTitle);
	     
	  }
	//@Test(priority = 2)
	@Test(dependsOnMethods = { "Login" })
	public void newHospital() throws InterruptedException, IOException {
		logger = extent.startTest("Creating new hospital");
		
		driver.findElement(By.xpath("//a[contains(text(),'Hospital Page')]")).click();
		Thread.sleep(1500);
		scrollDown();
		Thread.sleep(1000);
		
		//TC 04 verifying hospital creation with empty fields and creating hospital
		driver.findElement(By.id("newQuestion")).click();
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Des_val")));
		driver.findElement(By.id("CreateHospital")).click();
		WebElement hospitalError = driver.findElement(By.xpath("//span[contains(text(),'The HospitalName field is required.')]"));
		if(hospitalError.isDisplayed()){
			driver.findElement(By.id("Des_val")).sendKeys(hospitalName);
			logger.log(LogStatus.PASS,"Hospital field empty error shown");    
		}
		
		scrollDown();
		driver.findElement(By.id("UploadImage")).click();
		Thread.sleep(2000);
		              

		Runtime.getRuntime().exec("C:\\selectAutoit.exe");
		Thread.sleep(3000);
		driver.findElement(By.id("CreateHospital")).click();
		
		String result = driver.findElement(By.xpath(".//*[@id='hospitalList']//td[contains(.,'Automated hospital')]")).getText();
		if(result.matches(result))
		{
			Assert.assertEquals(hospitalName, "Automated hospital");
			Reporter.log("Hospital created successfully ",true);
			logger.log(LogStatus.PASS,"New Hospital created and added to the hospitals list ");
		}
		else
		{
			 Reporter.log("Hospital Not created successfully  ",true);
			 logger.log(LogStatus.FAIL,"New Hospital created and added to the hospitals list ");
		}
		java.util.List<WebElement> HosList = driver.findElements(By.xpath("//div[@id='hospitalList']"));

		//TC 05 click on the created hospital and create new dep
		for(int i=0;i<HosList.size();i++){
		    String ActCustName = HosList.get(i).getText();
		    System.out.println(ActCustName);

		    Thread.sleep(1000);
		    if(ActCustName.contains(hospitalName)){
		     WebElement newHos = driver.findElement(By.xpath(".//*[@id='hospitalList']//td[contains(.,'Automated hospital')]")); 
		     newHos.click();
			    Thread.sleep(1000);
			    
			    //Publishing hospital to live
		     driver.findElement(By.xpath("//span[@class='slider round']")).click();
		     
		    }
		    
		}
	
	}		
	//@Test(priority = 3)
	@Test(dependsOnMethods = { "newHospital" })
	public void newDepartment() throws InterruptedException, IOException {
		logger = extent.startTest("Creating new Department");
		
		driver.findElement(By.id("newQuestion")).click();
		Thread.sleep(2000);
		scrollDown();
		//Checking error message with empty field on create department page
		driver.findElement(By.id("CreateDepartment")).click();
		WebElement depError = driver.findElement(By.xpath("//span[contains(text(),'The Department Name field is required.')]"));
		if(depError.isDisplayed()){
			logger.log(LogStatus.PASS,"Empty department field validated ");
			WebElement fields = driver.findElement(By.id("Des_val"));
			WebDriverWait wait = new WebDriverWait(driver, 10); 
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='Des_val']"))).click(); 
			fields.sendKeys(dpName);
			scrollDown();
			driver.findElement(By.id("CreateDepartment")).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='listOfQuestions']"))); 
			
		}
		else {
			logger.log(LogStatus.FAIL,"Empty department field not validated ");
		}
		
		
		String result = driver.findElement(By.xpath(".//*[@id='listOfQuestions']//td[contains(.,'Automated department')]")).getText();
		if(result.matches(dpName))
		{
			Assert.assertEquals(dpName, "Automated department");
			Reporter.log("Department created successfully ",true);
			logger.log(LogStatus.PASS,"New Department created successfully");
		}
		
		else
		{
			 Reporter.log("Department not created successfully  ",true);
			 logger.log(LogStatus.FAIL,"Department not created successfully");
		}
		Thread.sleep(2000);
		WebElement newDep = driver.findElement(By.xpath(".//*[@id='listOfQuestions']//td[contains(.,'Automated department')]")); 
		newDep.click();
		Thread.sleep(4000);
		
	}
//	@Test(priority = 4)
	@Test(dependsOnMethods = { "newDepartment" })
	public void fillDepartmentdetails() throws InterruptedException, IOException {
		logger = extent.startTest("Filling Department details of the new created department");
		WebElement selAdmin = driver.findElement(By.id("hospitalddl"));
		Select sel = new Select(selAdmin);
		sel.selectByVisibleText("Test admin");
		Thread.sleep(1500);
		WebElement iframeElement = driver.findElement(By.xpath("//iframe[@class='cke_wysiwyg_frame cke_reset']"));
		 
		driver.switchTo().frame(iframeElement);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")).click();
		driver.findElement(By.xpath("//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")).sendKeys("Test Automated description for the newly created department");
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		scrollDown();
		Thread.sleep(1500);
		driver.findElement(By.id("Create")).click();
		Thread.sleep(3000);
		//Publishing department live
		driver.findElement(By.xpath("//span[@class='slider round']")).click();
		Thread.sleep(2000);
		scrollDown();
		driver.findElement(By.id("newQuestion")).click();
		Thread.sleep(2000);
		//TC07 Checking empty surgery field
		driver.findElement(By.id("CreateSurgery")).click();
		WebElement surgeryError = driver.findElement(By.xpath("//span[contains(text(),'The SurgeryName field is required.')]"));
		if(surgeryError.isDisplayed()){
			driver.findElement(By.xpath("//*[@name='SurgeryName']")).sendKeys("Heart surgery");
			driver.findElement(By.id("CreateSurgery")).click();
			Thread.sleep(25000);
			 logger.log(LogStatus.PASS,"Surgery empty field validated");
		}else{
			 logger.log(LogStatus.FAIL,"Surgery empty field not validated");
		}
		
		
		WebElement surgeryTab = driver.findElement(By.id("listOfQuestions"));
		if(surgeryTab.isDisplayed())
		{
			logger.log(LogStatus.PASS,"New Surgery created successfully");
			driver.findElement(By.xpath(".//*[@id='listOfQuestions']//td[contains(.,'Heart surgery')]")).click();
		}else
		{logger.log(LogStatus.FAIL,"New Department not created successfully");}
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='slider round']")).click();
		scrollDown();
		Thread.sleep(3000);	
		driver.findElement(By.id("Create")).click();
		Thread.sleep(5000);	
	}
}
