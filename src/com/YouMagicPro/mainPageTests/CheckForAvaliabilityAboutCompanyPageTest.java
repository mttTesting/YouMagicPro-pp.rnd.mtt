package com.YouMagicPro.mainPageTests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;


public class CheckForAvaliabilityAboutCompanyPageTest extends TestBaseReg{
	@Test
	public void  checkForAvaliabilityAboutCompanyPageTest() throws Exception {
		open();
		selenium.click("//h6/a"); //Переход по ссылке "О Компании"
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("О Компании"));
	}
}