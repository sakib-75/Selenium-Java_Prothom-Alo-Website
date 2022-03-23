package menu_bar_science_tech;

import org.testng.annotations.Test;
import page_object_model.MenuBarScienceTechPOM;

public class Gadgets extends ScienceTech {
    @Test
    public void gadgetsPage() {

        MenuBarScienceTechPOM scTech = new MenuBarScienceTechPOM(driver);

        scienceTechPage(scTech);
        scTech.gadgets().click();

        assertTrue(driver, "science-technology/gadgets");

    }

}
