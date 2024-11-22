package ait;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase {
    
    @Test
    public void newUserRegistrationPositiveTest(){
        clickOnRegister();
        fillRegisterForm(new User()
                .setName("Vaselisa")
                .setLastName("Precrasnaya")
                .setEmail("vaselisa12@gmail.com")
                .setPassword("Vaselisa1$")
                .setConfirm("Vaselisa1$"));
        clickOnRegistratioButton();
        Assert.assertTrue(isLogOut());
    }

}
