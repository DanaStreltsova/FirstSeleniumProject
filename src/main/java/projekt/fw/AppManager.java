package projekt.fw;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class AppManager{

     String browser;
    public WebDriver driver;
    UserHelper user;
    HomePagetHelper home;
    ContactHelper contact;
    BaseHelper base;

    public AppManager(String browser) {
       this.browser=browser;
    }

    public void init() {

        driver = new ChromeDriver();

        if(browser.equalsIgnoreCase("chrome")){
            driver= new ChromeDriver();
        }else if(browser.equalsIgnoreCase("firfox")){
            driver= new FirefoxDriver();
        }
        driver.manage().window().maximize();
        driver.navigate().to("https://demowebshop.tricentis.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        user = new UserHelper(driver);
        contact = new ContactHelper(driver);
        home = new HomePagetHelper(driver);

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

