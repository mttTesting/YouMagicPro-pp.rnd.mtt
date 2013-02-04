package com.YouMagicPro.LKS_tests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import com.registration.tests.TestBaseReg;


public class PhoneAddContactAndDeleteTest extends TestBaseReg{
	@Test
	public void  PhoneAddContactAndDeleteTest_C15324 () throws Exception {	 
		openAndLoginLKS();
		selenium.click("//div[@id='block-umagicpro_contacts-0']/div/div/table/tbody/tr/td[2]/a");//Нажатие на кнопку "Добавить контакт"
		Thread.sleep(4000);
		selenium.type("id=edit-contact-first-name", "x3");//Ввод данных контакта ("x3", "333")
		selenium.type("id=edit-contact-last-name", "x3");
		selenium.type("id=edit-contact-middle-name", "x3");
		selenium.type("id=edit-contact-telephone1", "333");

		AssertJUnit.assertTrue(selenium.isTextPresent("x3"));//проверка, есть ли на странице строка "x3"
		Thread.sleep(4000);
		selenium.click("//div[@id='block-umagicpro_contacts-0']/div/div/table/tbody/tr/td[2]/a");
		
		
		
	}
}
