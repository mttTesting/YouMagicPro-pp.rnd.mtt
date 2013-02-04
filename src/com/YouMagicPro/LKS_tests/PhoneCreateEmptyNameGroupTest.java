package com.YouMagicPro.LKS_tests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import com.registration.tests.TestBaseReg;


public class PhoneCreateEmptyNameGroupTest extends TestBaseReg{
	@Test
	public void  phoneCreateAndDeleteGroupTest_C15327 () throws Exception {	 
		openAndLoginLKS();
		selenium.click("link=Редактировать контакты");//Нажатие на пункт "Редактировать контакты" в меню настроек вебфона
		Thread.sleep(15000);
		selenium.click("link=Добавить группу");//Нажатие на кнопку "Добавить группу"
		Thread.sleep(3000);
		selenium.click("id=edit-save");//Нажатие кнопки "Сохранить"
		Thread.sleep(3000);
		AssertJUnit.assertTrue(selenium.isTextPresent("Имя"));//Проверка, есть ли на странице текст "Имя" (признак того, что сохранение отменилось)

	}
}