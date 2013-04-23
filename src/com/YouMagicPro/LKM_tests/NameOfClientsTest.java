package com.YouMagicPro.LKM_tests;
import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class NameOfClientsTest extends TestBase{
	@Test
	public void nameOfClientsTest_C26770() {
		waitManagerPageToLoad();
		
		assertEquals(driver.findElement(By.xpath("//td[4]")).getText(), "ООО ООО Межрегиональный ТранзитТелеком");//проверяем названия фирм первых двух клиентов
		assertEquals(driver.findElement(By.xpath("//tr[2]/td[4]")).getText(), "ООО Вежливый Лось");
	}
}
