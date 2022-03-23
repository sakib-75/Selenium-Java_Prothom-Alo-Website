package page_object_model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenuBarOpinionPOM extends MenuBarPOM {

    WebDriver driver;
    public MenuBarOpinionPOM(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//a[@aria-label='Opinion'])[2]")
    WebElement opinion;

    @FindBy(xpath = "//a[normalize-space()='Editorial']")
    WebElement editorial;

    @FindBy(xpath = "//a[normalize-space()='Interview']")
    WebElement interview;

    @FindBy(xpath = "//a[normalize-space()='Analysis']")
    WebElement analysis;

    public WebElement opinion() {
        return opinion;
    }

    public WebElement editorial() {
        return editorial;
    }

    public WebElement interview() {
        return interview;
    }

    public WebElement analysis() {
        return analysis;
    }

}
