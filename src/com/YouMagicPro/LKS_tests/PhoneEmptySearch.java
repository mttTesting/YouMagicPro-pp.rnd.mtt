package com.YouMagicPro.LKS_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;

public class PhoneEmptySearch  extends TestBase{
	@Test
	public void  phoneEmptySearch_C15339 () throws Exception {	 
		waitEmployeePageToLoad();

		driver.findElement(By.id("smallSearchInput")).sendKeys("");
		sleep();
		assertEquals(driver.findElement(By.xpath("//div[@id='contacts-block-wrapper']/dl[2]/dd")).getText(), "x3 B1\n333");
	}
}
