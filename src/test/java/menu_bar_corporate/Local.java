package menu_bar_corporate;

import org.testng.annotations.Test;
import page_object_model.MenuBarCorporatePOM;

public class Local extends Corporate {
    @Test
    public void localCorporatePage() {

        MenuBarCorporatePOM crpMenu = new MenuBarCorporatePOM(driver);

        corporatePage(crpMenu);
        crpMenu.local().click();

        assertTrue(driver, "corporate/local");

    }

}
