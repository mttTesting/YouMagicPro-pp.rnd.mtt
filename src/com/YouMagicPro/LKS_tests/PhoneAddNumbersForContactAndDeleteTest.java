package com.YouMagicPro.LKS_tests;

import org.testng.annotations.Test;
import com.registration.tests.TestBaseReg;


public class PhoneAddNumbersForContactAndDeleteTest extends TestBaseReg{
	@Test
	public void  phoneAddNumbersForContactAndDeleteTest_C15322() throws Exception {	 
		openAndLoginLKS();
		selenium.click("//div[@id='block-umagicpro_contacts-0']/div/div/table/tbody/tr/td[2]/a");//Нажатие на кнопку "Добавить номер"
		Thread.sleep(4000);
		selenium.type("id=edit-contact-first-name", "t1");//Ввод имени и 2х номеров для контакта
		selenium.type("id=edit-contact-telephone1", "001");
		Thread.sleep(7000);
		selenium.type("id=edit-contact-telephone2", "002");

		selenium.click("id=edit-save");//Нажатие кнопки "Сохранить"
		Thread.sleep(8000);
		
		selenium.click("//div[4]/nobr/a");//нажатие на пункт меню - редактирование контактов
		Thread.sleep(4000);
		selenium.click("//tr[4]/td[2]/a");//нажатие на карандаш напротив контакта
		Thread.sleep(4000);
		
		selenium.type("id=edit-contact-telephone2", "");//удаление второго номера
		Thread.sleep(3000);
		selenium.click("id=edit-save");//сохранить
		Thread.sleep(3000);
		selenium.click("//tr[4]/td[2]/a[2]");//удаление контакта
		Thread.sleep(3000);
	}
}