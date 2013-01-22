package com.YouMagicPro.LKA_tests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;

public class ClickOnBalanceTest extends TestBaseReg{
	@Test
public void clickOnBalanceTest () throws Exception {	 
		openAndLogin();

		selenium.click("css=a.mGray2.active"); //Клик по изображениию-аватару.
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("Структура расходов")); //Проверить, что на открытой странице есть текст  “Структура расходов “
	 }

}