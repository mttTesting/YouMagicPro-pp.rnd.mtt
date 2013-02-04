package com.YouMagicPro.LKS_tests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import com.registration.tests.TestBaseReg;


public class PhoneEmptyNumberCallTest  extends TestBaseReg{
	@Test
	public void phoneEmptyNumberCallTest_C15313 () throws Exception {	 
		openAndLoginLKS();
		selenium.click("css=div.mWp__call");
		sleep();
		AssertJUnit.assertTrue(selenium.isTextPresent("Неправильно набран номер"));
	}
}