package com.YouMagicPro.LKA_tests;
import org.openqa.selenium.By;

import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ContractChangeFIOTest  extends TestBase{
	    @Test
	    	public void ContractChangeFIOTest_C29933() {  		
	    		waitContractPageToLoad();
	    		
	    		driver.findElement(By.id("edit-buisness-form-contact-man-wrapper-contact-man")).clear();
	    		driver.findElement(By.id("edit-buisness-form-contact-man-wrapper-contact-man")).sendKeys("�����1 �����1 ����������1");//�������� ���
	    		
	    		driver.findElement(By.id("edit-submit")).click();//�������� '���������'
	    		sleep();
	    		assertEquals(driver.findElement(By.xpath("//div[@id='account-charges']/div[2]/div/table[2]/tbody/tr[3]/td[2]/span")).getText(), "�����1 �����1 ����������1");//��������� ���
	    		driver.findElement(By.xpath("//div[3]/div[2]/span/a")).click();//�������� "��������"
	    		sleep();
	    		driver.findElement(By.id("edit-buisness-form-contact-man-wrapper-contact-man")).clear();
	    		driver.findElement(By.id("edit-buisness-form-contact-man-wrapper-contact-man")).sendKeys("����� ����� ����������");//�������� ���
	    		driver.findElement(By.id("edit-submit")).click();//�������� '���������'
	    		sleep();
	    	}

	}