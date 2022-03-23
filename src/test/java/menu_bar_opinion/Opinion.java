package menu_bar_opinion;

import base.BaseDriver;
import page_object_model.MenuBarOpinionPOM;
import utilities.Utilities;

public class Opinion extends BaseDriver implements Utilities {

    public void opinionPage(MenuBarOpinionPOM opMenu) {
        driver.get("https://en.prothomalo.com");
        implicitWait(driver);

        opMenu.menuBar().click();
        opMenu.opinion().click();

    }

}
