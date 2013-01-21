package com.YouMagicPro.LKA_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class BlacklistChooseMainNumberTest extends TestBase {
	@Test
	public void BlacklistChooseMainNumberTest_C15149() {
	waitAdminPageToLoad();
	
	driver.findElement(By.xpath("//div[2]/div/div/div/span/a")).click();//нажимаем "настройки"
	wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.bContent__innerHeader")));//ожидание загрузки страницы
	
	wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a.bPopup__eClose.instructions-close")));//ожидание загрузки страницы
	driver.findElement(By.cssSelector("a.bPopup__eClose.instructions-close")).click();
	driver.findElement(By.xpath("//td[2]/div/span")).click();
	
	driver.findElement(By.xpath("//div[6]/a/div")).click();//нажимаем "Черный Список"
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//form/div/div/span")));//ожидание загрузки страницы
	driver.findElement(By.xpath("//td[2]/div/span")).click();
	
	
	driver.findElement(By.xpath("//div[@id='blacklist-items']/div/div/div/div/table/tbody/tr/td/span")).click();
	driver.findElement(By.xpath("//div[@id='blacklist-items']/div/div/div/div/table/tbody/tr/td/span")).click();
	
	}
}