package menu_bar_photos;

import org.testng.annotations.Test;
import page_object_model.MenuBarPhotosPOM;

public class Sports extends Photo {
    @Test
    public void sportsPhotoPage() {

        MenuBarPhotosPOM photo = new MenuBarPhotosPOM(driver);

        photoPage(photo);
        photo.sportsPhoto().click();

        assertTrue(driver, "photo/sports");

    }

}
