package follow_us;

import java.util.ArrayList;
import org.openqa.selenium.WebElement;
import base.BaseDriver;
import utilities.Utilities;

public class FollowUs extends BaseDriver implements Utilities {

    public void followUsCheck(WebElement item, String itemUrl) {

        driver.get("https://en.prothomalo.com");
        implicitWait(driver);

        // Scroll to Bottom
        scrollToBottom(driver);
        // Remove AD (if any)
        acceptPrivacyPolicy(driver);
        removeFooterAD(driver);

        item.click();

        // Switch new tab
        switchTab(driver, 1);

        assertTrue(driver, itemUrl);

    }

}
