package page_object_model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenuBarBusinessPOM extends MenuBarPOM {

    WebDriver driver;
    public MenuBarBusinessPOM(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//a[@aria-label='Business'])[2]")
    WebElement business;

    @FindBy(xpath = "//a[normalize-space()='Local']")
    WebElement local;

    @FindBy(xpath = "//a[normalize-space()='Global']")
    WebElement global;

    public WebElement business() {
        return business;
    }

    public WebElement local() {
        return local;
    }

    public WebElement global() {
        return global;
    }

}
