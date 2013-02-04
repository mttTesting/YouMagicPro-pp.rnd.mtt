package com.YouMagicPro.LKS_tests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import com.registration.tests.TestBaseReg;


public class PhoneAddGroupAndCancelTest extends TestBaseReg{
	@Test
	public void  phoneAddGroupAndCancelTest_C15354 () throws Exception {	 
		openAndLoginLKS();
		selenium.click("link=Редактировать контакты");//Нажатие на пункт "Редактировать контакты" в меню настроек вебфона
		Thread.sleep(3000);
		selenium.click("link=Добавить группу");//Нажатие на кнопку "Добавить группу"
		Thread.sleep(3000);
		selenium.type("//div[2]/input", "g2");//Ввод имени группы ("g1")
		selenium.click("css=a.bPopup__eClose.close");//Нажатие кнопки "Отменить"
		selenium.click("//div[@id='contacts-block-wrapper']/dl[2]/dt/div");
		AssertJUnit.assertFalse(selenium.isTextPresent("g2"));//Проверка, есть ли на странице текст "g1"
	}
}