package com.YouMagicPro.LKS_tests;

import org.testng.annotations.Test;
import com.registration.tests.TestBaseReg;


public class PhoneAddFiveNumbersForContactTest extends TestBaseReg{
	@Test
	public void  phoneAddFiveNumbersForContactTest_C15316_C15320_C15319() throws Exception {	 
		openAndLoginLKS();
		selenium.click("//td[2]/a");//нажатие кнопки добавления контакта
		Thread.sleep(7000);
		selenium.type("//form/div/div/div[2]/input", "x1");// ввод данных контакта
		selenium.type("id=edit-contact-telephone1", "1");
		selenium.click("id=edit-save"); //"сохранить"
		Thread.sleep(4000);
		
		selenium.click("//div[4]/nobr/a");//нажатие на пункт меню - редактирование контактов
		Thread.sleep(4000);
		selenium.click("//tr[4]/td[2]/a");//нажатие на карандаш напротив контакта
		Thread.sleep(4000);
		
		selenium.type("id=edit-contact-telephone1", "001");//добавление пяти номеров
		selenium.type("id=edit-contact-telephone2", "002");
		selenium.type("id=edit-contact-telephone3", "003");
		selenium.type("id=edit-contact-telephone4", "004");
		selenium.type("id=edit-contact-telephone5", "005");
		selenium.click("//input[@id='edit-save']");//Сохранить
		Thread.sleep(3000);
		
		selenium.click("//div[4]/nobr/a");//нажатие на пункт меню - редактирование контактов
		Thread.sleep(4000);
		selenium.click("//tr[4]/td[2]/a");//нажатие на карандаш напротив контакта
		Thread.sleep(4000);
		
		selenium.type("id=edit-contact-telephone1", "1");//редактирование контакта
		selenium.type("id=edit-contact-telephone5", "");
		selenium.type("id=edit-contact-telephone4", "");
		selenium.type("id=edit-contact-telephone3", "");
		selenium.type("id=edit-contact-telephone2", "");
		selenium.click("//input[@id='edit-save']");//Сохранить
		Thread.sleep(3000);
		
		selenium.click("//tr[4]/td[2]/a[2]");//нажатие на мусорное ведро для удаления контакта
		Thread.sleep(3000);
		selenium.click("xpath=(//input[@id='edit-submit'])[2]");//нажатие 'сохранить'
		Thread.sleep(3000);
	}
}