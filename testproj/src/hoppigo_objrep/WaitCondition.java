package hoppigo_objrep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitCondition {
	/**
     * The constant DELAY. This is delay for WebDriverWait is seconds.
     */
    public static final int DELAY = 5;

    /**
     * The private value webDriverWait.
     */
    public WebDriverWait webDriverWait;
    /**
     * The value for WebDriver.
     */
    public WebDriver driver;
    /**
     * The constructor.
     */
    public WaitCondition() {
        webDriverWait = new WebDriverWait(driver, DELAY);
    }

    /**
     * Wait for visibility of element located by web element.
     *
     * @param locator the locator.
     * @return the web element.
     */
    public WebElement waitForVisibilityOfElementLocatedBy( By locator) {
        return webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(locator));
}
    }
