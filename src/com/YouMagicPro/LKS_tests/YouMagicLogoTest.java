package com.YouMagicPro.LKS_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

public class YouMagicLogoTest extends TestBase{
	@Test
	public void youMagicLogoTest_C15006 () throws Exception {	 
		waitEmployeePageToLoad();
		
		driver.findElement(By.xpath("//a[@href='http://umagicpro-pp.rnd.mtt']")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//table[@id='forward']/tbody/tr/td[2]/h3/a")));//ожидание загрузки страницы
		assertEquals(driver.findElement(By.xpath("//table[@id='forward']/tbody/tr/td[2]/h3/a")).getText(), "Прямой городской номер");
}
}
