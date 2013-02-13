package com.YouMagicPro.LKS_tests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import com.registration.tests.TestBaseReg;


public class PhoneAddGroupAndCancelTest extends TestBaseReg{
	@Test
	public void  phoneAddGroupAndCancelTest_C15354 () throws Exception {	 
		openAndLoginLKS();
		selenium.click("link=Редактировать контакты");//Нажатие на пункт "Редактировать контакты" в меню настроек вебфона
		Thread.sleep(3000);
		selenium.click("link=Добавить группу");//Нажатие на кнопку "Добавить группу"
		Thread.sleep(3000);
		selenium.type("id=edit-group-name", "g2");//Ввод имени группы ("g1")
		selenium.click("id=edit-cancel");//Нажатие кнопки "Отменить"
		AssertJUnit.assertFalse(selenium.isTextPresent("g2"));//Проверка, есть ли на странице текст "g1"
	}
}