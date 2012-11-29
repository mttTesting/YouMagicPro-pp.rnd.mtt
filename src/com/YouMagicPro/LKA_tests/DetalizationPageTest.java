package com.YouMagicPro.LKA_tests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;

public class DetalizationPageTest  extends TestBaseReg{
	@Test
	public void detalizationPageTest() throws Exception {
		open();
		selenium.waitForPageToLoad("30000");
		selenium.click("link=Администратор");
		selenium.waitForPageToLoad("30000");
		selenium.type("id=edit-name-1", "100126"); //ввод логина и пароля
		selenium.type("id=edit-pass-1", "1234");
		selenium.click("id=edit-submit-1"); //нажатие "Вход"
		selenium.waitForPageToLoad("30000");
		selenium.click("css=a.bPopup__eClose.instructions-close");//закрытие всплывающих окон
		selenium.click("css=span.modal_cansel_button_text");	
		
		selenium.click("link=Платежи");
		Thread.sleep(3000);
		
		//selenium.click("//div[2]/a/div");
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isElementPresent("id=edit-from-date-datepicker-popup-0"));
		AssertJUnit.assertTrue(selenium.isElementPresent("id=edit-to-date-datepicker-popup-0"));
		AssertJUnit.assertTrue(selenium.isElementPresent("id=edit-submit"));
}
}