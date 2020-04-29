package test;

import common.CommonTestManager;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.*;

public class CheckPushNotificationsTest extends CommonTestManager {


    @BeforeMethod
    public void pageObject() {
        loginPage = new LoginPage();
        activityPage = new ActivityPage();
        humanStuffPage = new HumanStuffPage();
        setupPage=new SetupPage();
        petPage=new PetPage();
        accountInformationPage = new AccountInformationPage();
        pushNotificationPage=new PushNotificationPage();
    }

    @Test
    public void testCheckPushNotifications() {
        loginPage.clickLogin();
        activityPage.clickHumanOption();
        humanStuffPage.clickPushNotification();
        pushNotificationPage.clickCheckBoxes();
        pushNotificationPage.clickBackButton();
        petPage.clickHumanOption();
        humanStuffPage.clickAccountInformation();
        accountInformationPage.logoutFromApp();
    }
}
