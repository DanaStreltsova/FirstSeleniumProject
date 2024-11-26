package projekt.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePagetHelper extends  BaseHelper {
    public HomePagetHelper(WebDriver driver) {
        super(driver);
    }

    public boolean isLogOut() {
        return isElementPresent(By.className("ico-logout"));
    }

    public void clickOnHomeLink() {
        click(By.xpath("//body/div[4]/div[1]"));
    }
}
