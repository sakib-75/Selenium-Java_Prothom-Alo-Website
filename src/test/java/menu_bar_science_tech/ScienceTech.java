package menu_bar_science_tech;

import base.BaseDriver;
import page_object_model.MenuBarScienceTechPOM;
import utilities.Utilities;

public class ScienceTech extends BaseDriver implements Utilities {

    public void scienceTechPage(MenuBarScienceTechPOM scTech) {
        driver.get("https://en.prothomalo.com");
        implicitWait(driver);

        scTech.menuBar().click();
        scTech.scienceTech().click();

    }

}
