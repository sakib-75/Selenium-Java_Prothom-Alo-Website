package follow_us;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import page_object_model.FollowUsPOM;

public class Facebook extends FollowUs {
    @Test
    public void facebookFollow() {

        FollowUsPOM followUS = new FollowUsPOM(driver);

        WebElement fb = followUS.facebookLink();
        String fbPageUrl = "facebook.com/ProthomAloEnglish";

        followUsCheck(fb, fbPageUrl);

    }

}
