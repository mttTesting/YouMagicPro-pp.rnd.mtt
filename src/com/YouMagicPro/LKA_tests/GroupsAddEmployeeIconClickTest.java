package com.YouMagicPro.LKA_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class GroupsAddEmployeeIconClickTest extends TestBase {
	@Test
	public void groupsAddAndDeleteEmployeeTest_C25636() {
	waitAdminPageToLoad();
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[2]/div/div/div/span/a")));//���� �������� ��������
	driver.findElement(By.xpath("//div[2]/div/div/div/span/a")).click();//�������� "���������"
	driver.findElement(By.cssSelector("a.bPopup__eClose.instructions-close")).click();//��������� ����������� ����
	sleep();
	driver.findElement(By.xpath("//td[2]/div/span")).click();
	sleep();
	//
	driver.findElement(By.xpath("//div[3]/a/div")).click();//�������� "������
	sleep();
	//driver.findElement(By.xpath("//td[2]/div/span")).click();
	//sleep();
	
	driver.findElement(By.xpath("//td[5]/a/span")).click();
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[3]/div/div/div/span")));//���� �������� ��������
	
	}
}