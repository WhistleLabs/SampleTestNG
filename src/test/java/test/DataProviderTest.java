package test;

import common.CommonTestManager;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

//import org.testng.Assert;

public class DataProviderTest {
	String sEmailAddress;
	String sPassword;


	@DataProvider(name = "LoginDetail")

	public static Object[][] credentials() {
		return new Object[][]{{"h@a.com", "test1234"}, {"h@a2.com", "test1234"}};

	}

	@Test(description="FoodPortionCalculatorTest", groups = {"Regression"}, dataProvider = "LoginDetail")
	public void testDataProvider(String sEmailAddress,String sPassword) throws InterruptedException {
			System.out.println("Email : "+sEmailAddress);
			System.out.println("Password: "+sPassword);
	}
}
