package menu_bar_science_tech;

import org.testng.annotations.Test;
import page_object_model.MenuBarScienceTechPOM;

public class IT extends ScienceTech {
    @Test
    public void itPage() {

        MenuBarScienceTechPOM scTech = new MenuBarScienceTechPOM(driver);

        scienceTechPage(scTech);
        scTech.it().click();

        assertTrue(driver, "science-technology/it");

    }

}
