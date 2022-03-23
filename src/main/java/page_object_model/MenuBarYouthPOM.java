package page_object_model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenuBarYouthPOM extends MenuBarPOM {

    WebDriver driver;
    public MenuBarYouthPOM(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//a[@aria-label='Youth'])[2]")
    WebElement youth;

    @FindBy(xpath = "//a[normalize-space()='Education']")
    WebElement education;

    @FindBy(xpath = "//a[normalize-space()='Employment']")
    WebElement employment;

    public WebElement youth() {
        return youth;
    }

    public WebElement education() {
        return education;
    }

    public WebElement employment() {
        return employment;
    }

}
