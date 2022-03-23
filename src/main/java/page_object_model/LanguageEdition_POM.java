package page_object_model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LanguageEdition_POM {

    WebDriver driver;
    public LanguageEdition_POM(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(className = "dropdown-m__edition-label__1o4a-")
    WebElement editionDropdown;

    @FindBy(xpath = "(//a[@aria-label='বাংলা'])[1]")
    WebElement banglaEdition;

    @FindBy(xpath = "(//a[@aria-label='English'])[1]")
    WebElement englishEdition;

    @FindBy(xpath = "(//a[@aria-label='উত্তর আমেরিকা'])[1]")
    WebElement north_usaEdition;

    public WebElement editionDropdown() {
        return editionDropdown;
    }

    public WebElement banglaEdition() {
        return banglaEdition;
    }

    public WebElement englishEdition() {
        return englishEdition;
    }

    public WebElement north_usaEdition() {
        return north_usaEdition;
    }

}
