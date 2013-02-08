package com.YouMagicPro.LKS_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;

public class PhoneSearchByNumbers  extends TestBase{
	@Test
	public void  phoneSearchByNumbers_C15337 () throws Exception {	 
		waitEmployeePageToLoad();

		driver.findElement(By.id("smallSearchInput")).sendKeys("333");
		sleep();
		assertEquals(driver.findElement(By.xpath("//div[@id='contacts-block-wrapper']/dl[3]/dd")).getText(), "x3 B1\n333");
	}
}
