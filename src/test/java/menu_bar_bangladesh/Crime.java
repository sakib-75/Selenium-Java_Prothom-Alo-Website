package menu_bar_bangladesh;

import org.testng.annotations.Test;
import page_object_model.MenuBarBangladeshPOM;

public class Crime extends Bangladesh {
    @Test
    public void crimePage() {

        MenuBarBangladeshPOM menuBd = new MenuBarBangladeshPOM(driver);

        bangladeshPage(menuBd);
        menuBd.crime().click();

        assertTrue(driver, "bangladesh/crime");

    }

}
