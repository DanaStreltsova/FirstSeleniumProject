package ait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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

    @Test
    public void findElementBySimpleLocator(){

        driver.findElement(By.id("dialog-notifications-success"));
        driver.findElement(By.className("header-logo"));
        driver.findElement(By.className("header-menu"));
        driver.findElement(By.className("top-menu"));
        driver.findElement(By.className("header-links-wrapper"));
        driver.findElement(By.linkText("Digital downloads"));
        driver.findElement(By.partialLinkText("Books"));
        driver.findElement(By.partialLinkText("Computers"));
        driver.findElement(By.partialLinkText("Electronics"));
        WebElement p = driver.findElement(By.tagName("p"));
    }

    @Test
    public void findElementByCssSelector(){
        driver.findElement(By.cssSelector("h3"));
        driver.findElement(By.cssSelector("#nivo-slider"));
        driver.findElement(By.cssSelector(".header"));
        driver.findElement(By.cssSelector(".header-links"));
        driver.findElement(By.cssSelector(".cart-qty"));
        driver.findElement(By.cssSelector("[href='/cart']"));
        driver.findElement(By.cssSelector("[href^='login']"));
        driver.findElement(By.cssSelector("[href^='/wishlist']"));
        driver.findElement(By.cssSelector("[href$='search']"));

    }



}
