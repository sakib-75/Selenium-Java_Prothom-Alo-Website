package menu_bar_sports;

import org.testng.annotations.Test;
import page_object_model.MenuBarSportsPOM;

public class LocalSports extends Sports {
    @Test
    public void localSports() {

        MenuBarSportsPOM menuSports = new MenuBarSportsPOM(driver);

        sportsPage(menuSports);
        menuSports.localSports().click();

        assertTrue(driver, "sports/local-sports");

    }

}
