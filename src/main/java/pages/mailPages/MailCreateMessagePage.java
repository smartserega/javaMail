package pages.mailPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.Page;

public class MailCreateMessagePage extends Page {


    @FindBy(xpath = "//div[contains(@class , 'contactsContainer')]//input")
    public WebElement ensurePageLoaded;

    @FindBy(xpath = "//div[contains(@class , 'contactsContainer')]//input")
    public WebElement emailField;

    @FindBy(xpath = "//div[contains(@class , 'subject__wrapper')]//input")
    public WebElement headerField;

    @FindBy(xpath = "//div[contains(@class , 'editable-container')]/div[1]/div[1]")
    public WebElement textField;
    
    @FindBy(xpath = "//a[text() =  'Письмо отправлено']")
    public WebElement notification;

    @FindBy(xpath = "//a[@id = 'PH_logoutLink']")
    public WebElement logoutButton;

    @FindBy(xpath = "//span[text() = 'Отправить']")
    public WebElement sendButton;

    public void ensurePageLoaded() {
        waitWhileElemIsVisible(ensurePageLoaded);
    }

    public void fillEmail(String forWhomEmail) {
        emailField.sendKeys(forWhomEmail);
    }

    public void fillHeader(String header) {
        headerField.sendKeys(header);
    }

    public void fillText(String text) {
        textField.sendKeys(text);
    }

    public void checkNotificationMessageSent() {
        waitWhileElemIsVisible(notification);
    }

    public void logout() {
        logoutButton.click();
    }

    public void clickOnSendButton() {
        waitWhileElemIsVisible(sendButton);
        sendButton.click();
    }
}
