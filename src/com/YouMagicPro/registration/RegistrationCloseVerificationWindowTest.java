package com.YouMagicPro.registration;

import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;

public class RegistrationCloseVerificationWindowTest extends TestBaseReg{
	@Test
	public void  registrationCloseVerificationWindowTest() throws Exception {
		open();
		selenium.click("//li[4]/a");//нажимаем кнопку Регистрация
		selenium.waitForPageToLoad("30000");
		selenium.click("css=span[name=\"abc-numbers\"]");//выбираем некий номер
		selenium.click("//label/input");
		selenium.click("id=edit-next");//нажимаем Далее
		selenium.waitForPageToLoad("30000");
		selenium.type("id=edit-personal-phone", "1234");
		selenium.click("id=edit-next");//нажимаем Далее
		selenium.click("//td[2]/div/span");//нажимаем Закрыть
}
}