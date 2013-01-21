package com.YouMagicPro.LKA_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class GroupsMelodyTest extends TestBase {
	@Test
	public void groupsMelodyTest_C25634() {
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
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[6]/a/span")));//ждем загрузки страницы
	
	driver.findElement(By.xpath("//td[6]/a/span")).click(); //выбираем мелодию
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span/span/span")));
	driver.findElement(By.xpath("//span/span/span")).click();
	driver.findElement(By.xpath("//li[3]")).click();
	
	driver.findElement(By.xpath("//div[3]/input")).click();//нажимаем сохранить
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[6]/a/span")));//ждем загрузки страницы
	
	}
}