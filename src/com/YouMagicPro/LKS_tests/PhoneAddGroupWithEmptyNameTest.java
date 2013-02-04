	package com.YouMagicPro.LKS_tests;

	import org.testng.AssertJUnit;
	import org.testng.annotations.Test;
	import com.registration.tests.TestBaseReg;


	public class PhoneAddGroupWithEmptyNameTest extends TestBaseReg{
		@Test
		public void  PhoneAddGroupWithEmptyNameTest_C15327 () throws Exception {	 
			openAndLoginLKS();
			selenium.click("link=Редактировать контакты");//Нажатие на пункт "Редактировать контакты" в меню настроек вебфона
			Thread.sleep(3000);
			selenium.click("link=Добавить группу");//Нажатие на кнопку "Добавить группу"
			Thread.sleep(3000);
			selenium.type("id=edit-group-name", "");//Ввод имени группы ("g1")
			selenium.click("id=edit-save");
			Thread.sleep(3000);
			
			AssertJUnit.assertTrue(selenium.isElementPresent("id=edit-group-name"));//Проверка, есть ли на странице текст "g1"
			
			
		}
	}