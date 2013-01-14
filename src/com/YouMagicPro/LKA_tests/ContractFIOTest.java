package com.YouMagicPro.LKA_tests;
import org.openqa.selenium.By;

import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ContractFIOTest  extends TestBase{
	    @Test
	    	public void ContractFIOTest_C14985() {  		
	    		waitContractPageToLoad();
	    		
	    		driver.findElement(By.id("edit-submit")).click();
	    		
	    		assertEquals(driver.findElement(By.cssSelector("div.bDocWrap > p > span.input")).getText(), "ФИО: Мухин Вадим Николаевич\nТел. +7 (985) 729-74-09\nE-mail b915966@rmqkr.net");
	    		
	    		
	    		
	    	}

	}