package page_object_model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenuBarBangladeshPOM extends MenuBarPOM{

    WebDriver driver;
    public MenuBarBangladeshPOM(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//a[@aria-label='Bangladesh'])[2]")
    WebElement bangladesh;

    @FindBy(xpath = "(//a[normalize-space()='Politics'])[1]")
    WebElement politics;

    @FindBy(xpath = "(//*[name()='svg'][contains(@class,'facebook-icon')])[1]")
    WebElement facebookShare;

    @FindBy(xpath = "(//*[name()='svg'][@class='twitter'])[1]")
    WebElement twitterShare;

    @FindBy(xpath = "(//*[name()='svg'][@class='share'])[1]")
    WebElement shareAll;

    @FindBy(xpath = "(//*[name()='svg'][@id='Layer_1'])[1]")
    WebElement textZoom;

    @FindBy(xpath = "(//*[name()='svg'])[9]")
    WebElement textZoomOut;

    @FindBy(xpath = "(//*[name()='svg'])[10]")
    WebElement printNews;

    @FindBy(xpath = "(//a[contains(text(),'Accident')])[1]")
    WebElement accident;

    @FindBy(xpath = "(//a[normalize-space()='Good Day'])[1]")
    WebElement goodDay;

    @FindBy(xpath = "(//a[normalize-space()='Crime'])[1]")
    WebElement crime;

    @FindBy(xpath = "(//a[normalize-space()='Government'])[1]")
    WebElement government;

    public WebElement bangladesh() {
        return bangladesh;
    }

    public WebElement politics() {
        return politics;
    }

    public WebElement facebookShare() {
        return facebookShare;
    }

    public WebElement twitterShare() {
        return twitterShare;
    }

    public WebElement shareAll() {
        return shareAll;
    }

    public WebElement textZoom() {
        return textZoom;
    }

    public WebElement textZoomOut() {
        return textZoomOut;
    }

    public WebElement printNews() {
        return printNews;
    }

    public WebElement accident() {
        return accident;
    }

    public WebElement goodDay() {
        return goodDay;
    }

    public WebElement crime() {
        return crime;
    }

    public WebElement government() {
        return government;
    }

}
