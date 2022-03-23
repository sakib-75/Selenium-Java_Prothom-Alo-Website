package page_object_model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdvertisePOM {

    WebDriver driver;
    public AdvertisePOM(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "a[aria-label='Advertise']")
    WebElement advertise;

    @FindBy(xpath = "(//a[@class='download-btn roboto-content'])[1]")
    WebElement downloadRateCardBtn;

    @FindBy(xpath = "(//a[@class='download-btn roboto-content'])[2]")
    WebElement downloadMediaKitBtn;

    public WebElement advertise(){
        return advertise;
    }

    public WebElement downloadRateCardBtn(){
        return downloadRateCardBtn;
    }

    public WebElement downloadMediaKitBtn(){
        return downloadMediaKitBtn;
    }

}
