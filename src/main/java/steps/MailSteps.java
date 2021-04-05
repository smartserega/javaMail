package steps;

import flow.MailFlow;
import pages.Navigation;

public class MailSteps {

    public static void openLoginPage(String url) {
        Navigation.navigateToUrl(url);
    }

    public static void login(String login, String password) {
        MailFlow.login(login, password);
        MailFlow.checkThatLoginComplete(login);
    }

    public static void sendMail(String header, String text, String forWhomEmail) {
        MailFlow.clickOnSendMail();
        MailFlow.fillMailFields(forWhomEmail,header,text);
        MailFlow.checkNotificationMessageSent();
    }

    public static void logout() {
        MailFlow.logout();
    }

    public static void checkReceivingEmail(String text, String content) {
        MailFlow.checkReceivingEmail(text, content);
    }

}
