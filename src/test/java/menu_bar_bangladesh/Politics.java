package menu_bar_bangladesh;

import page_object_model.MenuBarBangladeshPOM;

public class Politics extends Bangladesh {

    public void politicsPage(MenuBarBangladeshPOM menuBd) {
        bangladeshPage(menuBd);
        menuBd.politics().click();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
