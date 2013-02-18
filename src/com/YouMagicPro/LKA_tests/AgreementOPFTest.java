package com.YouMagicPro.LKA_tests;

import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;

public class AgreementOPFTest extends TestBaseReg{
	@Test
	public void agreementOPFTest_C14983() throws Exception {
		openAndLogin();

		selenium.click("link=Оформить");
		selenium.waitForPageToLoad("30000");
		selenium.click("css=span.text");
		selenium.click("//div[@id='edit-buisness-form-buisness-form-select-wrapper']/span/ul/li[2]"); //Выбор в выпадающем списке "ОАО"
		selenium.click("css=span.text");
		selenium.click("//div[@id='edit-buisness-form-buisness-form-select-wrapper']/span/ul/li[3]"); //Выбор в выпадающем списке "ЗАО"
		selenium.click("css=span.text");
		selenium.click("//div[@id='edit-buisness-form-buisness-form-select-wrapper']/span/ul/li[4]"); //Выбор в выпадающем списке "ИП"
		selenium.click("css=span.text");
		selenium.click("css=ul.dropdown > li"); //Выбор в выпадающем списке "ООО"
	}
}