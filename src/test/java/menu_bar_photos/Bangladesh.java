package menu_bar_photos;

import org.testng.annotations.Test;
import page_object_model.MenuBarPhotosPOM;

public class Bangladesh extends Photo {
    @Test
    public void bangladeshPhotoPage() {

        MenuBarPhotosPOM photo = new MenuBarPhotosPOM(driver);

        photoPage(photo);
        photo.bangladeshPhoto().click();

        assertTrue(driver, "photo/bangladesh");

    }

}
