package tests;

import common.Application;
import org.testng.annotations.Test;
import steps.MailSteps;

public class mailTest {


    @Test
    public void loginSuccess() {
        MailSteps.openLoginPage(Application.getProperty("url"));
//        MailSteps.login(Application.getProperty("login1"), Application.getProperty("password1"));
//        MailSteps.sendMail("Тест", "Тест отправки");
//        MailSteps.logout();
//        MailSteps.login(Application.getProperty("login2"), Application.getProperty("password2"));
//        MailSteps.checkRecievungEmail("Тест", "Тест отправки");
    }
}
