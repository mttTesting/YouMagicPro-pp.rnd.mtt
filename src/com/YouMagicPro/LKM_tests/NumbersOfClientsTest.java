package com.YouMagicPro.LKM_tests;
import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class NumbersOfClientsTest extends TestBase{
	@Test
	public void numbersOfClientsTest_C23924() {
		waitManagerPageToLoad();
		
		assertEquals(driver.findElement(By.xpath("//strong")).getText(), "#100437");//проверяем номера клиентов, первых двух
		assertEquals(driver.findElement(By.xpath("//tr[2]/td/strong")).getText(), "#100468");
	}
}
