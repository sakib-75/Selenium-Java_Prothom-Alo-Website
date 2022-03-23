package page_object_model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenuBarSportsPOM extends MenuBarPOM{

    WebDriver driver;
    public MenuBarSportsPOM(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//a[@aria-label='Sports'])[2]")
    WebElement sports;

    @FindBy(xpath = "//a[normalize-space()='Cricket']")
    WebElement cricket;

    @FindBy(xpath = "//a[normalize-space()='Football']")
    WebElement football;

    @FindBy(xpath = "//a[normalize-space()='Local sports']")
    WebElement localSports;

    public WebElement sports() {
        return sports;
    }

    public WebElement cricket() {
        return cricket;
    }

    public WebElement football() {
        return football;
    }

    public WebElement localSports() {
        return localSports;
    }

}
