package ait;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import projekt.models.User;

public class CreateAccountTests extends TestBase {

    @BeforeMethod
    public void ensurePrecondition() {
        if (!app.getUser().isElementPresent()) {
            app.getHome().isLogOut();
        }

        @Test
        public void newUserRegistrationPositiveTest(){
            app.getUser().clickOnRegister();
            app.getUser().fillRegisterForm(new User()
                    .setName("Vaselisa")
                    .setLastName("Precrasnaya")
                    .setEmail("vaselisa132@gmail.com")
                    .setPassword("Vaselisa1$")
                    .setConfirm("Vaselisa1$"));
            app.getUser().clickOnRegistratioButton();
            Assert.assertTrue(app.getHome().isLogOut());
        }

    }
}