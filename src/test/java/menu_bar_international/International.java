package menu_bar_international;

import base.BaseDriver;
import page_object_model.MenuBarInternationalPOM;
import utilities.Utilities;

public class International extends BaseDriver implements Utilities {

    public void internationalPage(MenuBarInternationalPOM intMenu) {
        driver.get("https://en.prothomalo.com");
        implicitWait(driver);

        intMenu.menuBar().click();
        intMenu.international().click();

    }

}
