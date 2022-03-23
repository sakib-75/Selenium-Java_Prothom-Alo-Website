package menu_bar_youth;

import org.testng.annotations.Test;
import page_object_model.MenuBarYouthPOM;

public class Education extends Youth {
    @Test
    public void educationPage() {

        MenuBarYouthPOM ythMenu = new MenuBarYouthPOM(driver);

        youthPage(ythMenu);
        ythMenu.education().click();

        assertTrue(driver, "youth/education");

    }

}
