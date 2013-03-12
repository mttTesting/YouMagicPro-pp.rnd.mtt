package com.YouMagicPro.registration;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;


public class RegistrationEnterNumberOfEmployees  extends TestBaseReg{
	@Test
	public void  registrationEnterNumberOfEmployees() throws Exception {
		open();
		selenium.click("//li[4]/a");//нажимаем кнопку Регистрация
		selenium.waitForPageToLoad("30000");
		selenium.click("css=span[name=\"abc-numbers\"]");//выбираем некий номер
		selenium.click("//label/input");
		selenium.click("id=edit-next");//нажимаем Далее
		selenium.waitForPageToLoad("30000");
		selenium.type("id=edit-workers-count", "89");//вводим кол-во сотрудников
		AssertJUnit.assertEquals("89", selenium.getValue("id=edit-workers-count"));//проверяем тествовое поле на кол-во 89
	}
}
