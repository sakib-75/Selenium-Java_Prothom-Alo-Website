package menu_bar_lifestyle;

import org.testng.annotations.Test;
import page_object_model.MenuBarLifestylePOM;

public class Travel extends Lifestyle {
    @Test
    public void travelPage() {

        MenuBarLifestylePOM lsMenu = new MenuBarLifestylePOM(driver);

        lifestylePage(lsMenu);
        lsMenu.travel().click();

        assertTrue(driver, "lifestyle/travel");

    }

}
