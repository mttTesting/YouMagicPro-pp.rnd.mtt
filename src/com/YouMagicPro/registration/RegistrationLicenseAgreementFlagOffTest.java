package com.YouMagicPro.registration;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;

public class RegistrationLicenseAgreementFlagOffTest  extends TestBaseReg{
	@Test
	public void  registrationMobilePhoneConfirmationButtonTest() throws Exception {
		open();
		selenium.click("//li[4]/a");//нажимаем кнопку Регистрация
		selenium.waitForPageToLoad("30000");
		selenium.click("css=span[name=\"abc-numbers\"]");//выбираем некий номер
		selenium.click("id=edit-next");//нажимаем Далее
		selenium.waitForPageToLoad("30000");
		selenium.type("id=edit-last-name", "12314");//заполняем данные
		selenium.type("id=edit-first-name", "1234");
		selenium.type("id=edit-middle-name", "1234");
		selenium.type("id=edit-mail", "111@com.com");
		selenium.type("id=edit-personal-phone", "1234");
		selenium.click("id=edit-next");//нажимаем Далее
		selenium.type("name=smscode", "1234");//вводим смс-код
		selenium.click("css=span.phone_confirm_text.conf_text");//нажимаем подтвердить
		selenium.click("id=edit-next");//нажимаем Далее
		AssertJUnit.assertTrue(selenium.isTextPresent("Персональная информация"));//проверяем, что мы остались на этой странице
	
	}
}