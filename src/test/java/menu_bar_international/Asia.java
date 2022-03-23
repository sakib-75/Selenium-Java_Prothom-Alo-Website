package menu_bar_international;

import org.testng.annotations.Test;
import page_object_model.MenuBarInternationalPOM;

public class Asia extends International {
    @Test
    public void asiaPage() {

        MenuBarInternationalPOM intMenu = new MenuBarInternationalPOM(driver);

        internationalPage(intMenu);
        intMenu.asia().click();

        assertTrue(driver, "international/asia");

    }

}
