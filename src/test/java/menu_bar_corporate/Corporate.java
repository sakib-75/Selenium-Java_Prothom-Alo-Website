package menu_bar_corporate;

import base.BaseDriver;
import page_object_model.MenuBarCorporatePOM;
import utilities.Utilities;

public class Corporate extends BaseDriver implements Utilities {

    public void corporatePage(MenuBarCorporatePOM crpMenu) {
        driver.get("https://en.prothomalo.com");
        implicitWait(driver);

        crpMenu.menuBar().click();
        crpMenu.corporate().click();

    }

}
