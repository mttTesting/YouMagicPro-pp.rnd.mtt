package com.YouMagicPro.LKS_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;

public class PhoneIncorrectSearch  extends TestBase{
	@Test
	public void  phoneIncorrectSearch_C15340 () throws Exception {	 
		waitEmployeePageToLoad();

		driver.findElement(By.id("smallSearchInput")).sendKeys("!@");
		sleep();
		assertEquals(driver.findElement(By.xpath("//div[@id='contacts-block-wrapper']/dl[2]/dd")).getText(), "www x1\n111");
	}
}