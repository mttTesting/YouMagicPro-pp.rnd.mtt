package com.YouMagicPro.LKA_tests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;

public class YourNumbersTest  extends TestBaseReg{
	@Test
	public void yourNumbersTest() throws Exception {
		openAndLogin();
	
		selenium.click("link=Настройки");// Переход в меню "Настройки"
		Thread.sleep(8000);
		
		AssertJUnit.assertTrue(selenium.isElementPresent("id=bFilesFind_button_text"));
		
	}
}
