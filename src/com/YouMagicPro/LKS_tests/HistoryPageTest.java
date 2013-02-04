package com.YouMagicPro.LKS_tests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import com.registration.tests.TestBaseReg;


public class HistoryPageTest  extends TestBaseReg{
	@Test
	public void historyPageTest () throws Exception {	 
		openAndLoginLKS();
		selenium.click("//div/span[3]/a");//Нажатие на кнопку "История"
		Thread.sleep(5000);
		AssertJUnit.assertTrue(selenium.isElementPresent("id=edit-from-date-datepicker-popup-0"));//проверка наличия календаря
		AssertJUnit.assertTrue(selenium.isElementPresent("id=edit-to-date-datepicker-popup-0"));
		AssertJUnit.assertTrue(selenium.isElementPresent("id=edit-account-filter"));
	}

}