package ait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class TestBase {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://demowebshop.tricentis.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @AfterMethod(enabled = false)
    public void tearDawn() {
        driver.close();
    }

    public boolean isElementPresent(By locator) {
        return driver.findElements(locator).size() > 0;
    }


    public void type(By locator, String text) {
        if(text !=null){
            click(locator);
            driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(text);
        }
    }

    public void clickOnRegistratioButton() {
        click(By.name("register-button"));
    }

    public void fillRegisterForm(User user) {
        type(By.name("FirstName"), user.getName());
        type(By.name("LastName"), user.getLastName());
        type(By.name("Email"), user.getEmail());
        type(By.name("Password"), user.getPassword());
        type(By.name("ConfirmPassword"), user.getConfirm());
    }

    public void clickOnRegister() {
        click(By.cssSelector("[href='/register']"));
    }


    public void click(By locator) {
        driver.findElement(locator).click();
    }

    public boolean isLogOut() {
        return isElementPresent(By.className("ico-logout"));
    }
}
