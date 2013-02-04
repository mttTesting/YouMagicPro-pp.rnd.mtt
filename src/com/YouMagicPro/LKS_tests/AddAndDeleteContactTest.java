package com.YouMagicPro.LKS_tests;

import java.io.IOException;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.thoughtworks.selenium.Selenium;
import com.registration.tests.TestBaseReg;

public class AddAndDeleteContactTest extends TestBaseReg{
	@Test
	public void addAndDeleteContactTest_C15324() throws Exception {	
    	
		openAndLoginLKS();
		
		selenium.click("//td[2]/a");//нажатие кнопки добавления контакта
		Thread.sleep(7000);
		selenium.type("//form/div/div/div[2]/input", "x3");// ввод данных контакта
		selenium.type("id=edit-contact-telephone1", "333");
		selenium.click("id=edit-save"); //"сохранить"
		Thread.sleep(5000);
		AssertJUnit.assertTrue(selenium.isTextPresent("333")); //проверка на наличие номера "333" в списках контактов
		AssertJUnit.assertTrue(selenium.isTextPresent("x3"));
		selenium.click("link=Редактировать контакты"); //нажатие на кнопку редактирования контактов
		Thread.sleep(5000);
		selenium.click("xpath=//table[@id='contacts-overview']/tbody/tr[4]/td[2]/a[2]"); //удаление контакта
		selenium.click("id=edit-submit");//"сохранить"
		Thread.sleep(10000);
		AssertJUnit.assertFalse(selenium.isTextPresent("333")); //проверка на наличие номера "333" в списках контактов

	}
}