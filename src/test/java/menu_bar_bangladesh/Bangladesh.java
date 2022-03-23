package menu_bar_bangladesh;

import base.BaseDriver;
import page_object_model.MenuBarBangladeshPOM;
import utilities.Utilities;

public class Bangladesh extends BaseDriver implements Utilities {

    public void bangladeshPage(MenuBarBangladeshPOM menuBd) {
        driver.get("https://en.prothomalo.com");
        implicitWait(driver);

        menuBd.menuBar().click();
        menuBd.bangladesh().click();

    }

}
