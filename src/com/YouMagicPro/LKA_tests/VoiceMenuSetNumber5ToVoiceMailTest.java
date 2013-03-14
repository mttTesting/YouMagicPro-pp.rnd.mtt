package com.YouMagicPro.LKA_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class VoiceMenuSetNumber5ToVoiceMailTest extends TestBase {
	@Test
	public void voiceMenuSetNumber5ToVoiceMailTest_C15345() {
	waitAdminPageToLoad();
	
	driver.findElement(By.xpath("//div[2]/div/div/div/span/a")).click();//нажимаем "настройки"
	wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.bContent__innerHeader")));//ожидание загрузки страницы
	
	wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a.bPopup__eClose.instructions-close")));//ожидание загрузки страницы
	driver.findElement(By.cssSelector("a.bPopup__eClose.instructions-close")).click();//закрываем всплывающие окна
	driver.findElement(By.xpath("//td[2]/div/span")).click();//закрываем всплывающие окна
	
	driver.findElement(By.xpath("//div[4]/a/div")).click();//нажимаем "голосовое меню"

	
	driver.findElement(By.xpath("//div[3]/div/a/span")).click();//нажатие "Добавить меню"
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div/label")));//ждем
	assertEquals(driver.findElement(By.xpath("//div/label")).getText(), "Название");//проверяем, открылось ли окно редактирования голосового меню
	
	driver.findElement(By.id("edit-ivr-name")).sendKeys("Меню");//заполняем название голосового меню
	
	driver.findElement(By.xpath("//div[@id='ivr-action-5']/span")).click();//нажимаем на кнопку "5"
	driver.findElement(By.xpath("//div[@id='edit-group-5-ivr-action-5-wrapper']/span/span/span")).click();//выбираем в выпадающем списке действий переадресацию на голосовую почту
	driver.findElement(By.xpath("//div[@id='edit-group-5-ivr-action-5-wrapper']/span/ul/li[6]")).click();
	
	
	sleep();
	driver.findElement(By.id("edit-submit")).click();//нажимаем "сохранить"
	sleep();
	driver.findElement(By.xpath("//a[2]/span")).click();//нажимаем на кнопку удаления меню
	driver.findElement(By.xpath("//a/div/span")).click();//подтверждаем удаление
	
	}
}