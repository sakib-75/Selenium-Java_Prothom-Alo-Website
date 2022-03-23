package menu_bar_photos;

import org.testng.annotations.Test;
import page_object_model.MenuBarPhotosPOM;

public class Lifestyle extends Photo {
    @Test
    public void lifestylePhotoPage() {

        MenuBarPhotosPOM photo = new MenuBarPhotosPOM(driver);

        photoPage(photo);
        photo.lifestylePhoto().click();

        assertTrue(driver, "photo/lifestyle");

    }

}
