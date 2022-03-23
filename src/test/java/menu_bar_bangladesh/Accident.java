package menu_bar_bangladesh;

import org.testng.annotations.Test;
import page_object_model.MenuBarBangladeshPOM;

public class Accident extends Bangladesh {
    @Test
    public void accidentPage() {

        MenuBarBangladeshPOM menuBd = new MenuBarBangladeshPOM(driver);

        bangladeshPage(menuBd);
        menuBd.accident().click();

        assertTrue(driver, "bangladesh/accident");

    }

}
