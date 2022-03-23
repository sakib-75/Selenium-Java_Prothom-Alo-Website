package menu_bar_sports;

import org.testng.annotations.Test;
import page_object_model.MenuBarSportsPOM;

public class Cricket extends Sports{
    @Test
    public void cricketPage() {

        MenuBarSportsPOM menuSports = new MenuBarSportsPOM(driver);

        sportsPage(menuSports);
        menuSports.cricket().click();

        assertTrue(driver, "sports/cricket");

    }

}
