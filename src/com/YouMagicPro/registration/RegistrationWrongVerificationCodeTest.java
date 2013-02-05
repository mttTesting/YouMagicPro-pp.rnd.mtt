package com.YouMagicPro.registration;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;

public class RegistrationWrongVerificationCodeTest extends TestBaseReg{
	@Test
	public void  registrationStabilityOfNumbersTest() throws Exception {
		open();
		selenium.click("//li[4]/a");
		selenium.waitForPageToLoad("30000");
		selenium.click("css=span[name=\"abc-numbers\"]");
		selenium.click("//label/input");
		selenium.click("id=edit-next");
		selenium.waitForPageToLoad("30000");
		selenium.type("id=edit-personal-phone", "79857297409");
		selenium.click("//div[2]/div/div[2]/a");
		Thread.sleep(2000);
		selenium.type("name=smscode", "12212");
		selenium.click("css=span.phone_confirm_text.conf_text");
		Thread.sleep(2000);
		AssertJUnit.assertTrue(selenium.isTextPresent("Неправильный код подтверждения"));
	}
}
