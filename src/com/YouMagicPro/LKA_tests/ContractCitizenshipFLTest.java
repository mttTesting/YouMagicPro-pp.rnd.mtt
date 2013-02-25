package com.YouMagicPro.LKA_tests;
import org.openqa.selenium.By;

import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ContractCitizenshipFLTest extends TestBase{
	    @Test
	    	public void contractCitizenshipFLTest_C32033() {  		
	    		waitContractPageToLoadThirdAccount();

	    		driver.findElement(By.cssSelector("b.trigger")).click();
	    		driver.findElement(By.cssSelector("li.selected.sel")).click();
	    		
	    	}
	}