package menu_bar_bangladesh;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import page_object_model.MenuBarBangladeshPOM;

import java.time.Duration;

public class ShareOnTwitter extends Politics {
    @Test
    public void shareOnTwitter() throws InterruptedException {

        MenuBarBangladeshPOM menuBd = new MenuBarBangladeshPOM(driver);

        politicsPage(menuBd);

        String anyNews = "https://en.prothomalo.com/bangladesh/politics/govt-statement-on-per-capita-income-a-deception-fakhrul";

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get(anyNews);
        Thread.sleep(1000);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(menuBd.twitterShare())).click();

    }

}
