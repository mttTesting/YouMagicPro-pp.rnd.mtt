package com.YouMagicPro.LKS_tests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import com.registration.tests.TestBaseReg;


public class HistorySwitchOnlyYearAndMonth extends TestBaseReg{
	@Test
	public void historyPageTest () throws Exception {	 
		openAndLoginLKS();
		
		selenium.click("link=История"); //Нажатие на кнопку "История"
		Thread.sleep(3000);
		selenium.click("id=edit-from-date-datepicker-popup-0");//Нажатие на иконку даты
		selenium.click("//tbody[3]/tr[2]/td[3]/a/span");
		selenium.click("id=edit-from-date-datepicker-popup-0");//Выбор года
		selenium.click("css=th.datepickerGoPrev > a > span");
		selenium.click("css=th.datepickerGoPrev > a > span");
		selenium.click("id=edit-from-date-datepicker-popup-0");//Выбор месяца
		selenium.click("link=Янв");//
		selenium.click("id=edit-from-date-datepicker-popup-0");//Выбор дня
		AssertJUnit.assertEquals(selenium.getValue("id=edit-from-date-datepicker-popup-0"), "2013-01-01"); //проверка
	}
}