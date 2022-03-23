package menu_bar_business;

import base.BaseDriver;
import page_object_model.MenuBarBusinessPOM;
import utilities.Utilities;

public class Business extends BaseDriver implements Utilities {

    public void businessPage(MenuBarBusinessPOM bMenu) {
        driver.get("https://en.prothomalo.com");
        implicitWait(driver);

        bMenu.menuBar().click();
        bMenu.business().click();

    }

}
