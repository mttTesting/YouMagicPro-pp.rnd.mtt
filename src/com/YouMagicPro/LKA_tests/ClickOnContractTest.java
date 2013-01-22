package com.YouMagicPro.LKA_tests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;

public class ClickOnContractTest extends TestBaseReg{
	@Test
public void clickOnContractTest () throws Exception {	 
		openAndLogin();

		selenium.click("//div[5]/div[2]/span/a"); //Нажатие ссылки " Оформить"
		Thread.sleep(3000);
		AssertJUnit.assertTrue(selenium.isTextPresent("Организационно-правовая форма")); //Проверить, что на странице есть текст "Организационно-правовая форма"
	 }

}