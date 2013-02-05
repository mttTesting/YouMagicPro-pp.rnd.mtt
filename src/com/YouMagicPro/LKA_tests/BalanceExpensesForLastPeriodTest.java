package com.YouMagicPro.LKA_tests;
import org.openqa.selenium.By;

import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BalanceExpensesForLastPeriodTest extends TestBase{
	    @Test
	    	public void balanceExpensesForLastPeriodTest_C15092() {  		
	    		waitAdminPageToLoad();
	    
	    		assertEquals(driver.findElement(By.xpath("//tr[2]/td[2]/span")).getText(), "0");
	    	}

	}