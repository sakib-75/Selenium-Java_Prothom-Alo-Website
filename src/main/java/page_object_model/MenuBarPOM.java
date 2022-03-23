package page_object_model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenuBarPOM {

    WebDriver driver;
    public MenuBarPOM(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//div[contains(@class,'hamburger hamburger-m__hamburger__2Oc5s')])[1]")
    WebElement menuBar;

    public WebElement menuBar() {
        return menuBar;
    }

}
