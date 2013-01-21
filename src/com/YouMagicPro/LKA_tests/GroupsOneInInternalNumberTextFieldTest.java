package com.YouMagicPro.LKA_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class GroupsOneInInternalNumberTextFieldTest extends TestBase {
	@Test
	public void groupsOneInInternalNumberTextFieldTest_C15188() {
	waitAdminPageToLoad();
	
	driver.findElement(By.xpath("//div[2]/div/div/div/span/a")).click();//нажимаем "настройки"
	driver.findElement(By.cssSelector("a.bPopup__eClose.instructions-close")).click();//закрываем всплывающие окна
	sleep();
	driver.findElement(By.xpath("//td[2]/div/span")).click();
	sleep();
	
	driver.findElement(By.xpath("//div[3]/a/div")).click();//нажимаем "группы
	sleep();
	driver.findElement(By.xpath("//td[2]/div/span")).click();
	sleep();
	driver.findElement(By.xpath("id('main_enter')/div[1]/a/div/span[1]")).click();

	
	wait.until(ExpectedConditions.elementToBeClickable(By.id("edit-group-name")));
	driver.findElement(By.id("edit-group-name")).sendKeys("Группа");//заполняем поля данных
	driver.findElement(By.id("edit-group-id")).sendKeys("1");

	driver.findElement(By.id("edit-submit")).click();
	
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div/div/div[2]/div/div")));//ждем загрузку страницы

	assertEquals(driver.findElement(By.cssSelector("div.errors_for_messages.error")).getText(), "Длина номера группы должна быть от 3 до 4 цифр.");//проверяем, вывелось ли предупреждение
	}
}