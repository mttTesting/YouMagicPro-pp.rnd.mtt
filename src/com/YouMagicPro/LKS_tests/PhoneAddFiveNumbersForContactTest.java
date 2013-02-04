package com.YouMagicPro.LKS_tests;

import org.testng.annotations.Test;
import com.registration.tests.TestBaseReg;


public class PhoneAddFiveNumbersForContactTest extends TestBaseReg{
	@Test
	public void  phoneAddFiveNumbersForContactTest_C15316_C15320_C15319() throws Exception {	 
		openAndLoginLKS();
		selenium.click("//div[@id='block-umagicpro_contacts-0']/div/div/table/tbody/tr/td[2]/a");//Нажатие на кнопку "Добавить номер"
		Thread.sleep(4000);
		selenium.type("id=edit-contact-first-name", "t1");//Ввод имени и 5 номеров для контакта
		selenium.type("id=edit-contact-telephone1", "001");
		selenium.type("id=edit-contact-telephone2", "002");
		selenium.type("id=edit-contact-telephone3", "003");
		selenium.type("id=edit-contact-telephone4", "004");
		selenium.type("id=edit-contact-telephone5", "005");
		selenium.click("id=edit-save");//Нажатие кнопки "Сохранить"
		Thread.sleep(8000);
		selenium.click("//div[@onclick='$(\"#webphone-widjet\").webphone(\"outerCall\", \"005\"); return false;']");//Осуществление вызовов по 5 номерам
		Thread.sleep(12000);
		selenium.click("css=span.ui-icon.ui-icon-closethick");
		selenium.click("//div[@onclick='$(\"#webphone-widjet\").webphone(\"outerCall\", \"004\"); return false;']");
		Thread.sleep(12000);
		selenium.click("css=span.ui-icon.ui-icon-closethick");
		selenium.click("//div[@onclick='$(\"#webphone-widjet\").webphone(\"outerCall\", \"003\"); return false;']");
		Thread.sleep(12000);
		selenium.click("css=span.ui-icon.ui-icon-closethick");
		selenium.click("//div[@onclick='$(\"#webphone-widjet\").webphone(\"outerCall\", \"002\"); return false;']");
		Thread.sleep(12000);
		selenium.click("//div[@onclick='$(\"#webphone-widjet\").webphone(\"outerCall\", \"001\"); return false;']");
		selenium.click("link=Редактировать контакты");//Нажатие на пункт "Редактировать контакты" в меню настроек вебфона
		Thread.sleep(5000);
		selenium.click("//td[2]/a[2]");//Удаление контакта
		selenium.click("id=edit-submit");
		Thread.sleep(3000);
	}
}