package com.YouMagicPro.LKA_tests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;

public class DetalizationPageTest  extends TestBaseReg{
	@Test
	public void detalizationPageTest() throws Exception {
		openAndLogin();

		selenium.click("link=�������");//�������� �� "�������"
		Thread.sleep(3000);
		
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isElementPresent("id=edit-from-date-datepicker-popup-0"));//���������, ���� �� �������� ������ ����
		AssertJUnit.assertTrue(selenium.isElementPresent("id=edit-to-date-datepicker-popup-0"));
		AssertJUnit.assertTrue(selenium.isElementPresent("id=edit-submit"));
}
}