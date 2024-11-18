package ait;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomeWork {
    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://demowebshop.tricentis.com");
        driver.navigate().back();
    }

    @Test
    public void openDemoWebShop(){
        System.out.println("Open Demo Web Shop!");
    }

    @AfterMethod(enabled = true)
    public void tearDawn(){
        driver.close();
    }
}
