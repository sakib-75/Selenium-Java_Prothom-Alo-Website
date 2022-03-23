package page_object_model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SigninSignup_POM {

    WebDriver driver;
    public SigninSignup_POM(WebDriver driver) {
        this.driver = driver;
    }

    By homeLoginBtn = By.xpath("(//button[@class='desktop-btn btn button-m__type4__3WG12'])[1]");
    By loginBtn = By.xpath("(//button[@class='button button-m__type3__3Bn4T'])[1]");
    By createAccountLink = By.xpath("//a[normalize-space()='Create an account']");
    By registerBtn = By.xpath("(//button[@class='button button-m__type3__3Bn4T'])[1]");

    By facebookBtn = By.xpath("//a[@aria-label='FACEBOOK Button']");
    By googleBtn = By.xpath("//a[@aria-label='GOOGLE Button']");
    By gmailSigninInp = By.id("identifierId");
    By gmailSigninNext = By.xpath("(//div[@class='VfPpkd-Jh9lGc'])[3]");

    By nameInput = By.name("name");
    By emailInput = By.name("email");
    By passwordInput = By.name("password");
    By confirmPassword = By.name("confirmPassword");

    public WebElement homeLoginBtn() {
        return driver.findElement(homeLoginBtn);
    }

    public WebElement facebookBtn() {
        return driver.findElement(facebookBtn);
    }

    public WebElement googleBtn() {
        return driver.findElement(googleBtn);
    }

    public void setGmailSigninInp(String gmail){
        driver.findElement(gmailSigninInp).sendKeys(gmail);
    }

    public WebElement gmailSigninNext(){
        return driver.findElement(gmailSigninNext);
    }

    public void setName(String name) {
        driver.findElement(nameInput).sendKeys(name);
    }

    public void setEmail(String email) {
        driver.findElement(emailInput).sendKeys(email);
    }

    public void setPassword(String password) {
        driver.findElement(passwordInput).sendKeys(password);
    }

    public void setConfirmPassword(String cPassword) {
        driver.findElement(confirmPassword).sendKeys(cPassword);
    }

    public WebElement loginBtn() {
        return driver.findElement(loginBtn);
    }

    public WebElement createAccountLink() {
        return driver.findElement(createAccountLink);
    }

    public WebElement registerBtn() {
        return driver.findElement(registerBtn);
    }

}
