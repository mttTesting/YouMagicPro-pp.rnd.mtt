package com.YouMagicPro.LKS_tests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import com.registration.tests.TestBaseReg;


public class PhoneChangeContactFirstNameTest extends TestBaseReg{
	@Test
	public void  phoneCreateAndDeleteGroupTest () throws Exception {	 
		openAndLoginLKS();
		selenium.click("link=–едактировать контакты");//Ќажатие на пункт меню "–едактирование контактов"
		Thread.sleep(4000);
		selenium.click("xpath=(//a[contains(text(),'ред.')])[2]");//Ќажатие на кнопку редактировани€ контакта
		Thread.sleep(4000);
		selenium.type("id=edit-contact-first-name", "B1");//добавить контакт ("B1")
		selenium.click("id=edit-save");//сохранить
		Thread.sleep(4000);
		selenium.click("id=edit-submit");//сохранить
		Thread.sleep(4000);
		AssertJUnit.assertTrue(selenium.isTextPresent("B1"));//проверка добавлени€ контакта
		selenium.click("link=–едактировать контакты");//Ќажатие на пункт меню "–едактирование контактов"
		Thread.sleep(4000);
		selenium.click("xpath=(//a[contains(text(),'ред.')])[2]");//Ќажатие на кнопку редактировани€ контакта
		Thread.sleep(4000);
		selenium.type("id=edit-contact-first-name", "x1");//изменить им€ контакта
		selenium.click("id=edit-save");//сохранить
		Thread.sleep(4000);
		selenium.click("id=edit-submit");//сохранить
		Thread.sleep(4000);
	}
}