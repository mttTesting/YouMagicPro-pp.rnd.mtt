package com.YouMagicPro.LKS_tests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import com.registration.tests.TestBaseReg;


public class PhoneAddEmptyContactTest extends TestBaseReg{
	@Test
	public void  phoneAddEmptyContactTest_C15328 () throws Exception {	 
		openAndLoginLKS();
		
		selenium.click("//div[@id='block-umagicpro_contacts-0']/div/div/table/tbody/tr/td[2]/a");//нажатие на кнопку добавлени€ контакта
		Thread.sleep(4000);
		selenium.type("id=edit-contact-first-name", "A1");//—оздать новый контакт(A1), не заполнив данные
		selenium.click("id=edit-save");//сохранить
		Thread.sleep(3000);
		AssertJUnit.assertTrue(selenium.isTextPresent("ѕоле “елефон об€зательно к заполнению"));//так как данные пустые, провер€ем наличие предупреждени€
	}
}