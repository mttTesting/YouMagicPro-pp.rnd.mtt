package com.YouMagicPro.LKS_tests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import com.registration.tests.TestBaseReg;


public class PhoneRenameGroupTest extends TestBaseReg{
	@Test
	public void phoneRenameGroupTest_C15330 () throws Exception {	 
		openAndLoginLKS();
		selenium.click("link=Редактировать контакты");//нажатие кнопки "Редактировать контакты"
		Thread.sleep(4000);
		selenium.click("//tr[3]/td[2]/a"); //нажатие на "карандаш"
		Thread.sleep(4000);
		selenium.type("id=edit-group-name", "test1");//редактирование имени группы
		selenium.click("id=edit-save");//сохранить
		Thread.sleep(4000);
		AssertJUnit.assertTrue(selenium.isTextPresent("test1"));//проверка наличия текста "test1"
		selenium.click("//tr[3]/td[2]/a");//нажатие на "карандаш"
		Thread.sleep(4000);
		selenium.type("id=edit-group-name", "test");//ввод нового имени группы
		selenium.click("id=edit-save");//сохранить
		Thread.sleep(4000);
		selenium.click("id=edit-submit");//сохранить
		Thread.sleep(4000);
	}
}