package com.YouMagicPro.LKS_tests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import com.registration.tests.TestBaseReg;


public class WelcomeTest extends TestBaseReg{
	@Test
	public void welcomeTest_C15008 () throws Exception {	 
		openAndLoginLKS();
		AssertJUnit.assertTrue(selenium.isTextPresent("Добро пожаловать"));//проверка наличия текста "Добро пожаловать"
	}
}