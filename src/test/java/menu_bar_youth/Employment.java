package menu_bar_youth;

import org.testng.annotations.Test;
import page_object_model.MenuBarYouthPOM;

public class Employment extends Youth {
    @Test
    public void employmentPage() {

        MenuBarYouthPOM ythMenu = new MenuBarYouthPOM(driver);

        youthPage(ythMenu);
        ythMenu.employment().click();

        assertTrue(driver, "youth/employment");

    }

}
