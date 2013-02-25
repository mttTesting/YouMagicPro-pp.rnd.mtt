package com.YouMagicPro.LKA_tests;
import org.openqa.selenium.By;

import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ContractMobileNumberFLTest extends TestBase{
	    @Test
	    	public void contractMobileNumberFLTest_C32032() {  		
	    		waitContractPageToLoadThirdAccount();
	    		
	    		driver.findElement(By.id("edit-personal-phone")).clear();
	    		driver.findElement(By.id("edit-personal-phone")).sendKeys("79857297409");
	    		driver.findElement(By.xpath("//div[2]/div/div[2]/a")).click();
	    		sleep();
	    		driver.findElement(By.xpath("//div[@id='mConfirmPhone-edit-personal-phone']/div[2]/div/div[2]/input")).sendKeys("1234");
	    		driver.findElement(By.xpath("//div[@id='mConfirmPhone-edit-personal-phone']/div[2]/div[2]/table/tbody/tr/td/div/span")).click();
	    		sleep();
	    		driver.findElement(By.id("edit-personal-phone")).clear();
	    		driver.findElement(By.id("edit-personal-phone")).sendKeys("89857297409");
	    		driver.findElement(By.xpath("//div[2]/div/div[2]/a")).click();
	    		sleep();
	    		driver.findElement(By.xpath("//div[@id='mConfirmPhone-edit-personal-phone']/div[2]/div/div[2]/input")).sendKeys("1234");
	    		driver.findElement(By.xpath("//div[@id='mConfirmPhone-edit-personal-phone']/div[2]/div[2]/table/tbody/tr/td/div/span")).click();
	    		sleep();
	    	}

	}