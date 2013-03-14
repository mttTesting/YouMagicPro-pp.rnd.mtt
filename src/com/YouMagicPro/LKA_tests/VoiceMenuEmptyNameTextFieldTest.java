package com.YouMagicPro.LKA_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class VoiceMenuEmptyNameTextFieldTest extends TestBase {
	@Test
	public void voiceMailEmptyNameTextFieldTest_C19851() {
	waitAdminPageToLoad();
	
	driver.findElement(By.xpath("//div[2]/div/div/div/span/a")).click();//нажимаем "настройки"
	wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.bContent__innerHeader")));//ожидание загрузки страницы
	
	wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a.bPopup__eClose.instructions-close")));//ожидание загрузки страницы
	driver.findElement(By.cssSelector("a.bPopup__eClose.instructions-close")).click();//закрываем всплывающие окна
	driver.findElement(By.xpath("//td[2]/div/span")).click();//закрываем всплывающие окна
	
	driver.findElement(By.xpath("//div[4]/a/div")).click();//нажимаем "голосовое меню"
	

	driver.findElement(By.xpath("//div[3]/div/a/span")).click();//нажатие "Добавить меню"
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div/label")));//ждем
	
	driver.findElement(By.id("edit-submit")).click();//нажимаем "сохранить"
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div/div/div[2]/div/div/div/div")));
	
	//проверяем, появилось ли предупреждение:
	assertEquals(driver.findElement(By.xpath("//div/div/div[2]/div/div/div/div")).getText(), "Название меню обязательно для заполнения.");
	}
}