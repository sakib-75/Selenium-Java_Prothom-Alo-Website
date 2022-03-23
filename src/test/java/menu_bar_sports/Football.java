package menu_bar_sports;

import org.testng.annotations.Test;
import page_object_model.MenuBarSportsPOM;

public class Football extends Sports {
    @Test
    public void footballPage() {

        MenuBarSportsPOM menuSports = new MenuBarSportsPOM(driver);

        sportsPage(menuSports);
        menuSports.football().click();

        assertTrue(driver, "sports/football");

    }

}
