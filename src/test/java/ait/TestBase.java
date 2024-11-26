package ait;

import org.openqa.selenium.remote.Browser;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import projekt.fw.AppManager;

public class TestBase {



    protected static AppManager app = new AppManager(System.getProperty("browser", Browser.CHROME.browserName()));

   // @BeforeMethod
    @BeforeSuite
    public void setUp() {
        app.init();
    }

   // @AfterMethod(enabled = false)
    @AfterSuite
    public void tearDawn() {
        app.stop();
    }


}
