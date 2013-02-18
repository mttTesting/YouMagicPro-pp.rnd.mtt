package com.YouMagicPro.LKA_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class OrderToAdressNoTextFieldFilledTest  extends TestBase{
	@Test
	public void OrderToAdressNoTextFieldFilledTest_C25679() {
		waitAdminPageToLoadSecondAccount();
		
		driver.findElement(By.xpath("//div[6]/div[2]/span/a")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//td/div/label")));//ожидание загрузки страницы
		
		driver.findElement(By.xpath("//input[@id='edit-address-postcode']")).sendKeys("");
		driver.findElement(By.id("edit-address-street")).sendKeys("11111");
		driver.findElement(By.id("edit-address-house")).sendKeys("11111");
		driver.findElement(By.id("edit-address-apartment")).sendKeys("11111");
		driver.findElement(By.id("edit-address-city")).sendKeys("11111");
		
		
		driver.findElement(By.xpath("//form/div/div/div/div[3]/input")).click();//нажатие на "сохранить"
		sleep();
		assertEquals(driver.findElement(By.cssSelector("div.errors_for_messages.error")).getText(), "Поле Индекс обязательно к заполнению");//проверяем, вывелось ли предупреждение о незаполненных полях	
	}

}

