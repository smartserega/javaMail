package pages.mailPages;

import pages.Page;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MailLoginPage extends Page {

    @FindBy(name = "username")
    public WebElement ensurePageLoadedElement;
    
    @FindBy(name = "username")
    public WebElement loginField;

    @FindBy(xpath = "//span[text() = 'Ввести пароль']")
    public WebElement confirmLoginButton;

    @FindBy(name = "password")
    public WebElement passwordField;

    @FindBy(xpath = "//button[@data-test-id = 'submit-button']")
    public WebElement confirmPasswordButton;

    public void ensurePageOpen() {
        waitForLoad();
        waitWhileElemIsVisible(ensurePageLoadedElement);
    }


    public void set(String login) {
        loginField.sendKeys(login);
    }

    public void confirmLogin() {
        confirmLoginButton.click();
    }

    public void setPassword(String password) {
        waitWhileElemIsVisible(passwordField);
        passwordField.sendKeys(password);
    }

    public void confirmPassword() {
        confirmPasswordButton.click();
    }
}
