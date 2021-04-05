package pages.mailPages;

import pages.Page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import steps.Driver;

//yandex home page
public class MailHomePage extends Page {

    @FindBy(xpath = "//a[text() = 'Сделать стартовой']")
    public WebElement ensurePageLoadedElement;

    public void ensurePageOpen() {
        waitWhileElemIsVisible(ensurePageLoadedElement);
    }

    public void openServicesLink(String link) {
        WebElement linkElement = Driver.getDriver().findElement(By.xpath("//div[contains(@class , services-new__item-title)][text() = '"+link+"']"));
        linkElement.click();
    }
}
