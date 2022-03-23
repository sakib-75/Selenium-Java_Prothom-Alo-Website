package menu_bar_international;

import org.testng.annotations.Test;
import page_object_model.MenuBarInternationalPOM;

public class Europe extends International {
    @Test
    public void europePage() {

        MenuBarInternationalPOM intMenu = new MenuBarInternationalPOM(driver);

        internationalPage(intMenu);
        intMenu.europe().click();

        assertTrue(driver, "international/europe");

    }

}
