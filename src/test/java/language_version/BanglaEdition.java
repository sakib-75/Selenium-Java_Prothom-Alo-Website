package language_version;

import base.BaseDriver;
import org.testng.annotations.Test;
import page_object_model.LanguageEdition_POM;
import utilities.Utilities;

public class BanglaEdition extends BaseDriver implements Utilities {
    @Test
    public void banglaEdition() {

        LanguageEdition_POM tc3 = new LanguageEdition_POM(driver);
        driver.get("https://www.prothomalo.com");
        implicitWait(driver);

        // Remove pop-up AD (if any)
        removeAD(driver);

        actions.moveToElement(tc3.editionDropdown()).build().perform();
        tc3.banglaEdition().click();

        String expectedUrl = "prothomalo.com";
        assertTrue(driver, expectedUrl);

    }

}
