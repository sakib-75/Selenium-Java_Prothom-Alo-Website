package menu_bar_opinion;

import org.testng.annotations.Test;
import page_object_model.MenuBarOpinionPOM;

public class Analysis extends Opinion {
    @Test
    public void analysisPage() {

        MenuBarOpinionPOM opMenu = new MenuBarOpinionPOM(driver);

        opinionPage(opMenu);
        opMenu.analysis().click();

        assertTrue(driver, "opinion/analysis");

    }

}
