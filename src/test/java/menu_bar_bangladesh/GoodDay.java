package menu_bar_bangladesh;

import org.testng.annotations.Test;
import page_object_model.MenuBarBangladeshPOM;

public class GoodDay extends Bangladesh {
    @Test
    public void goodDayPage() {

        MenuBarBangladeshPOM menuBd = new MenuBarBangladeshPOM(driver);

        bangladeshPage(menuBd);
        menuBd.goodDay().click();

        assertTrue(driver, "bangladesh/good-day");

    }
    
}
