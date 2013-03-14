package com.YouMagicPro.LKA_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class NotificationsCheckFieldsTest  extends TestBase{
	@Test
	public void notificationsCheckFieldsTest_C15142_C15143_C15144_C15145_C15146_C15148() {
		waitAdminPageToLoadSecondAccount();
		
		driver.findElement(By.xpath("//div[2]/div/div/div/span/a")).click();//нажимаем "настройки"
		
    	driver.findElement(By.cssSelector("a.bPopup__eClose.instructions-close")).click();//закрываем всплывающие окна

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[7]/a/div")));
		
		driver.findElement(By.xpath("//div[7]/a/div")).click();//нажимаем "уведомления"
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//form/div/div/div")));//ожидание загрузки страницы
		
		driver.findElement(By.xpath("//td/span")).click();//проставляем галочки
		driver.findElement(By.xpath("//tr[2]/td/span")).click();
		driver.findElement(By.xpath("//tr[3]/td/span")).click();
		driver.findElement(By.id("edit-balance-threshold")).sendKeys("100");//устанавливаем значение уведомления об остатке на счете на 100
		
		driver.findElement(By.id("edit-notification-save")).click();//нажимаем "сохранить"
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//form/div/div/div")));//ожидание загрузки страницы
		
		driver.findElement(By.id("edit-notification-save")).isDisplayed();
		driver.findElement(By.xpath("//div[7]/a/div")).click();//нажимаем "уведомления"
	}
}
