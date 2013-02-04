package com.YouMagicPro.LKS_tests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import com.registration.tests.TestBaseReg;


public class PhonePostPresentTest extends TestBaseReg{
	@Test
	public void phonePostPresentTest_C15318 () throws Exception {	 
		openAndLoginLKS();
		AssertJUnit.assertTrue(selenium.isTextPresent("Инженер"));//проверка наличия текста "Инженер"
	}
}