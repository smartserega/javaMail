package tests;

import common.Application;
import models.ModelsParser;
import models.UserModel;
import org.testng.annotations.Test;
import pages.Navigation;
import steps.Driver;
import steps.MailSteps;

import java.io.IOException;

public class mailTest extends Driver {

    @Test
    public void sendMail() throws IOException {
        UserModel userModel = ModelsParser.jsonParsingUser(Navigation.getAbsolutePath("userData.json"));
        MailSteps.openLoginPage(Application.getProperty("url"));
        MailSteps.login(userModel.getLogin1(), userModel.getPassword1());
        MailSteps.sendMail(userModel.getText(), userModel.getContent(), userModel.getForWhomEmail());
        MailSteps.logout();
        MailSteps.login(userModel.getLogin2(), userModel.getPassword2());
        MailSteps.checkReceivingEmail(userModel.getText(), userModel.getContent());
    }
}
