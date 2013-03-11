package com.YouMagicPro.registration;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;

public class RegistrationStabilityOfNumbersTest extends TestBaseReg{
	@Test
	public void  registrationStabilityOfNumbersTest_C14943() throws Exception {
		open();
		selenium.click("//li[4]/a");
		Thread.sleep(4000);
		selenium.click("css=span.text");
		selenium.click("//div[@id='edit-city-wrapper']/span/ul/li[3]");
		Thread.sleep(5000);
		selenium.click("link=Бронзовые");
		selenium.click("link=Платиновые");
		selenium.click("link=Обычные");
		AssertJUnit.assertTrue(selenium.isTextPresent("(383)"));
		selenium.click("css=span.text");
		selenium.click("//div[@id='edit-city-wrapper']/span/ul/li[7]");
		Thread.sleep(5000);
		selenium.click("link=Платиновые");
		selenium.click("link=Бронзовые");
		selenium.click("link=Обычные");
		AssertJUnit.assertTrue(selenium.isTextPresent("(863)"));
	}
}