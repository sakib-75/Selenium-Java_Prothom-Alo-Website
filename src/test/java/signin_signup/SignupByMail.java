package signin_signup;

import base.BaseDriver;
import org.testng.annotations.Test;
import page_object_model.SigninSignup_POM;
import utilities.Utilities;

public class SignupByMail extends BaseDriver implements Utilities {
    @Test
    public void signupByMail() {

        SigninSignup_POM tc2 = new SigninSignup_POM(driver);
        driver.get("https://www.prothomalo.com");
        implicitWait(driver);

        // Remove pop-up AD (if any)
        removeAD(driver);

        tc2.homeLoginBtn().click();
        tc2.createAccountLink().click();

        tc2.setName("Sakibul Islam");
        tc2.setEmail("sakibulislam285@gmail.com");
        String password = "Abcd12345678";

        tc2.setPassword(password);
        tc2.setConfirmPassword(password);
        tc2.registerBtn().click();

    }
    
}
