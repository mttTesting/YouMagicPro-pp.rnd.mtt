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
	    		driver.findElement(By.id("edit-buisness-form-contact-man-wrapper-contact-man")).sendKeys("Мухин1 Вадим1 Николаевич1");//изменяем ФИО
	    		
	    		driver.findElement(By.id("edit-submit")).click();//нажимаем 'сохранить'
	    		sleep();
	    		assertEquals(driver.findElement(By.xpath("//div[@id='account-charges']/div[2]/div/table[2]/tbody/tr[3]/td[2]/span")).getText(), "Мухин1 Вадим1 Николаевич1");//проверяем ФИО
	    		driver.findElement(By.xpath("//div[3]/div[2]/span/a")).click();//нажимаем "Оформить"
	    		sleep();
	    		driver.findElement(By.id("edit-buisness-form-contact-man-wrapper-contact-man")).clear();
	    		driver.findElement(By.id("edit-buisness-form-contact-man-wrapper-contact-man")).sendKeys("Мухин Вадим Николаевич");//изменяем ФИО
	    		driver.findElement(By.id("edit-submit")).click();//нажимаем 'сохранить'
	    		sleep();
	    	}

	}