package menu_bar_lifestyle;

import base.BaseDriver;
import page_object_model.MenuBarLifestylePOM;
import utilities.Utilities;

public class Lifestyle extends BaseDriver implements Utilities {

    public void lifestylePage(MenuBarLifestylePOM lsMenu) {
        driver.get("https://en.prothomalo.com");
        implicitWait(driver);

        lsMenu.menuBar().click();
        lsMenu.lifestyle().click();

    }

}
