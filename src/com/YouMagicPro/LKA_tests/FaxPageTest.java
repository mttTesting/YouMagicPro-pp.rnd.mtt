package com.YouMagicPro.LKA_tests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;

public class FaxPageTest extends TestBaseReg{
	@Test
	public void faxPageTest() throws Exception {
		openAndLogin();

		selenium.click("//div[4]/a");
		
		selenium.click("//div/span[3]/a"); //Переход в меню "Файлы"->"Факсы"
		selenium.waitForPageToLoad("30000");
		
		selenium.click("//div[4]/a/div");
		Thread.sleep(3000);
		AssertJUnit.assertTrue(selenium.isTextPresent("Факсы")); //Проверка, присутствует ли на странице текст "Факсы"

}
}