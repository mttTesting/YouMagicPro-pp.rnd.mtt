package com.YouMagicPro.LKA_tests;
import org.openqa.selenium.By;

import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BalanceMinimalSumTest extends TestBase{
	    @Test
	    	public void balanceMinimalSumTest_15095() {  		
	    		waitAdminPageToLoad();
	    
	    		assertEquals(driver.findElement(By.xpath("//tr[6]/td[2]/span")).getText(), "0");
	    	}

	}