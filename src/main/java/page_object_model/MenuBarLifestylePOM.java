package page_object_model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenuBarLifestylePOM extends MenuBarPOM {

    WebDriver driver;
    public MenuBarLifestylePOM(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//a[@aria-label='Lifestyle'])[2]")
    WebElement lifestyle;

    @FindBy(xpath = "//a[normalize-space()='Fashion']")
    WebElement fashion;

    @FindBy(xpath = "//a[normalize-space()='Well-being']")
    WebElement wellBeing;

    @FindBy(xpath = "//a[normalize-space()='Travel']")
    WebElement travel;

    public WebElement lifestyle() {
        return lifestyle;
    }

    public WebElement fashion() {
        return fashion;
    }

    public WebElement wellBeing() {
        return wellBeing;
    }

    public WebElement travel() {
        return travel;
    }

}
