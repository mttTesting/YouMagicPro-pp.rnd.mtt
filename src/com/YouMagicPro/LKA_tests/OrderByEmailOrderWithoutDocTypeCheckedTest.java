package com.YouMagicPro.LKA_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class OrderByEmailOrderWithoutDocTypeCheckedTest  extends TestBase{
	@Test
	public void orderByEmailOrderWithoutDocTypeCheckedTest_C25656() {
		waitAdminPageToLoadSecondAccount();
		
		driver.findElement(By.xpath("//div[6]/div[2]/span/a")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//td/div/label")));//ожидание загрузки страницы
		
		driver.findElement(By.xpath("//span/span/span")).click();//клик по выпадающему списку, выбор типа доставки - e-mail
		driver.findElement(By.xpath("//li[3]")).click();
		sleep();

		driver.findElement(By.xpath("//form/div/div/div/div/div/span")).click();//убираем галочки с типов документов
		driver.findElement(By.xpath("//div/div/div/div[2]/span")).click();
		driver.findElement(By.xpath("//form/div/div/div/div/div[3]/span")).click();
		driver.findElement(By.xpath("//div[4]/span")).click();
		driver.findElement(By.xpath("//div[5]/span")).click();
		sleep();

		/*
		driver.findElement(By.xpath("//input[@id='edit-address-postcode']")).sendKeys("11111");
		driver.findElement(By.id("edit-address-street")).sendKeys("11111");
		driver.findElement(By.id("edit-address-house")).sendKeys("11111");
		driver.findElement(By.id("edit-address-apartment")).sendKeys("11111");
		driver.findElement(By.id("edit-address-city")).sendKeys("11111");
		*/
		driver.findElement(By.xpath("//form/div/div/div/div[3]/input")).click();//нажатие на "сохранить"
		sleep();
		assertEquals(driver.findElement(By.xpath("//div/div/div[2]/div/div")).getText(), "Необходимо выбрать тип документа");
		
	}
}