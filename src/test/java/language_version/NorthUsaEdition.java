package language_version;

import base.BaseDriver;
import org.testng.annotations.Test;
import page_object_model.LanguageEdition_POM;
import utilities.Utilities;

public class NorthUsaEdition extends BaseDriver implements Utilities {
    @Test
    public void north_usaEdition() {

        LanguageEdition_POM tc3 = new LanguageEdition_POM(driver);
        driver.get("https://www.prothomalo.com");
        implicitWait(driver);

        // Remove pop-up AD (if any)
        removeAD(driver);

        actions.moveToElement(tc3.editionDropdown()).build().perform();
        tc3.north_usaEdition().click();

        String expectedUrl = "northamerica.prothomalo.com";
        assertTrue(driver, expectedUrl);

    }

}
