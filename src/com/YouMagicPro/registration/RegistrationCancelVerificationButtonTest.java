package com.YouMagicPro.registration;

import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;

public class RegistrationCancelVerificationButtonTest   extends TestBaseReg{
	@Test
	public void  registrationCancelVerificationButtonTest() throws Exception {
		open();
		selenium.click("//li[4]/a");//нажимаем кнопку Регистрация
		selenium.waitForPageToLoad("30000");
		selenium.click("css=span[name=\"abc-numbers\"]");//выбираем некий номер
		selenium.click("//label/input");
		selenium.click("id=edit-next");//нажимаем Далее
		selenium.waitForPageToLoad("30000");
		selenium.type("id=edit-personal-phone", "1234");//вводим номер телефона
		selenium.click("id=edit-next");//нажимаем Далее
		selenium.type("name=smscode", "1234");//вводим код
		selenium.click("css=span.modal_cansel_button_text");//нажимаем отменить
	}
}