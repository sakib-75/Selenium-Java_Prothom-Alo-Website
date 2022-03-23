package home;

import base.BaseDriver;
import org.testng.annotations.Test;
import utilities.Utilities;

public class HomePage extends BaseDriver implements Utilities {
    @Test
    public void homePage() {
        String url = "https://www.prothomalo.com";
        driver.get(url);

        assertTrue(driver, url);

    }

}
