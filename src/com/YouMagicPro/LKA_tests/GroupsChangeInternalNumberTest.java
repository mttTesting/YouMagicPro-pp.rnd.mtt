package com.YouMagicPro.LKA_tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class GroupsChangeInternalNumberTest extends TestBase {
	@Test
	public void groupsChangeInternalNumberTest_C15192() {
	waitAdminPageToLoad();
	
	driver.findElement(By.xpath("//div[2]/div/div/div/span/a")).click();//нажимаем "настройки"
	driver.findElement(By.cssSelector("a.bPopup__eClose.instructions-close")).click();//закрываем всплывающие окна
	sleep();
	driver.findElement(By.xpath("//td[2]/div/span")).click();//закрываем всплывающие окна
	sleep();
	
	driver.findElement(By.xpath("//div[3]/a/div")).click();//нажимаем "группы
	sleep();

	driver.findElement(By.xpath("//td[7]/div/a/span")).click();//нажимаем на редактирование группы
	wait.until(ExpectedConditions.elementToBeClickable(By.id("edit-group-name")));//ждем загрузки страницы
	
	driver.findElement(By.id("edit-group-id")).clear();
	driver.findElement(By.id("edit-group-id")).sendKeys("126");//изменяем внутренний номер
	driver.findElement(By.id("edit-submit")).click();
	sleep();
	
	assertEquals(driver.findElement(By.xpath("//td[4]/div/span")).getText(), "6126");//проверяем, изменился ли внутренний номер пользователя
	
	driver.findElement(By.xpath("//td[7]/div/a/span")).click();//нажимаем на редактирование группы
	wait.until(ExpectedConditions.elementToBeClickable(By.id("edit-group-name")));//ждем загрузки страницы
	driver.findElement(By.id("edit-group-id")).clear();
	driver.findElement(By.id("edit-group-id")).sendKeys("127");//изменяем обратно внутренний номер
	driver.findElement(By.id("edit-submit")).click();//нажимаем 'сохранить'
	sleep();
	}
}