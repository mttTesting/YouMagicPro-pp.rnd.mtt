package com.YouMagicPro.LKS_tests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import com.registration.tests.TestBaseReg;


public class PhoneFirstAndLastNamePresentTest extends TestBaseReg{
	@Test
	public void phoneFirstAndLastNamePresentTest_C15317 () throws Exception {	 
		openAndLoginLKS();
		AssertJUnit.assertTrue(selenium.isTextPresent("Тестовый Тест"));//проверка наличия текста "Тестовый Тест"
		
	}
}
