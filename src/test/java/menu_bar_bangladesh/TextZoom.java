package menu_bar_bangladesh;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;
import page_object_model.MenuBarBangladeshPOM;

public class TextZoom extends Politics {
    @Test
    public void textZoom() throws InterruptedException {

        MenuBarBangladeshPOM menuBd = new MenuBarBangladeshPOM(driver);

        politicsPage(menuBd);

        String anyNews = "https://en.prothomalo.com/bangladesh/politics/govt-statement-on-per-capita-income-a-deception-fakhrul";

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get(anyNews);
        Thread.sleep(1000);

        for (int i = 0; i < 5; i++) {
            menuBd.textZoom().click();
        }

        // Scroll
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0,600);");
        Thread.sleep(1000);

    }

}
