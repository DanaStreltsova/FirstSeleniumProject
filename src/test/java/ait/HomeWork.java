package ait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class HomeWork extends TestBase{


    @Test
    public void openDemoWebShop(){
        System.out.println("Open Demo Web Shop!");
    }


    @Test
    public void findElementBySimpleLocator(){

        app.driver.findElement(By.id("dialog-notifications-success"));
        app.driver.findElement(By.className("header-logo"));
        app.driver.findElement(By.className("header-menu"));
        app.driver.findElement(By.className("top-menu"));
        app.driver.findElement(By.className("header-links-wrapper"));
        app.driver.findElement(By.linkText("Digital downloads"));
        app.driver.findElement(By.partialLinkText("Books"));
        app.driver.findElement(By.partialLinkText("Computers"));
        app.driver.findElement(By.partialLinkText("Electronics"));
        WebElement p = app.driver.findElement(By.tagName("p"));
    }

    @Test
    public void findElementByCssSelector(){
        app.driver.findElement(By.cssSelector("h3"));
        app.driver.findElement(By.cssSelector("#nivo-slider"));
        app.driver.findElement(By.cssSelector(".header"));
        app.driver.findElement(By.cssSelector(".header-links"));
        app.driver.findElement(By.cssSelector(".cart-qty"));
        app.driver.findElement(By.cssSelector("[href='/cart']"));
        app.driver.findElement(By.cssSelector("[href^='/login']"));
        app.driver.findElement(By.cssSelector("[href^='/wishlist']"));
        app.driver.findElement(By.cssSelector("[href$='search']"));

    }



}
