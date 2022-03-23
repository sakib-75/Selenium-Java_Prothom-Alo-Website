package follow_us;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import page_object_model.FollowUsPOM;

public class YouTube extends FollowUs {
    @Test
    public void youTubeFollow() {

        FollowUsPOM followUS = new FollowUsPOM(driver);

        WebElement youtube = followUS.youtubeLink();
        String youtubePageUrl = "youtube.com/channel/UCeG7m5-AJ4I0H4EIleIty4Q";

        followUsCheck(youtube, youtubePageUrl);

    }

}
