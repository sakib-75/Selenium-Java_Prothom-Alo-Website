package page_object_model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenuBarScienceTechPOM extends MenuBarPOM {

    WebDriver driver;
    public MenuBarScienceTechPOM(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[normalize-space()='Science & Technology']")
    WebElement scienceTech;

    @FindBy(xpath = "//a[normalize-space()='Gadgets']")
    WebElement gadgets;

    @FindBy(xpath = "//a[normalize-space()='Social Media']")
    WebElement socialMedia;

    @FindBy(xpath = "//a[normalize-space()='IT']")
    WebElement it;

    public WebElement scienceTech() {
        return scienceTech;
    }

    public WebElement gadgets() {
        return gadgets;
    }

    public WebElement socialMedia() {
        return socialMedia;
    }

    public WebElement it() {
        return it;
    }

}
