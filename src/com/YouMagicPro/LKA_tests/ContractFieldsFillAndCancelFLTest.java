package com.YouMagicPro.LKA_tests;
import org.openqa.selenium.By;

import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ContractFieldsFillAndCancelFLTest extends TestBase{
	    @Test
	    	public void contractFieldsFillAndCancelFLTest_C32047() {  		
	    		waitContractPageToLoadThirdAccount();
	    		
	    		driver.findElement(By.id("edit-surname")).clear();
	    		driver.findElement(By.id("edit-surname")).sendKeys("�����");
	    		driver.findElement(By.id("edit-name")).clear();
	    		driver.findElement(By.id("edit-name")).sendKeys("�����");
	    		driver.findElement(By.id("edit-middle-name")).clear();
	    		driver.findElement(By.id("edit-middle-name")).sendKeys("����������");
	    		
	    		driver.findElement(By.id("edit-passport-issuing-authority")).clear();
	    		driver.findElement(By.id("edit-passport-issuing-authority")).sendKeys("��� �. ������, ��. ������, ���� �1213");
	    		driver.findElement(By.id("edit-passport-registration-address")).clear();
	    		driver.findElement(By.id("edit-passport-registration-address")).sendKeys("������, ��. ������������, � 22");
	    		driver.findElement(By.id("edit-passport-series")).clear();
	    		driver.findElement(By.id("edit-passport-series")).sendKeys("4143");
	    		driver.findElement(By.id("edit-passport-number")).clear();
	    		driver.findElement(By.id("edit-passport-number")).sendKeys("131344");
	    		driver.findElement(By.id("edit-passport-birthplace")).clear();
	    		driver.findElement(By.id("edit-passport-birthplace")).sendKeys("������");
	
	    		sleep();
	    		driver.findElement(By.xpath("//input[@id='edit-submit']")).click();
	    		sleep();
	    		assertEquals(driver.findElement(By.cssSelector("div.section-title > h1")).getText(), "������� �� �������� ����� �����\n� 100341");
	    		
	    		driver.findElement(By.xpath("//div[@id='account-charges']/div[3]/div/a")).click();
	    		sleep();
	    	}

	}