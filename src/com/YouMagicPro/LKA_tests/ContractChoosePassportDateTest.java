package com.YouMagicPro.LKA_tests;
import org.openqa.selenium.By;

import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ContractChoosePassportDateTest extends TestBase{
	    @Test
	    	public void ontractChoosePassportDateTest_C32037() {  		
	    		waitContractPageToLoadThirdAccount();

	    		driver.findElement(By.id("edit-passport-when-issued-datepicker-popup-0")).click();
	    		sleep();
	    		driver.findElement(By.xpath("//tbody[3]/tr/td[2]/a/span")).click();
	    		sleep();
	    		driver.findElement(By.xpath("//td[2]/a/span")).click();
	    		sleep();
	    		driver.findElement(By.xpath("//tbody[2]/tr[2]/td[3]/a/span")).click();
	    		sleep();
	    	}
	}