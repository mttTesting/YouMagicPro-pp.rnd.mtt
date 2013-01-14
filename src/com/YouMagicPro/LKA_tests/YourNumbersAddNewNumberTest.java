package com.YouMagicPro.LKA_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class YourNumbersAddNewNumberTest extends TestBase {
	@Test
	public void yourNumbersAddNewNumberTest_C15293() {
	waitAdminPageToLoad();
	
	driver.findElement(By.xpath("//div[2]/div/div/div/span/a")).click();
	driver.findElement(By.cssSelector("a.bPopup__eClose.instructions-close")).click();
	driver.findElement(By.xpath("//td[2]/div/span")).click();
	
	driver.findElement(By.xpath("//a/div")).click();//нажимаем "настройки"
	//driver.findElement(By.cssSelector("a.bPopup__eClose.instructions-close")).click();
	driver.findElement(By.xpath("//td[2]/div/span")).click();
	
	wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("span.bSongFiles_AddFileText")));//ожидание загрузки страницы
	driver.findElement(By.xpath("//div[4]/div/a/span")).click();
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("id('central_content_form')/div[1]")));
	assertEquals(driver.findElement(By.xpath("id('central_content_form')/div[1]")).getText(), "Выбор номера");
	
	
	}
}