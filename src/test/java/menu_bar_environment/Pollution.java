package menu_bar_environment;

import org.testng.annotations.Test;
import page_object_model.MenuBarEnvironmentPOM;

public class Pollution extends Environment {
    @Test
    public void pollutionPage() {

        MenuBarEnvironmentPOM envMenu = new MenuBarEnvironmentPOM(driver);

        environmentPage(envMenu);
        envMenu.pollution().click();

        assertTrue(driver, "environment/pollution");

    }

}
