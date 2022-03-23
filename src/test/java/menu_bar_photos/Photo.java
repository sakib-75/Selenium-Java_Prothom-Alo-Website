package menu_bar_photos;

import base.BaseDriver;
import page_object_model.MenuBarPhotosPOM;
import utilities.Utilities;

public class Photo extends BaseDriver implements Utilities {

    public void photoPage(MenuBarPhotosPOM photoMenu) {
        driver.get("https://en.prothomalo.com");
        implicitWait(driver);

        photoMenu.menuBar().click();
        photoMenu.photo().click();

    }

}
