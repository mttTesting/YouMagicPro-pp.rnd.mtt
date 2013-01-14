package com.YouMagicPro.LKA_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class YourNumbersAddNewIInternalNumberTest extends TestBase {
	@Test
	public void yourNumbersAddNewIInternalNumberTest_C15293() {
	waitAdminPageToLoad();
	
	driver.findElement(By.xpath("//div[2]/div/div/div/span/a")).click();//нажимаем "настройки"
	driver.findElement(By.cssSelector("a.bPopup__eClose.instructions-close")).click();
	driver.findElement(By.xpath("//td[2]/div/span")).click();
	
	driver.findElement(By.xpath("//a/div")).click();
	//driver.findElement(By.cssSelector("a.bPopup__eClose.instructions-close")).click();
	driver.findElement(By.xpath("//td[2]/div/span")).click();
	
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[7]/span/a")));//ожидание загрузки страницы
	driver.findElement(By.xpath("//div[7]/span/a")).click();
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//form/div/div/div/span")));
	assertEquals(driver.findElement(By.xpath("//form/div/div/div/span")).getText(), "Купить внутренние номера");
	
	
	}
}