package menu_bar_environment;

import base.BaseDriver;
import page_object_model.MenuBarEnvironmentPOM;
import utilities.Utilities;

public class Environment extends BaseDriver implements Utilities {

    public void environmentPage(MenuBarEnvironmentPOM envMenu) {
        driver.get("https://en.prothomalo.com");
        implicitWait(driver);

        envMenu.menuBar().click();
        envMenu.environment().click();

    }

}
