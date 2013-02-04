package com.YouMagicPro.LKS_tests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import com.registration.tests.TestBaseReg;


public class VoiceMailPageTest  extends TestBaseReg{
	@Test
	public void voiceMailPageTest () throws Exception {	 
		openAndLoginLKS();
		AssertJUnit.assertTrue(selenium.isTextPresent("Голосовая почта"));//проверка наличия текста "Голосовая почта"
	}

}
