package menu_bar_bangladesh;

import org.testng.annotations.Test;
import page_object_model.MenuBarBangladeshPOM;

public class Government extends Bangladesh {
    @Test
    public void governmentPage() {

        MenuBarBangladeshPOM menuBd = new MenuBarBangladeshPOM(driver);

        bangladeshPage(menuBd);
        menuBd.government().click();

        assertTrue(driver, "bangladesh/government");

    }

}
