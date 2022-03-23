package menu_bar_corporate;

import org.testng.annotations.Test;
import page_object_model.MenuBarCorporatePOM;

public class Global extends Corporate {
    @Test
    public void globalCorporatePage() {

        MenuBarCorporatePOM crpMenu = new MenuBarCorporatePOM(driver);

        corporatePage(crpMenu);
        crpMenu.global().click();

        assertTrue(driver, "corporate/global");

    }

}
