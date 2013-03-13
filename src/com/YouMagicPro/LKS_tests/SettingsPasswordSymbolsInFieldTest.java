package com.YouMagicPro.LKS_tests;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;

public class SettingsPasswordSymbolsInFieldTest extends TestBase{
	@Test
	public void settingsPasswordSymbolsInFieldTest_C15290 () throws Exception {	 
		waitEmployeePageToLoad();

		driver.findElement(By.xpath("//a[contains(@href, '/private/my-office/nojs/settings')]")).click();
		sleep();//�������� �������� ��������
		driver.findElement(By.id("edit-user-password")).sendKeys("1234");//���� ������� ������ 1234
		driver.findElement(By.id("edit-pass1")).sendKeys("q!@#");//���� �������� � ���� ����� ������
		driver.findElement(By.id("edit-pass2")).sendKeys("q!@#");//������������� ������
		driver.findElement(By.id("edit-submit")).click();//���������
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[contains(@href, '/private/my-office/nojs/voicemail')]")).click();//������� �� ������� "��������� �����"
		sleep();
		driver.findElement(By.xpath("//a[contains(@href, '/private/my-office/nojs/settings')]")).click();//������� �� ������� "���������"
		sleep();
		driver.findElement(By.id("edit-user-password")).sendKeys("q!@#");//���� �������� � ���� ����� ������� ������
		driver.findElement(By.id("edit-pass1")).sendKeys("1234");//���� ������ ������
		driver.findElement(By.id("edit-pass2")).sendKeys("1234");//������������� ������ ������
		driver.findElement(By.id("edit-submit")).click();//���������
		sleep();
	}
}