package follow_us;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import page_object_model.FollowUsPOM;

public class Twitter extends FollowUs {
    @Test
    public void twitterFollow() {

        FollowUsPOM followUS = new FollowUsPOM(driver);

        WebElement twitter = followUS.twitterLink();
        String twitterPageUrl = "twitter.com/ProthomAlo";

        followUsCheck(twitter, twitterPageUrl);

    }

}
