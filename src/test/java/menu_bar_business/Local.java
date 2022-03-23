package menu_bar_business;

import org.testng.annotations.Test;
import page_object_model.MenuBarBusinessPOM;

public class Local extends Business {
    @Test
    public void localBusinessPage() {

        MenuBarBusinessPOM bMenu = new MenuBarBusinessPOM(driver);

        businessPage(bMenu);
        bMenu.local().click();

        assertTrue(driver, "business/local");

    }

}
