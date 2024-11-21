package ait;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase {
    
    @Test
    public void newUserRegistrationPositiveTest(){
        click(By.cssSelector("[href='/register']"));
        password(By.name("FirstName"), "Vaselisa");
        password(By.name("LastName"), "Precrasnaya");
        password(By.name("Email"), "vaselisa12@gmail.com");
        password(By.name("Password"), "Vaselisa1$");
        password(By.name("ConfirmPassword"), "Vaselisa1$");
        click(By.name("register-button"));

        Assert.assertTrue(isElementPresent(By.className("ico-logout")));
    }

    public void confirm(By locator, String text) {
        email(locator, text);
    }

    public void password(By locator, String text) {
        lastName(locator, text);
    }

    public void email(By locator, String text) {
        click(locator);
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(text);
    }

    public void lastName(By locator, String text) {
        firstName(locator, text);
    }

    public void firstName(By locator, String text) {
        confirm(locator, text);
    }

    public void click(By locator) {
        driver.findElement(locator).click();
    }
}
