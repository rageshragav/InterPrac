package practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PopupsHandling {
	
	@Test
	public void ExampleForAlert() throws InterruptedException
	{
		 System.setProperty("webdriver.chrome.driver","D:\\DRIVERS\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			
		driver.manage().window().maximize();
		driver.get("C:\\alert.html");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@onclick='alertFunction()']")).click();
		Alert alert=driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);
		if(text.contains("am")){
			System.out.println("it contains text");
		}
		else{
			System.out.println("it dosent contains text");
		}
		System.out.println(alert.getText());
		alert.accept();
	}
}

