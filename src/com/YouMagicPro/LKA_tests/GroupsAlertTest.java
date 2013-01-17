package com.YouMagicPro.LKA_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class GroupsAlertTest extends TestBase {
	@Test
	public void groupsAlertTest_C15184() {
	waitAdminPageToLoad();
	
	driver.findElement(By.xpath("//div[2]/div/div/div/span/a")).click();//нажимаем "настройки"
	driver.findElement(By.cssSelector("a.bPopup__eClose.instructions-close")).click();//закрываем всплывающие окна
	driver.findElement(By.xpath("//td[2]/div/span")).click();
	
	driver.findElement(By.xpath("//div[3]/a/div")).click();//нажимаем "группы"

	
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//td/a/div/span")));//проверяем наличие эл-тов
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[2]/div/span")));

	}
}