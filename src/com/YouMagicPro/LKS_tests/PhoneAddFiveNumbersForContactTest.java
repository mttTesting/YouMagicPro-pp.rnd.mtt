package com.YouMagicPro.LKS_tests;

import org.testng.annotations.Test;
import com.registration.tests.TestBaseReg;


public class PhoneAddFiveNumbersForContactTest extends TestBaseReg{
	@Test
	public void  phoneAddFiveNumbersForContactTest_C15316_C15320_C15319() throws Exception {	 
		openAndLoginLKS();
		selenium.click("//div[4]/nobr/a");
		Thread.sleep(4000);
		selenium.click("//tr[6]/td[2]/a");
		Thread.sleep(4000);
		selenium.type("id=edit-contact-telephone1", "001");
		selenium.type("id=edit-contact-telephone2", "002");
		selenium.type("id=edit-contact-telephone3", "003");
		selenium.type("id=edit-contact-telephone4", "004");
		selenium.type("id=edit-contact-telephone5", "005");
		selenium.click("//input[@id='edit-save']");
		Thread.sleep(3000);
		selenium.click("//tr[6]/td[2]/a");
		Thread.sleep(3000);
		selenium.type("id=edit-contact-telephone1", "1");
		selenium.type("id=edit-contact-telephone5", "");
		selenium.type("id=edit-contact-telephone4", "");
		selenium.type("id=edit-contact-telephone3", "");
		selenium.type("id=edit-contact-telephone2", "");
		selenium.click("//input[@id='edit-save']");
		Thread.sleep(3000);
		selenium.click("//form[@id='umagicpro-contacts-edit-area-form']/div/div/div[4]/input");
		Thread.sleep(3000);
	}
}