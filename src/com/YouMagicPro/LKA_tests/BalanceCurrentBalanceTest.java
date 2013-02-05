package com.YouMagicPro.LKA_tests;
import org.openqa.selenium.By;

import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BalanceCurrentBalanceTest extends TestBase{
	    @Test
	    	public void balanceCurrentBalanceTest_15093() {  		
	    		waitAdminPageToLoad();
	    
	    		assertEquals(driver.findElement(By.xpath("//tr[4]/td[2]/span")).getText(), "606.22");
	    	}

	}