package menu_bar_opinion;

import org.testng.annotations.Test;
import page_object_model.MenuBarOpinionPOM;

public class Editorial extends Opinion {
    @Test
    public void editorialPage() {

        MenuBarOpinionPOM opMenu = new MenuBarOpinionPOM(driver);

        opinionPage(opMenu);
        opMenu.editorial().click();

        assertTrue(driver, "opinion/editorial");

    }

}
