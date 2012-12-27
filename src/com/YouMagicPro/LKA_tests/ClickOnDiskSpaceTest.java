package com.YouMagicPro.LKA_tests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;

public class ClickOnDiskSpaceTest extends TestBaseReg{
	@Test
public void clickOnDiskSpaceTest () throws Exception {	 
		openAndLogin();
		selenium.click("css=a.bPopup__eClose.instructions-close");//закрытие всплывающих окон
		selenium.click("css=span.modal_cansel_button_text");
		
		selenium.click("css=a > span.lMenuBlocks__hrefs"); //Нажатие ссылки со свободным местом на диске
		Thread.sleep(3000);
		AssertJUnit.assertTrue(selenium.isElementPresent("id=free_space_all"));//Проверить, что на странице есть текст  “ Звуковые файлы“
	 }
}