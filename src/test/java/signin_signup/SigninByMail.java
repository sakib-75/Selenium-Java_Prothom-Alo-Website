package signin_signup;

import base.BaseDriver;
import org.testng.annotations.Test;
import page_object_model.SigninSignup_POM;
import utilities.Utilities;

public class SigninByMail extends BaseDriver implements Utilities {
    @Test
    public void signinByMail() {

        SigninSignup_POM tc2 = new SigninSignup_POM(driver);
        driver.get("https://www.prothomalo.com");
        implicitWait(driver);

        // Remove pop-up AD (if any)
        removeAD(driver);

        tc2.homeLoginBtn().click();
        tc2.setEmail("sakibulislam285@gmail.com");
        tc2.setPassword("Sakib17181103054");
        tc2.loginBtn().click();

    }

}
