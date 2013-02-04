package com.YouMagicPro.LKS_tests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import com.registration.tests.TestBaseReg;


public class LogoTest  extends TestBaseReg{
	@Test
	public void  logoTest_C15010 () throws Exception {	 
		openAndLoginLKS();
		AssertJUnit.assertTrue(selenium.isElementPresent("css=img.imagecache.imagecache-customer-logo")); //проверка наличия элемента с лого на странице
	}
}
