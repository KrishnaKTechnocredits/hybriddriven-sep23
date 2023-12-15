package testscripts;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import base.ControlActions;
import pages.LoginPage;

public class TestBase {

	LoginPage loginPage;
	static int count = 1;

	@BeforeMethod
	public void setup() {
		ControlActions.launchBrowser();
		loginPage = new LoginPage();
	}
	
	@AfterMethod
	public void tearDown(ITestResult result) {
		System.out.println("--------------" + result.getStatus());
		if(ITestResult.FAILURE == result.getStatus())
			ControlActions.takeScreenshot(result.getName() + "_"+ count++);
		ControlActions.closeBrowser();
	}
	
	void login() {
		loginPage.login("harshhpatel07@gmail.com", "Hhv@123456");
		boolean loginFlag = loginPage.isLoginSuccessFullyDisplayed();
		Assert.assertTrue(loginFlag);
	}
}
