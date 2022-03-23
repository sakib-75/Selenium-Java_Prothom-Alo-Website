package menu_bar_entertainment;

import org.testng.annotations.Test;
import page_object_model.MenuBarEntertainmentPOM;

public class Dhallywood extends Entertainment {
    @Test
    public void dhallywoodPage() {

        MenuBarEntertainmentPOM entMenu = new MenuBarEntertainmentPOM(driver);

        entertainmentPage(entMenu);
        entMenu.dhallywood().click();

        assertTrue(driver, "entertainment/dhallywood");

    }

}
