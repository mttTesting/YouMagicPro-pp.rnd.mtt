package com.YouMagicPro.LKM_tests;
import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class ExitFromLkmTest extends TestBase{
	@Test
	public void ExitFromLkmTest_C22618() {
		waitManagerPageToLoad();
	
		driver.findElement(By.xpath("//a[contains(@href, '/logout')]")).click();
		sleep();
		assertEquals(driver.findElement(By.cssSelector("div.copyright")).getText(), "© 2012 ОАО «Межрегиональный ТранзитТелеком»");
	}
}
