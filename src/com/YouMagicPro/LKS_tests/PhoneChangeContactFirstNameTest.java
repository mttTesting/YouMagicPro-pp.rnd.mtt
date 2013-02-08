package com.YouMagicPro.LKS_tests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import com.registration.tests.TestBaseReg;


public class PhoneChangeContactFirstNameTest extends TestBaseReg{
	@Test
	public void  ChangeContactFirstNameTest () throws Exception {	 
		openAndLoginLKS();
		selenium.click("link=Редактировать контакты");//Нажатие на пункт меню "Редактирование контактов"
		Thread.sleep(4000);
		selenium.click("//tr[4]/td[2]/a");//Нажатие на кнопку редактирования контакта
		Thread.sleep(4000);
		selenium.type("id=edit-contact-first-name", "t1");//добавить контакт ("t1")
		selenium.click("id=edit-save");//сохранить
		Thread.sleep(4000);
		selenium.click("id=edit-submit");//сохранить
		Thread.sleep(4000);
		AssertJUnit.assertTrue(selenium.isTextPresent("t1"));//проверка добавления контакта
		selenium.click("link=Редактировать контакты");//Нажатие на пункт меню "Редактирование контактов"
		Thread.sleep(4000);
		selenium.click("//tr[4]/td[2]/a");//Нажатие на кнопку редактирования контакта
		Thread.sleep(4000);
		selenium.type("id=edit-contact-first-name", "B1");//изменить имя контакта
		selenium.click("id=edit-save");//сохранить
		Thread.sleep(4000);
		selenium.click("id=edit-submit");//сохранить
		Thread.sleep(4000);
	}
}