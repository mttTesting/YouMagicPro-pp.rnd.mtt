package com.YouMagicPro.LKA_tests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;

public class ClickOnPersonalAccountTest extends TestBaseReg{
	@Test
public void clickOnPersonalAccountTest () throws Exception {	 
		open();
		selenium.waitForPageToLoad("30000");
		selenium.click("link=�������������");
		selenium.waitForPageToLoad("30000");
		selenium.type("id=edit-name-1", "100126"); //���� ������ � ������
		selenium.type("id=edit-pass-1", "1234");
		selenium.click("id=edit-submit-1"); //������� "����"
		selenium.waitForPageToLoad("30000");
		selenium.click("css=a.bPopup__eClose.instructions-close");//�������� ����������� ����
		selenium.click("css=span.modal_cansel_button_text");
		selenium.click("//div[4]/a");
		
		selenium.click("xpath=(//a[contains(@href,'/private/account')])[2]");
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("��������� ��������"));

	 }

}