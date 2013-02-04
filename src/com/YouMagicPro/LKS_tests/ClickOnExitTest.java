package com.YouMagicPro.LKS_tests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;



public class ClickOnExitTest  extends TestBaseReg{
	@Test
	public void clickOnExitTest_C15007 () throws Exception {	 
		openAndLoginLKS();
		
		selenium.click("//span[3]/a"); //нажатие кнопки "Выход"
		selenium.waitForPageToLoad("30000");
		Thread.sleep(7000);
		AssertJUnit.assertTrue(selenium.isTextPresent("Полноценная виртуальная офисная АТС за несколько минут!"));//проверка наличия на странице текста "Полноценная виртуальная офисная АТС за несколько минут!"
	}

}