package menu_bar_entertainment;

import org.testng.annotations.Test;
import page_object_model.MenuBarEntertainmentPOM;

public class Bollywood extends Entertainment {
    @Test
    public void bollywoodPage() {

        MenuBarEntertainmentPOM entMenu = new MenuBarEntertainmentPOM(driver);

        entertainmentPage(entMenu);
        entMenu.bollywood().click();

        assertTrue(driver, "entertainment/bollywood");

    }

}
