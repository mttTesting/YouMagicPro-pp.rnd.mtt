package com.YouMagicPro.LKS_tests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import com.registration.tests.TestBaseReg;


public class PhoneChangeContactFirstNameTest extends TestBaseReg{
	@Test
	public void  ChangeContactFirstNameTest () throws Exception {	 
		openAndLoginLKS();
		selenium.click("link=������������� ��������");//������� �� ����� ���� "�������������� ���������"
		Thread.sleep(4000);
		selenium.click("//tr[4]/td[2]/a");//������� �� ������ �������������� ��������
		Thread.sleep(4000);
		selenium.type("id=edit-contact-first-name", "t1");//�������� ������� ("t1")
		selenium.click("id=edit-save");//���������
		Thread.sleep(4000);
		selenium.click("id=edit-submit");//���������
		Thread.sleep(4000);
		AssertJUnit.assertTrue(selenium.isTextPresent("t1"));//�������� ���������� ��������
		selenium.click("link=������������� ��������");//������� �� ����� ���� "�������������� ���������"
		Thread.sleep(4000);
		selenium.click("//tr[4]/td[2]/a");//������� �� ������ �������������� ��������
		Thread.sleep(4000);
		selenium.type("id=edit-contact-first-name", "B1");//�������� ��� ��������
		selenium.click("id=edit-save");//���������
		Thread.sleep(4000);
		selenium.click("id=edit-submit");//���������
		Thread.sleep(4000);
	}
}