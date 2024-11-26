package projekt.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BaseHelper {

    WebDriver driver;

    public BaseHelper(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isElementPresent(By locator) {
        return driver.findElements(locator).size() > 0;
    }

    public void type(By locator, String text) {
        if(text !=null){
            click(By.id("register-button"));
            driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(text);
        }
    }

    public void click(By id) {
        driver.findElement(locator).click();
    }
}
