package com.YouMagicPro.registration;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;

public class RegistrationWrongVerificationCodeTest extends TestBaseReg{
	@Test
	public void  registrationStabilityOfNumbersTest() throws Exception {
		open();
		selenium.click("//li[4]/a");//нажимаем кнопку –егистраци€
		selenium.waitForPageToLoad("30000");
		selenium.click("css=span[name=\"abc-numbers\"]");//выбираем некий номер
		selenium.click("//label/input");
		selenium.click("id=edit-next");//нажимаем ƒалее
		selenium.waitForPageToLoad("30000");
		selenium.type("id=edit-personal-phone", "79857297409");//вводим номер телефона
		selenium.click("//div[2]/div/div[2]/a");//нажимаем на подтверждение номера
		Thread.sleep(2000);
		selenium.type("name=smscode", "12212");//вводим неверный смс-код
		selenium.click("css=span.phone_confirm_text.conf_text");//нажимаем на подтверждение смс-кода
		Thread.sleep(2000);
		AssertJUnit.assertTrue(selenium.isTextPresent("Ќеправильный код подтверждени€"));//ищем, есть ли на странице текст "Ќеправильный код подтверждени€"
	}
}
