package page_object_model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenuBarInternationalPOM extends MenuBarPOM {

    WebDriver driver;
    public MenuBarInternationalPOM(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//a[@aria-label='International'])[2]")
    WebElement international;

    @FindBy(xpath = "//a[normalize-space()='Asia']")
    WebElement asia;

    @FindBy(xpath = "//a[normalize-space()='Europe']")
    WebElement europe;

    @FindBy(xpath = "//a[normalize-space()='Americas']")
    WebElement americas;

    public WebElement international() {
        return international;
    }

    public WebElement asia() {
        return asia;
    }

    public WebElement europe() {
        return europe;
    }

    public WebElement americas() {
        return americas;
    }

}
