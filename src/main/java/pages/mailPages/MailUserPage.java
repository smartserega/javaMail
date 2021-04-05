package pages.mailPages;

import org.testng.Assert;
import pages.Page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import steps.Driver;

public class MailUserPage extends Page {

    @FindBy(xpath = "//i[@id= 'PH_user-email']")
    public WebElement ensurePageLoaded;

    @FindBy(xpath = "//span[contains(@class , 'compose-button__wrapper')]/span")
    public WebElement createEmailButton;

    @FindBy(xpath = "//div[@class = 'dataset__items']")
    public WebElement messagesField;

    public void ensurePageLoaded() {
        waitWhileElemIsVisible(ensurePageLoaded);
    }

    public void checkThatLoginComplete(String login) {
        WebElement element = Driver.getDriver().findElement(By.xpath("//i[@id= 'PH_user-email'][text() = '"+login+ "@mail.ru']"));
        waitWhileElemIsVisible(element);
    }

    public void clickOnCreateEmail() {
        waitWhileElemIsVisible(createEmailButton);
        createEmailButton.click();
    }

    public void checkReceivingEmail(String text, String content) {
        waitWhileElemIsVisible(messagesField);
        waitWhileElemIsVisible(Driver.getDriver().findElement(By.xpath("//span[contains(@class, 'normal')][text() = '"+text+"']")));
        String textContent = getText(Driver.getDriver().findElement(By.xpath("//div[@class = 'dataset__items']/a[1]//div[@class = 'llc__item llc__item_title']")));
        Assert.assertTrue(textContent.contains(content));
    }
}
