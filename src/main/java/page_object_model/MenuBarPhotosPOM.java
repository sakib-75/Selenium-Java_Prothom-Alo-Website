package page_object_model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenuBarPhotosPOM extends MenuBarPOM {

    WebDriver driver;
    public MenuBarPhotosPOM(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//a[normalize-space()='Photo'])[1]")
    WebElement photo;

    @FindBy(xpath = "//body/div[1]/div[8]/div[1]/div[1]/ul[1]/li[1]/a[1]")
    WebElement bangladeshPhoto;

    @FindBy(xpath = "//body/div[1]/div[8]/div[1]/div[1]/ul[1]/li[2]/a[1]")
    WebElement internationalphoto;

    @FindBy(xpath = "//body/div[1]/div[8]/div[1]/div[1]/ul[1]/li[3]/a[1]")
    WebElement sportsPhoto;

    @FindBy(xpath = "//body/div[1]/div[8]/div[1]/div[1]/ul[1]/li[4]/a[1]")
    WebElement lifestylePhoto;

    public WebElement photo() {
        return photo;
    }

    public WebElement bangladeshPhoto() {
        return bangladeshPhoto;
    }

    public WebElement internationalphoto() {
        return internationalphoto;
    }

    public WebElement sportsPhoto() {
        return sportsPhoto;
    }

    public WebElement lifestylePhoto() {
        return lifestylePhoto;
    }


}
