package com.YouMagicPro.LKA_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class GroupsAddAndDeleteGroupTest extends TestBase {
	@Test
	public void groupsAddAndDeleteGroupTest_C15195C15186C25629() {
	waitAdminPageToLoadSecondAccount();
	
	driver.findElement(By.xpath("//div[2]/div/div/div/span/a")).click();//нажимаем "настройки"
	driver.findElement(By.cssSelector("a.bPopup__eClose.instructions-close")).click();//закрываем всплывающие окна
	//driver.findElement(By.xpath("//td[2]/div/span")).click();
	
	driver.findElement(By.xpath("//div[3]/a/div")).click();//нажимаем "группы
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a/div/span")));//ждем загрузки страницы
	driver.findElement(By.xpath("id('main_enter')/div[1]/a/div/span[1]")).click();

	
	wait.until(ExpectedConditions.elementToBeClickable(By.id("edit-group-name")));
	driver.findElement(By.id("edit-group-name")).sendKeys("Группа");//заполняем поля данных
	driver.findElement(By.id("edit-group-id")).sendKeys("123");
	driver.findElement(By.id("edit-capacity")).clear();
	driver.findElement(By.id("edit-capacity")).sendKeys("10");
	driver.findElement(By.id("edit-submit")).click();
	
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='bgroup_1']/div/table/tbody/tr/td[8]/div/a/span")));//ждем загрузку страницы
	driver.findElement(By.xpath("//div[@id='bgroup_1']/div/table/tbody/tr/td[8]/div/a/span")).click(); //удаляем группу
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//td/a/div/span")));//ждем загрузку страницы
	driver.findElement(By.xpath("//td/a/div/span")).click();
	
	}
}