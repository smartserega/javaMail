package flow;

import pages.mailPages.MailLoginPage;
import pages.mailPages.MailHomePage;
import pages.mailPages.MailUserPage;
import org.openqa.selenium.support.PageFactory;
import steps.Driver;

import java.io.IOException;

public class MailFlow {
    private static MailHomePage yandexHomePage = PageFactory.initElements(
            Driver.getDriver(), MailHomePage.class
    );

    private static MailUserPage yandexPicturesPage= PageFactory.initElements(
            Driver.getDriver(), MailUserPage.class
    );

    private static MailLoginPage downLoadPicturePage= PageFactory.initElements(
            Driver.getDriver(), MailLoginPage.class
    );

    public static void openServicesLink(String link) {
        yandexHomePage.ensurePageOpen();
        yandexHomePage.openServicesLink(link);
    }

    public static void downloadPicture(String path) throws IOException {
        yandexPicturesPage.ensurePageLoaded();
        yandexPicturesPage.clickOnDownloadButton();
        downLoadPicturePage.ensurePageOpen();
        downLoadPicturePage.downloadFile(path);
    }

    public static void verifyPictureIs(String pictureName, String state) {
        yandexPicturesPage.verifyPictureIs(pictureName, state);
    }
}
