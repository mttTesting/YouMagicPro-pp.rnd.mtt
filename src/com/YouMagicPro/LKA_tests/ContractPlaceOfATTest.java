package com.YouMagicPro.LKA_tests;
import org.openqa.selenium.By;

import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ContractPlaceOfATTest  extends TestBase{
	    @Test
	    	public void contractPlaceOfATTest_C15060() {  		
	    		waitContractPageToLoad();
	    		
	    		driver.findElement(By.id("edit-submit")).click();
	    		
	    		
	    		assertEquals(driver.findElement(By.xpath("//tr[3]/th/span")).getText(), "Москва");
	    	}

	}