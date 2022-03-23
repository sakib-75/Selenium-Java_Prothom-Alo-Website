package menu_bar_entertainment;

import org.testng.annotations.Test;
import page_object_model.MenuBarEntertainmentPOM;

public class Hollywood extends Entertainment {
    @Test
    public void hollywoodPage() {

        MenuBarEntertainmentPOM entMenu = new MenuBarEntertainmentPOM(driver);

        entertainmentPage(entMenu);
        entMenu.hollywood().click();

        assertTrue(driver, "entertainment/hollywood");

    }

}
