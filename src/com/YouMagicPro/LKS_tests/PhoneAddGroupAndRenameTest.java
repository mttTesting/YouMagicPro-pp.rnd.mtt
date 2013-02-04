	package com.YouMagicPro.LKS_tests;

	import org.testng.AssertJUnit;
	import org.testng.annotations.Test;
	import com.registration.tests.TestBaseReg;


	public class PhoneAddGroupAndRenameTest extends TestBaseReg{
		@Test
		public void  PhoneAddGroupAndRenameTest_C15330 () throws Exception {	 
			openAndLoginLKS();
			selenium.click("link=Редактировать контакты");//Нажатие на пункт "Редактировать контакты" в меню настроек вебфона
			Thread.sleep(3000);
			selenium.click("link=Добавить группу");//Нажатие на кнопку "Добавить группу"
			Thread.sleep(3000);
			selenium.type("id=edit-group-name", "g1");//Ввод имени группы ("g1")
			selenium.click("id=edit-save");
			Thread.sleep(3000);
			selenium.click("//div[4]/input");//сабмит
			Thread.sleep(3000);
			
			AssertJUnit.assertTrue(selenium.isTextPresent("g1"));//Проверка, есть ли на странице текст "g1"
			
			selenium.click("link=Редактировать контакты");//Нажатие на пункт "Редактировать контакты" в меню настроек вебфона
			Thread.sleep(3000);
			selenium.click("//table[@id='contacts-overview']/tbody/tr[3]/td[2]/a");
			Thread.sleep(3000);
			selenium.type("id=edit-group-name", "g11");
			selenium.click("id=edit-save");
			Thread.sleep(3000);
			selenium.click("//div[4]/input");//сабмит
			Thread.sleep(3000);
			
			AssertJUnit.assertTrue(selenium.isTextPresent("g11"));//Проверка, есть ли на странице текст "g1"
			
			selenium.click("link=Редактировать контакты");//Нажатие на пункт "Редактировать контакты" в меню настроек вебфона
			Thread.sleep(3000);
			selenium.click("//table[@id='contacts-overview']/tbody/tr[3]/td[2]/a[2]");
			Thread.sleep(9000);
			selenium.click("//div[4]/input");//сабмит
			Thread.sleep(6000);
			
			AssertJUnit.assertFalse(selenium.isTextPresent("g1"));//Проверка, есть ли на странице текст "g1"
		}
	}