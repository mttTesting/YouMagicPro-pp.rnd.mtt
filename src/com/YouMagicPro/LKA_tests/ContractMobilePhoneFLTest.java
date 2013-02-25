package com.YouMagicPro.LKA_tests;
import org.openqa.selenium.By;

import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ContractMobilePhoneFLTest extends TestBase{
	    @Test
	    	public void contractMobilePhoneFLTest_C32031() {  		
	    		waitContractPageToLoadThirdAccount();
	    		
	    		driver.findElement(By.id("edit-surname")).clear();
	    
	    		driver.findElement(By.id("edit-middle-name")).sendKeys("131344");
	    	}

	}