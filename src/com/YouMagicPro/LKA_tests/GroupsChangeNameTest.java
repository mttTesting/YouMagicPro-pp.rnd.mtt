package com.YouMagicPro.LKA_tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class GroupsChangeNameTest extends TestBase {
	@Test
	public void groupsChangeNameTest_C15191() {
	waitAdminPageToLoad();
	
	driver.findElement(By.xpath("//div[2]/div/div/div/span/a")).click();//нажимаем "настройки"
	driver.findElement(By.cssSelector("a.bPopup__eClose.instructions-close")).click();//закрываем всплывающие окна
	sleep();
	driver.findElement(By.xpath("//td[2]/div/span")).click();
	sleep();
	
	driver.findElement(By.xpath("//div[3]/a/div")).click();//нажимаем "группы
	sleep();
	//driver.findElement(By.xpath("//td[2]/div/span")).click();
	//sleep();
	
	driver.findElement(By.xpath("//td[7]/div/a/span")).click();
	wait.until(ExpectedConditions.elementToBeClickable(By.id("edit-group-name")));//ждем загрузки страницы
	
	driver.findElement(By.id("edit-group-name")).clear();
	driver.findElement(By.id("edit-group-name")).sendKeys("тест1");
	driver.findElement(By.id("edit-submit")).click();
	
	try {
		Thread.sleep(10000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	assertEquals(driver.findElement(By.xpath("//div[@id='bgroup_0']/div/table/tbody/tr/td[2]/span")).getText(), "тест1");
	
	driver.findElement(By.xpath("//td[7]/div/a/span")).click();
	wait.until(ExpectedConditions.elementToBeClickable(By.id("edit-group-name")));//ждем загрузки страницы
	driver.findElement(By.id("edit-group-name")).clear();
	driver.findElement(By.id("edit-group-name")).sendKeys("тест");
	driver.findElement(By.id("edit-submit")).click();
	try {
		Thread.sleep(10000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}