package com.YouMagicPro.mainPageTests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;



public class CheckForAvaliabilityNewsPageTest extends TestBaseReg{
	@Test
	public void  checkForAvaliabilityNewsPageTest() throws Exception {
		open();
		selenium.click("//h6[5]/a");//Переход по ссылке "Новости"
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("Новости"));
		
	}

}
