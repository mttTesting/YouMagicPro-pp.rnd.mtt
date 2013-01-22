package com.YouMagicPro.LKA_tests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;

public class AddAndDeleteMenusTest extends TestBaseReg{
	@Test
	public void addAndDeleteMenusTest_C15292() throws Exception {
		openAndLogin();
	
		selenium.click("link=Настройки"); //Переход в меню "Настройки"->" Голосовое меню"
		selenium.waitForPageToLoad("60000");
		selenium.click("//div[4]/a/div");
		selenium.waitForPageToLoad("30000");
		selenium.click("css=span.bSongFiles_AddFileText"); //Клик по ссылке "Добавить меню"
		Thread.sleep(17000);
		
		
		selenium.click("id=edit-ivr-name"); //Ввод названия и предназначения меню
		selenium.type("id=edit-ivr-name", "Меню");
		selenium.click("id=edit-submit"); //Нажатие кнопки "Сохранить"
		Thread.sleep(8000);
		AssertJUnit.assertTrue(selenium.isTextPresent("Меню")); //Проверка наличия на странице текста с названием добавленного меню
		selenium.click("css=span.bSongdelete.bSongFiles_MarginControls"); //Клик по пиктограмме удаления меню
		selenium.click("css=span.phone_confirm_text"); //Подтверждение удаления
		Thread.sleep(14000);
		AssertJUnit.assertFalse(selenium.isTextPresent("Меню")); //Проверка отсутствия на странице текста с названием удаленного меню
	}
}
