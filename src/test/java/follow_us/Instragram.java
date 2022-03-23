package follow_us;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import page_object_model.FollowUsPOM;

public class Instragram extends FollowUs {
    @Test
    public void instragramFollow() {

        FollowUsPOM followUS = new FollowUsPOM(driver);

        WebElement insta = followUS.instragramLink();
        String instaPageUrl = "instagram.com/prothomalo";

        followUsCheck(insta, instaPageUrl);

    }

}
