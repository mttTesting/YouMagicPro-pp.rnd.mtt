package com.YouMagicPro.LKA_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;


public class EmployeesEditPasswordTest extends TestBase{
	@Test
	public void employeesEditPasswordTest_C15265() {
		waitAdminPageToLoadSecondAccount();
		
		driver.findElement(By.xpath("//div[2]/div/div/div/span/a")).click();//�������� "���������"
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.bContent__innerHeader")));//�������� �������� ��������
		
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a.bPopup__eClose.instructions-close")));//�������� �������� ��������
    	driver.findElement(By.cssSelector("a.bPopup__eClose.instructions-close")).click();//��������� ����������� ����
    	
    	sleepSilent(5000);
    	
		driver.findElement(By.xpath("//div[2]/a/div")).click();//�������� "����������"
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[3]/a/span")));//�������� �������� ��������
		
		driver.findElement(By.xpath("//div[2]/div[3]/a/span")).click();//�������� �� �������������� ����������
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[2]/div[3]/a/span")));
		
		sleepSilent(5000);
		
		driver.findElement(By.id("edit-user-password")).clear();
		driver.findElement(By.id("edit-user-password")).sendKeys("1234");//������ ������
		driver.findElement(By.xpath("//td[2]/input")).click();//�������� "���������"
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[2]/div[3]/a/span")));//�������� �������� ��������
		}

	private void sleepSilent(int timeoutMs) {
		try {
    		Thread.sleep(timeoutMs);
    	} catch (InterruptedException e) {
    		// TODO Auto-generated catch block
    		e.printStackTrace();
    	}
	}
}
