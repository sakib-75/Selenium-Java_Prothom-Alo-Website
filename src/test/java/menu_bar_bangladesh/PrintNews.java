package menu_bar_bangladesh;

import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;
import page_object_model.MenuBarBangladeshPOM;

public class PrintNews extends Politics {
    @Test
    public void printNews() throws InterruptedException {

        MenuBarBangladeshPOM menuBd = new MenuBarBangladeshPOM(driver);

        politicsPage(menuBd);

        String anyNews = "https://en.prothomalo.com/bangladesh/politics/govt-statement-on-per-capita-income-a-deception-fakhrul";

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get(anyNews);
        Thread.sleep(1000);

        menuBd.printNews().click();
    }

}
