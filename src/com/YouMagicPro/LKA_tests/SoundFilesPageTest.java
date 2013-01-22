package com.YouMagicPro.LKA_tests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;

public class SoundFilesPageTest extends TestBaseReg{
	@Test
	public void soundFilesTest() throws Exception {
		openAndLogin();

		//selenium.click("//td[2]/div/span");
		//selenium.click("//div[4]/a");
		selenium.click("//div/span[3]/a"); // Переход в меню "Файлы"->"Звуковые файлы"
		selenium.waitForPageToLoad("30000");
		selenium.click("//div[2]/a/div");
		Thread.sleep(3000);
		AssertJUnit.assertTrue(selenium.isElementPresent("css=div.bContent__innerHeader")); ///Проверка, присутствует ли на странице элемент css=div.bSoundFileblock
	}
}
