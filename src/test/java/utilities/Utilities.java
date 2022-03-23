package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import java.time.Duration;
import java.util.ArrayList;

public interface Utilities {

    default void implicitWait(WebDriver driver) {
        // Implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    default void assertTrue(WebDriver driver, String expectedUrl) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String currentUrl = driver.getCurrentUrl();
        boolean condition = currentUrl.contains(expectedUrl);

        System.out.println("Current URL: " + currentUrl);
        System.out.println("Expected URL: " + expectedUrl);

        if (condition) {
            System.out.println("Passed...! Expected URL contains in Current URL");
        } else {
            System.out.println("Current URL does not contain expected URL");
        }
        // Assertions
        Assert.assertTrue(condition);
    }

    default void removeAD(WebDriver driver) {
        // AD type 1
        try {
            String framePath = "(//iframe[@id='google_ads_iframe_85406138/home_Int_660x440_0'])[1]";
            WebElement frame = driver.findElement(By.xpath(framePath));

            driver.switchTo().frame(frame);
            driver.findElement(By.xpath("//*[@id=\"paloash_richmedia_close\"]")).click();
            driver.switchTo().defaultContent();

        } catch (Exception e) {
            System.out.println("No pop-up AD");
        }

    }

    default void removeAD2(WebDriver driver) {
        // AD type 2
        try {
            String framePath = "(//iframe[@id='google_ads_iframe_85406138/News_Int_660x440_0'])[1]";
            WebElement frame = driver.findElement(By.xpath(framePath));

            driver.switchTo().frame(frame);
            driver.findElement(By.xpath("//*[@id=\"closebutton\"]/img")).click();
            driver.switchTo().defaultContent();
        }
        catch (Exception e){
            System.out.println("No pop-up AD");
        }

    }

    default void removeFooterAD(WebDriver driver) {
        try {
            WebElement closeAD = driver.findElement(By.xpath("(//div[@title='close'])[1]"));
            closeAD.click();

        } catch (Exception e) {
            System.out.println("No footer AD found!");
        }
    }

    default void acceptPrivacyPolicy(WebDriver driver) {
        try {
            WebElement privacyPolicy = driver.findElement(By.id("rcc-confirm-button"));
            privacyPolicy.click();

        } catch (Exception e) {
            System.out.println("Privacy policy not found!");
        }
    }

    default void switchTab(WebDriver driver, int tabNo){
        ArrayList<String> newTab = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(newTab.get(tabNo));
    }

    default void scrollToBottom(WebDriver driver){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
    }

}
