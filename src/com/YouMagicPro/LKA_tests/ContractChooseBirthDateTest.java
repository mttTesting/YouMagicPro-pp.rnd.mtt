package com.YouMagicPro.LKA_tests;
import org.openqa.selenium.By;

import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ContractChooseBirthDateTest extends TestBase{
	    @Test
	    	public void contractChooseBirthDateTest_C32037() {  		
	    		waitContractPageToLoadThirdAccount();

	    		driver.findElement(By.id("edit-passport-birthday-datepicker-popup-0")).click();
	    		sleep();
	    		driver.findElement(By.xpath("//tbody[3]/tr[3]/td[4]/a/span")).click();
	    		sleep();
	    		driver.findElement(By.xpath("//tr[3]/td[4]/a/span")).click();
	    		sleep();
	    		driver.findElement(By.xpath("//tr[4]/td[6]/a/span")).click();
	    		sleep();
	    	}
	}