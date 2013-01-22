package com.YouMagicPro.LKA_tests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;

public class CallForwardingPageTest extends TestBaseReg{
	@Test
	public void clickOnAvatarTest () throws Exception {	 
		openAndLogin();

		selenium.click("//div[2]/div/div/div/span/a"); //Переход на страницу переадресации
		selenium.waitForPageToLoad("30000");
		
		selenium.click("//div[5]/a/div");
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isElementPresent("css=span.text")); //Проверка наличия на странице элементов
		AssertJUnit.assertTrue(selenium.isElementPresent("css=span.mycheckbox.action-always-processed"));
		AssertJUnit.assertTrue(selenium.isElementPresent("css=div > span.mycheckbox.action-always-processed"));
		AssertJUnit.assertTrue(selenium.isElementPresent("id=CallsRetmenu"));
}
}