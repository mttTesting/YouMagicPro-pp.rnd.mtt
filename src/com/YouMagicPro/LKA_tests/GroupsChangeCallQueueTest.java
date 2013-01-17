package com.YouMagicPro.LKA_tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class GroupsChangeCallQueueTest extends TestBase {
	@Test
	public void groupsChangeCallQueueTest_C15193() {
	waitAdminPageToLoadSecondAccount();
	
	driver.findElement(By.xpath("//div[2]/div/div/div/span/a")).click();//нажимаем "настройки"
	driver.findElement(By.cssSelector("a.bPopup__eClose.instructions-close")).click();//закрываем всплывающие окна
	//driver.findElement(By.xpath("//td[2]/div/span")).click();
	
	driver.findElement(By.xpath("//div[3]/a/div")).click();//нажимаем "группы
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[7]/div/a/span")));//ждем загрузки страницы
	
	driver.findElement(By.xpath("//td[7]/div/a/span")).click();
	wait.until(ExpectedConditions.elementToBeClickable(By.id("edit-group-name")));//ждем загрузки страницы
	
	driver.findElement(By.xpath("//span/span/span")).click();
	driver.findElement(By.xpath("//div[@id='edit-hunt-sequence-wrapper']/span/ul/li[2]")).click();
	
	driver.findElement(By.id("edit-submit")).click();
	
	try {
		Thread.sleep(10000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	driver.findElement(By.xpath("//td[7]/div/a/span")).click();
	wait.until(ExpectedConditions.elementToBeClickable(By.id("edit-group-name")));//ждем загрузки страницы
	driver.findElement(By.xpath("//span/span/span")).click();
	driver.findElement(By.xpath("//div[@id='edit-hunt-sequence-wrapper']/span/ul/li[4]")).click();
	driver.findElement(By.id("edit-submit")).click();
	try {
		Thread.sleep(10000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}