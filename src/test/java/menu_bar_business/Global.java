package menu_bar_business;

import org.testng.annotations.Test;
import page_object_model.MenuBarBusinessPOM;

public class Global extends Business{
    @Test
    public void globalBusinessPage() {

        MenuBarBusinessPOM bMenu = new MenuBarBusinessPOM(driver);

        businessPage(bMenu);
        bMenu.global().click();

        assertTrue(driver, "business/global");

    }

}
