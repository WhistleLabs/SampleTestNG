package test;

import common.CommonTestManager;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.*;

public class EditPetTest extends CommonTestManager {

	@BeforeMethod
	public void pageObject() {
		loginPage = new LoginPage();
		activityPage = new ActivityPage();
		petPage = new PetPage();
		editProfilePage = new EditProfilePage();
		humanStuffPage = new HumanStuffPage();
		accountInformationPage = new AccountInformationPage();
	}

	@Test
	public void testEditPetVerifyPetNameAndLogout() {
		loginPage.clickLogin();
		activityPage.clickPetOption();
		petPage.clickEdit();
		editProfilePage.verifyPetName();
		editProfilePage.clickBackButton();
		petPage.clickHumanOption();
		humanStuffPage.clickAccountInformation();
		accountInformationPage.logoutFromApp();

	}

	@AfterMethod
	public void logout(ITestResult result) {
		if (ITestResult.FAILURE == result.getStatus()) {

			// to have a look at the behavoir of the application if it is present or closed
			petPage.clickHumanOption();
			humanStuffPage.clickAccountInformation();
			accountInformationPage.logoutFromApp();
			// launch app if the application closes.
			// navigate to the logout option and tap on it
		}
	}
}
