package menu_bar_lifestyle;

import org.testng.annotations.Test;
import page_object_model.MenuBarLifestylePOM;

public class Fashion extends Lifestyle {
    @Test
    public void fashionPage() {

        MenuBarLifestylePOM lsMenu = new MenuBarLifestylePOM(driver);

        lifestylePage(lsMenu);
        lsMenu.fashion().click();

        assertTrue(driver, "lifestyle/fashion");

    }

}
