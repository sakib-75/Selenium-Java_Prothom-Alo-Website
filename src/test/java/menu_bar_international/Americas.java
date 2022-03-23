package menu_bar_international;

import org.testng.annotations.Test;
import page_object_model.MenuBarInternationalPOM;

public class Americas extends International {
    @Test
    public void americasPage() {

        MenuBarInternationalPOM intMenu = new MenuBarInternationalPOM(driver);

        internationalPage(intMenu);
        intMenu.americas().click();

        assertTrue(driver, "international/americas");

    }

}
