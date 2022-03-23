package page_object_model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FollowUsPOM {

    WebDriver driver;
    public FollowUsPOM(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//a[@aria-label='Prothom Alo Facebook Link'])[1]")
    WebElement facebookLink;

    @FindBy(xpath = "(//a[@aria-label='Prothom Alo Twitter Link'])[1]")
    WebElement twitterLink;

    @FindBy(xpath = "(//a[@aria-label='Prothom Alo Instagram Link'])[1]")
    WebElement instragramLink;

    @FindBy(xpath = "(//a[@aria-label='Prothom Alo Youtube Link'])[1]")
    WebElement youtubeLink;

    public WebElement facebookLink() {
        return facebookLink;
    }

    public WebElement twitterLink() {
        return twitterLink;
    }

    public WebElement instragramLink() {
        return instragramLink;
    }

    public WebElement youtubeLink() {
        return youtubeLink;
    }

}
