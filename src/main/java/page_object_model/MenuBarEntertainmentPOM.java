package page_object_model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenuBarEntertainmentPOM extends MenuBarPOM {

    WebDriver driver;
    public MenuBarEntertainmentPOM(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//a[@aria-label='Entertainment'])[2]")
    WebElement entertainment;

    @FindBy(xpath = "//a[normalize-space()='Dhallywood']")
    WebElement dhallywood;

    @FindBy(xpath = "//a[normalize-space()='Bollywood']")
    WebElement bollywood;

    @FindBy(xpath = "//a[normalize-space()='Hollywood']")
    WebElement hollywood;

    public WebElement entertainment() {
        return entertainment;
    }

    public WebElement dhallywood() {
        return dhallywood;
    }

    public WebElement bollywood() {
        return bollywood;
    }

    public WebElement hollywood() {
        return hollywood;
    }

}
