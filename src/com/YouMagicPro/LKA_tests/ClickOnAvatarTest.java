package com.YouMagicPro.LKA_tests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;

public class ClickOnAvatarTest extends TestBaseReg{
	@Test
public void clickOnAvatarTest () throws Exception {	 
		openAndLogin();
		selenium.click("css=a.bPopup__eClose.instructions-close");//закрытие всплывающих окон
		selenium.click("css=span.modal_cansel_button_text");
		
		selenium.click("css=img.imagecache.imagecache-customer-logo"); //Клик по пиктограмме YouMagic
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("Структура расходов")); //Проверить, что на странице есть текст "Полноценная виртуальная офисная АТС за несколько минут "
	 }

}