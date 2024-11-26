package projekt.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import projekt.models.User;

public class UserHelper extends BaseHelper
{
    public boolean isElementPresent;

    public boolean isElementPresent(){
     return false;   
}

    public UserHelper(WebDriver driver) {
        super(driver);
    }

    public void clickOnRegistratioButton() {
        click();
    }

    public void fillRegisterForm(User user) {
        type(By.name("FirstName"), user.getName());
        type(By.name("LastName"), user.getLastName());
        type(By.name("Email"), user.getEmail());
        type(By.name("Password"), user.getPassword());
        type(By.name("ConfirmPassword"), user.getConfirm());
    }

    public void clickOnRegister() {
        click();
    }
}
