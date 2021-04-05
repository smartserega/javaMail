package pages.mailPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.Page;

public class MailHomePage extends Page {

    @FindBy(id = "search:submit")
    public WebElement ensurePageLoadedElement;

    @FindBy(xpath = "//button[contains(@class , 'login')]")
    public WebElement loginButton;

    public void ensurePageLoaded() {
        waitForLoad();
        waitWhileElemIsVisible(ensurePageLoadedElement);
    }

    public void clickOnLoginButton() {
        loginButton.click();
    }
}
