package base;

import java.time.Duration;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseDriver {

    public static WebDriver driver;
    public static Actions actions;

    @BeforeSuite
    public void setup() {

        // Disable notification
        ChromeOptions option = new ChromeOptions();
        option.addArguments("--disable-notifications");

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(option);

        driver.manage().window().maximize();
        // Create actions object
        actions = new Actions(driver);

    }

    @AfterSuite
    public void endSession() {
        driver.quit();
    }

}
