package test;

import common.CommonTestManager;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.*;

public class AddAWhistleForExistingTest extends CommonTestManager {



    @BeforeMethod
    public void pageObject() {
        loginPage = new LoginPage();
        activityPage = new ActivityPage();
        humanStuffPage = new HumanStuffPage();
        setupPage=new SetupPage();
        petPage=new PetPage();
        accountInformationPage = new AccountInformationPage();
    }

    @Test
    public void testAddAWhistleForExistingUser() {
        loginPage.clickLogin();
        activityPage.clickHumanOption();
        humanStuffPage.clickAddWhistle();
        setupPage.selectDevice();

        //Logout
        petPage.clickHumanOption();
        humanStuffPage.clickAccountInformation();
        accountInformationPage.logoutFromApp();

    }
}
