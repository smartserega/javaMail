package flow;

import pages.Navigation;
import pages.mailPages.MailCreateMessagePage;
import pages.mailPages.MailLoginPage;
import pages.mailPages.MailHomePage;
import pages.mailPages.MailUserPage;
import org.openqa.selenium.support.PageFactory;
import common.Driver;

public class MailFlow {
    private static MailHomePage mailHomePage = PageFactory.initElements(
            Driver.getDriver(), MailHomePage.class
    );

    private static MailUserPage mailUserPage= PageFactory.initElements(
            Driver.getDriver(), MailUserPage.class
    );

    private static MailLoginPage mailLoginPage= PageFactory.initElements(
            Driver.getDriver(), MailLoginPage.class
    );

    private static MailCreateMessagePage mailCreateMessagePage= PageFactory.initElements(
            Driver.getDriver(), MailCreateMessagePage.class
    );

    public static void login(String login, String password) {
        mailHomePage.ensurePageLoaded();
        mailHomePage.clickOnLoginButton();
        Navigation.changeIFrame(2);
        mailLoginPage.ensurePageOpen();
        mailLoginPage.set(login);
        mailLoginPage.confirmLogin();
        mailLoginPage.setPassword(password);
        mailLoginPage.confirmPassword();

    }

    public static void checkThatLoginComplete(String login) {
        mailUserPage.ensurePageLoaded();
        mailUserPage.checkThatLoginComplete(login);
    }

    public static void clickOnSendMail() {
        mailUserPage.ensurePageLoaded();
        mailUserPage.clickOnCreateEmail();
    }

    public static void fillMailFields(String forWhomEmail, String header, String text) {
        mailCreateMessagePage.ensurePageLoaded();
        mailCreateMessagePage.fillEmail(forWhomEmail);
        mailCreateMessagePage.fillHeader(header);
        mailCreateMessagePage.fillText(text);
        mailCreateMessagePage.clickOnSendButton();
    }

    public static void checkNotificationMessageSent() {
        mailCreateMessagePage.checkNotificationMessageSent();
    }

    public static void logout() {
        mailCreateMessagePage.logout();
    }

    public static void checkReceivingEmail(String text, String content) {
        mailUserPage.ensurePageLoaded();
        mailUserPage.checkReceivingEmail(text,content);
    }
}
