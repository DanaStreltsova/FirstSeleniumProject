package ait;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class FirstSeleniumTest {

    WebDriver driver;
    //before - setUp
    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        //driver.get("https://www.google.com"); without history

        driver.manage().window().maximize();
        driver.navigate().to("https://www.google.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.navigate().to("https://ilcarro.web.app" );
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
    }
    //test
    @Test
    public void openGoogleTest(){
        System.out.println("Google opened!");
    }
    //after - tearDown
    @AfterMethod(enabled = true)
    public void tearDown(){
       // driver.quit();//закрывает все
        driver.close();//только текущюю вкладку
    }
}