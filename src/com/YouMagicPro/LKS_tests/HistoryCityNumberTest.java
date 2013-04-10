package com.YouMagicPro.LKS_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;

public class HistoryCityNumberTest  extends TestBase{
	@Test
	public void historyCityNumberTest_C15275 () throws Exception {	 
		waitEmployeePageToLoad();

		driver.findElement(By.xpath("//a[contains(@href, '/private/my-office/nojs/history')]")).click();//��������� �������
		sleep();//�������� �������� ��������
		
		driver.findElement(By.xpath("//td/div/div/div/input")).click();
		driver.findElement(By.xpath("//tbody[3]/tr/td[2]/a/span")).click();
		driver.findElement(By.xpath("//td[2]/a/span")).click();
		driver.findElement(By.xpath("//tbody[2]/tr[2]/td[3]/a/span")).click();
		sleep();
		driver.findElement(By.id("edit-to-date-datepicker-popup-0")).click();
		sleep();//�������� �������� ��������
		driver.findElement(By.id("edit-account-filter")).sendKeys("74997090101");//������ ����� ��� ������
		sleep();
		driver.findElement(By.id("edit-submit")).click();//�������� �����
		sleep();//�������� �������� ��������
		assertEquals(driver.findElement(By.xpath("//td[2]/span[2]")).getText(), "74997090101");//��������� ������� �� �������� ������
	}
}


