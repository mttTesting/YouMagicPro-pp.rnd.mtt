package com.YouMagicPro.LKA_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;


public class EmployeesLimitsOfFundsTest extends TestBase{
	@Test
	public void employeesLimitsOfFundsTest_C15270() {
		waitAdminPageToLoadSecondAccount();
		
		driver.findElement(By.xpath("//div[2]/div/div/div/span/a")).click();//�������� "���������"
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.bContent__innerHeader")));//�������� �������� ��������
		
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a.bPopup__eClose.instructions-close")));//�������� �������� ��������
    	driver.findElement(By.cssSelector("a.bPopup__eClose.instructions-close")).click();
    	
    	try {
    		Thread.sleep(5000);
    	} catch (InterruptedException e) {
    		// TODO Auto-generated catch block
    		e.printStackTrace();
    	}
    	//driver.findElement(By.xpath("//td[2]/div/span")).click();
    	
		driver.findElement(By.xpath("//div[2]/a/div")).click();//�������� "����������"
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[3]/a/span")));//�������� �������� ��������
		
		driver.findElement(By.xpath("//div[2]/div[3]/a/span")).click();//�������� �� �������������� ����������
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[2]/div[3]/a/span")));
		
		try {
    		Thread.sleep(5000);
    	} catch (InterruptedException e) {
    		// TODO Auto-generated catch block
    		e.printStackTrace();
    	}
		driver.findElement(By.id("edit-credit-limit")).clear();
		driver.findElement(By.id("edit-credit-limit")).sendKeys("222");//������ ��������� �����
		
		driver.findElement(By.xpath("//td[2]/input")).click();//�������� "���������"
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[2]/div[3]/a/span")));//�������� �������� ��������
		}
}
