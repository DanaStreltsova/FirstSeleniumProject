package projekt.fw;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class AppManager{

    public WebDriver driver;
    UserHelper user;
    HomePagetHelper home;
    ContactHelper contact;
    BaseHelper base;

    public void init() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://demowebshop.tricentis.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        user = new UserHelper(driver);
        contact = new ContactHelper(driver);
        home = new HomePagetHelper(driver);
        base = new BaseHelper(driver);
    }

    public void stop() {
        driver.close();
    }

    public UserHelper getUser() {
        return user;
    }

    public HomePagetHelper getHome() {
        return home;
    }

    public ContactHelper getContact() {
        return contact;
    }

    public BaseHelper getBase() { return base; }
}
