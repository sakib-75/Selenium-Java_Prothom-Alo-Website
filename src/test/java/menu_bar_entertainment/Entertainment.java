package menu_bar_entertainment;

import base.BaseDriver;
import page_object_model.MenuBarEntertainmentPOM;
import utilities.Utilities;

public class Entertainment extends BaseDriver implements Utilities {

    public void entertainmentPage(MenuBarEntertainmentPOM entMenu) {
        driver.get("https://en.prothomalo.com");
        implicitWait(driver);

        entMenu.menuBar().click();
        entMenu.entertainment().click();

    }

}
