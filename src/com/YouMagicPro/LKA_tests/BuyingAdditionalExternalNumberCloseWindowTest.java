package com.YouMagicPro.LKA_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BuyingAdditionalExternalNumberCloseWindowTest  extends TestBase{
	@Test
	public void BuyingAdditionalExternalNumberCloseWindowTest_C15110() {
		waitAdminPageToLoadSecondAccount();		
		driver.findElement(By.xpath("//tr[2]/td[3]/span/a")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[2]/div/a")));//ожидание загрузки страницы

		driver.findElement(By.xpath("//div[2]/div/a")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[3]/div/div[2]/div/div/div")));//ожидание загрузки страницы
		assertEquals(driver.findElement(By.xpath("//td[3]/div/div[2]/div/div/div")).getText(), "Баланс");
	}
}