package pages;

import org.openqa.selenium.*;
import org.junit.*;

import static org.junit.Assert.assertTrue;


public class BasePage {

    WebDriver driver;

    public boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public void isElementDisplayed(WebElement webElement) {

        assertTrue(webElement.isDisplayed());
    }

    public void fillField(WebElement element, String value) throws Exception {
        element.clear();
        element.sendKeys(value);
        Thread.sleep(1000);
    }

    public void pageScroll(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true)", element);
    }

    public void wait(int ms) throws Exception {
        Thread.sleep(ms);
    }


}
