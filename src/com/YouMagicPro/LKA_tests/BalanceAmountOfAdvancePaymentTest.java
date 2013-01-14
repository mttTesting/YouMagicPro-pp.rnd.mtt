package com.YouMagicPro.LKA_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class BalanceAmountOfAdvancePaymentTest  extends TestBase{
	@Test
	public void balanceAmountOfAdvancePaymentTest_C15091() {
		waitAdminPageToLoad();
		
		assertEquals(driver.findElement(By.cssSelector("span.tProperty__value")).getText(), "354");
	}	
}