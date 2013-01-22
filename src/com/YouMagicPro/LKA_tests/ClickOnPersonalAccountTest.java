package com.YouMagicPro.LKA_tests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;

public class ClickOnPersonalAccountTest extends TestBaseReg{
	@Test
public void clickOnPersonalAccountTest () throws Exception {	 
		openAndLogin();

		selenium.click("//div[4]/a");
		
		selenium.click("xpath=(//a[contains(@href,'/private/account')])[2]");
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("Структура расходов"));

	 }

}