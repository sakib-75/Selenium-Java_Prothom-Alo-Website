package signin_signup;

import base.BaseDriver;
import org.testng.annotations.Test;
import page_object_model.SigninSignup_POM;
import utilities.Utilities;

public class SignupWithFacebook extends BaseDriver implements Utilities {
    @Test
    public void signupWithFacebook() {

        SigninSignup_POM tc2 = new SigninSignup_POM(driver);
        driver.get("https://www.prothomalo.com");
        implicitWait(driver);

        // Remove pop-up AD (if any)
        removeAD(driver);

        tc2.homeLoginBtn().click();
        tc2.createAccountLink().click();
        tc2.facebookBtn().click();

    }

}
