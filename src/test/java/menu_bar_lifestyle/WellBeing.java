package menu_bar_lifestyle;

import org.testng.annotations.Test;
import page_object_model.MenuBarLifestylePOM;

public class WellBeing extends Lifestyle {
    @Test
    public void wellBeingPage() {

        MenuBarLifestylePOM lsMenu = new MenuBarLifestylePOM(driver);

        lifestylePage(lsMenu);
        lsMenu.wellBeing().click();

        assertTrue(driver, "lifestyle/health");

    }

}
