package page_object_model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenuBarCorporatePOM extends MenuBarPOM {

    WebDriver driver;
    public MenuBarCorporatePOM(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//a[normalize-space()='Corporate'])[1]")
    WebElement corporate;

    @FindBy(xpath = "//a[normalize-space()='Local']")
    WebElement local;

    @FindBy(xpath = "//a[normalize-space()='Global']")
    WebElement global;

    public WebElement corporate() {
        return corporate;
    }

    public WebElement local() {
        return local;
    }

    public WebElement global() {
        return global;
    }

}
