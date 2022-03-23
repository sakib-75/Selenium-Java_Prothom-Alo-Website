package page_object_model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenuBarEnvironmentPOM extends MenuBarPOM {

    WebDriver driver;
    public MenuBarEnvironmentPOM(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//a[normalize-space()='Environment'])[1]")
    WebElement environment;

    @FindBy(xpath = "//a[normalize-space()='Climate']")
    WebElement climate;

    @FindBy(xpath = "//a[normalize-space()='Pollution']")
    WebElement pollution;

    public WebElement environment() {
        return environment;
    }

    public WebElement climate() {
        return climate;
    }

    public WebElement pollution() {
        return pollution;
    }

}
