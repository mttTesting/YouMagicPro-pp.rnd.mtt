package com.YouMagicPro.LKA_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BuyingAdditionalInternalNumberTest  extends TestBase{
	@Test
	public void buyingAdditionalInternalNumberTest_15115() {
		waitAdminPageToLoadSecondAccount();		
		driver.findElement(By.xpath("//tr[3]/td[3]/span/a")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[2]/input")));//ожидание загрузки страницы
		driver.findElement(By.xpath("//div[2]/input")).click();//выбор номера
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[4]/div/table/tbody/tr[3]/td[2]/span")));//ожидание загрузки страницы
		Assert.assertTrue(Integer.parseInt(driver.findElement(By.xpath("//div[4]/div/table/tbody/tr[3]/td[2]/span")).getText()) % 35.4 == 0);//проверяем абонплату
	}
}