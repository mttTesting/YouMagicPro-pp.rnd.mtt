package com.YouMagicPro.LKA_tests;
import org.openqa.selenium.By;

import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ContractSelectAttorneyDocumentDate extends TestBase{
	    @Test
	    	public void ContractSelectAttorneyDocumentDate_C14988() {  		
	    		waitContractPageToLoad();
	    		
	    		driver.findElement(By.xpath("//div[4]/div/div/div/input")).click();
	    		driver.findElement(By.xpath("//tbody[3]/tr[2]/td[3]/a")).click();
	    		driver.findElement(By.xpath("//td/a")).click();
	    		driver.findElement(By.xpath("//tbody[2]/tr[2]/td[3]/a")).click();
	    	}

	}