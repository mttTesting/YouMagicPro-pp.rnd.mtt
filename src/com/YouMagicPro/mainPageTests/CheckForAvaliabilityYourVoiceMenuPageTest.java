package com.YouMagicPro.mainPageTests;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;

import com.registration.tests.TestBaseReg;


public class CheckForAvaliabilityYourVoiceMenuPageTest extends TestBaseReg{
	@Test
	public void  checkForAvaliabilityYourVoiceMenuPageTest() throws Exception {
		open();
		selenium.click("//li[3]/ul/li[4]/a");//������� �� ������ ������������� (Follow me)
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertTrue(selenium.isTextPresent("������������� (Follow me)"));

	}

}
