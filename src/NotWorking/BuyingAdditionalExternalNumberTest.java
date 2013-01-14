package com.YouMagicPro.LKA_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BuyingAdditionalExternalNumberTest  extends TestBaseFF{
	@Test
	public void buyingAdditionalExternalNumberTest_C15107() {
		waitAdminPageToLoadSecondAccount();		
		driver.findElement(By.xpath("//tr[2]/td[3]/span/a")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[2]/div/div/div/ul/li/a")));//�������� �������� ��������
		driver.findElement(By.xpath("//li/label/span")).click();//����� ������
		driver.findElement(By.xpath("//li/label/input")).click();
		driver.findElement(By.xpath("//div[2]/input")).click();//������� ��
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[4]/div/table/tbody/tr[2]/td[2]/span")));//�������� �������� ��������
		Assert.assertTrue(Integer.parseInt(driver.findElement(By.xpath("//div[4]/div/table/tbody/tr[2]/td[2]/span")).getText()) % 134 == 0);//��������� ���������
		

	}
}