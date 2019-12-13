package practice;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class without_SendKeys {

	public static void main(String args[]) throws InterruptedException, IOException{
		
		System.setProperty("webdriver.chrome.driver", "D:\\DRIVERS\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement nextBtn = driver.findElement(By.id("identifierNext"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.getElementById('identifierId').value='testemail'");
		
		
		js.executeScript("arguments[0].click();", nextBtn);
		
		Screenshot fpScreenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
	     ImageIO.write(fpScreenshot.getImage(),"PNG",new File("D:///FullPageScreenshot.png"));
	    
	}
}

