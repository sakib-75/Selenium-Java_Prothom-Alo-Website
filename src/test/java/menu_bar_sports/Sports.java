package menu_bar_sports;

import base.BaseDriver;
import page_object_model.MenuBarSportsPOM;
import utilities.Utilities;

public class Sports extends BaseDriver implements Utilities {

    public void sportsPage(MenuBarSportsPOM menuSports) {

        driver.get("https://en.prothomalo.com");
        implicitWait(driver);

        menuSports.menuBar().click();
        menuSports.sports().click();

    }

}
