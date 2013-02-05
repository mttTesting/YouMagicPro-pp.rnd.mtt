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
	    		
	    		assertEquals(driver.findElement(By.xpath("//div[@id='account-charges']/div[2]/div/table[2]/tbody/tr[3]/td[2]/span")).getText(), "Мухин Вадим Николаевич");
	    		
	    		
	    		
	    	}

	}