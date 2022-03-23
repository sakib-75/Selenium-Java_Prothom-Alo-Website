package advertise;

import base.BaseDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import page_object_model.AdvertisePOM;
import utilities.Utilities;
import java.time.Duration;

public class DownloadRateCard extends BaseDriver implements Utilities {
    @Test
    public void downloadRateCard(){

        AdvertisePOM ad = new AdvertisePOM(driver);
        driver.get("https://en.prothomalo.com/");
        implicitWait(driver);
        // Scroll to Bottom
        scrollToBottom(driver);
        // Remove AD (if any)
        acceptPrivacyPolicy(driver);
        removeFooterAD(driver);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(ad.advertise())).click();

        removeAD2(driver); // If any
        //Scroll to button
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, 600);");
        ad.downloadRateCardBtn().click();

        // Switch new tab
        switchTab(driver, 1);

        String expectedUrl = "rate_card_prothom_alo_2022.pdf";
        assertTrue(driver, expectedUrl);

    }

}
