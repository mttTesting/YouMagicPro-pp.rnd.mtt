package com.YouMagicPro.LKA_tests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;

public class AddAndDeleteNoticesTest extends TestBaseReg{
	@Test
	public void addAndDeleteNoticesTest_C15148() throws Exception {
		openAndLogin();

		selenium.click("link=Настройки"); //Переход в меню "Настройки"->" Уведомления "
		selenium.waitForPageToLoad("30000");
		selenium.click("//div[7]/a/div");
		Thread.sleep(10000);
		AssertJUnit.assertTrue(selenium.isElementPresent("id=edit-balance-threshold")); //Проверка, присутствуют ли на странице элементы 
		AssertJUnit.assertTrue(selenium.isElementPresent("css=span.mycheckbox"));
		AssertJUnit.assertTrue(selenium.isElementPresent("id=edit-notification-mail-list"));
		AssertJUnit.assertTrue(selenium.isElementPresent("//form[@id='porta-support-notification-form']/div/div/table/tbody/tr[3]/td/span"));		
	}
}
