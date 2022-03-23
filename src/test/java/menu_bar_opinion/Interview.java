package menu_bar_opinion;

import org.testng.annotations.Test;
import page_object_model.MenuBarOpinionPOM;

public class Interview extends Opinion {
    @Test
    public void interviewPage() {

        MenuBarOpinionPOM opMenu = new MenuBarOpinionPOM(driver);

        opinionPage(opMenu);
        opMenu.interview().click();

        assertTrue(driver, "opinion/interview");

    }

}
