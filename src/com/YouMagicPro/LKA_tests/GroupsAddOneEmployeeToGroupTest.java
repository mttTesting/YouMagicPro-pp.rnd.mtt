package com.YouMagicPro.LKA_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class GroupsAddOneEmployeeToGroupTest extends TestBase {
	@Test
	public void groupsAddOneEmployeeToGroupTest_C25637_C26769() {
	waitAdminPageToLoad();
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[2]/div/div/div/span/a")));//���� �������� ��������
	driver.findElement(By.xpath("//div[2]/div/div/div/span/a")).click();//�������� "���������"
	driver.findElement(By.cssSelector("a.bPopup__eClose.instructions-close")).click();//��������� ����������� ����
	sleep();
	driver.findElement(By.xpath("//td[2]/div/span")).click();
	sleep();
	
	driver.findElement(By.xpath("//div[3]/a/div")).click();//�������� "������
	sleep();
	driver.findElement(By.xpath("//td[2]/div/span")).click();
	sleep();
	
	driver.findElement(By.xpath("//td[5]/a/span")).click();
	sleep();
	
	driver.findElement(By.xpath("//div[3]/div/span[2]")).click();//�������� �� ����, ����� ��������� ������������ � ������
	sleep();
	driver.findElement(By.xpath("//div[2]/div[2]/span[2]")).click();//�������� �� �����, ����� ��������� �������� �� ������
	driver.findElement(By.xpath("//center/input")).click();//������
	
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[2]/div/div/div/span/a")));//���� �������� ��������
	
	}
}