package menu_bar_youth;

import base.BaseDriver;
import page_object_model.MenuBarYouthPOM;
import utilities.Utilities;

public class Youth extends BaseDriver implements Utilities {

    public void youthPage(MenuBarYouthPOM ythMenu) {
        driver.get("https://en.prothomalo.com");
        implicitWait(driver);

        ythMenu.menuBar().click();
        ythMenu.youth().click();

    }

}
