package testcases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import pages.DarazHomePage;
import pages.DarazLoginPage;
import utilities.BaseDriverSetup;

public class DarazLoginPageTest extends BaseDriverSetup{
	DarazHomePage darazHomePage = new DarazHomePage();
	DarazLoginPage darazLoginPage = new DarazLoginPage();
	
	
	@Test
	public void testLoginwithInvalidPhoneNumber() {
		getDriver().get(darazHomePage.HOMEPAGE_URL);
		darazHomePage.clickOnElement(darazHomePage.SIGNUP_LOGIN_BUTTON);
		darazLoginPage.wirteTex(darazLoginPage.PHONE_EMAIL_INPUT_FIELD, "0111111111");
		darazLoginPage.wirteTex(darazLoginPage.PASSWORD_INPUT_FIELD, "password");
		darazLoginPage.clickOnElement(darazLoginPage.LOGIN_BUTTON);
		assertEquals(darazLoginPage.getElement(darazLoginPage.ERROR_MESSAGE).getText(), "Please enter a valid phone number.");  
	}
}
