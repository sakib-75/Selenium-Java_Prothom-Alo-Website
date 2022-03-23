package menu_bar_science_tech;

import org.testng.annotations.Test;
import page_object_model.MenuBarScienceTechPOM;

public class SocialMedia extends ScienceTech {
    @Test
    public void socialMediaPage() {

        MenuBarScienceTechPOM scTech = new MenuBarScienceTechPOM(driver);

        scienceTechPage(scTech);
        scTech.socialMedia().click();

        assertTrue(driver, "science-technology/social-media");

    }

}
