package menu_bar_environment;

import org.testng.annotations.Test;
import page_object_model.MenuBarEnvironmentPOM;

public class Climate extends Environment {
    @Test
    public void climatePage() {

        MenuBarEnvironmentPOM envMenu = new MenuBarEnvironmentPOM(driver);

        environmentPage(envMenu);
        envMenu.climate().click();

        assertTrue(driver, "environment/climate");

    }

}
