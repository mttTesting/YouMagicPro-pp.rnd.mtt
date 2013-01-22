package com.YouMagicPro.LKA_tests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;

public class ClickOnExitTest extends TestBaseReg{
	@Test
public void clickOnExitTest () throws Exception {	 
		openAndLogin();

		selenium.click("css=span.logout_user > a"); //Клик по кнопке "Выйти"
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("Полноценная виртуальная офисная АТС за несколько минут!"));//Проверить, что на странице есть текст "Полноценная виртуальная офисная АТС за несколько минут "
	 }

}