package menu_bar_photos;

import org.testng.annotations.Test;
import page_object_model.MenuBarPhotosPOM;

public class International extends Photo {
    @Test
    public void internationalPhotoPage() {

        MenuBarPhotosPOM photo = new MenuBarPhotosPOM(driver);

        photoPage(photo);
        photo.internationalphoto().click();

        assertTrue(driver, "photo/international");

    }

}
