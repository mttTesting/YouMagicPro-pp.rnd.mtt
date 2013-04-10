package com.YouMagicPro.LKS_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;

public class HistoryMobileNumberTest  extends TestBase{
	@Test
	public void historyMobileNumberTest_C15274_C15174 () throws Exception {	 
		waitEmployeePageToLoad();

		driver.findElement(By.xpath("//a[contains(@href, '/private/my-office/nojs/history')]")).click();
		sleep();//ожидание загрузки страницы
		driver.findElement(By.xpath("//td/div/div/div/input")).click();
		driver.findElement(By.xpath("//tbody[3]/tr/td[2]/a/span")).click();
		driver.findElement(By.xpath("//td[2]/a/span")).click();
		driver.findElement(By.xpath("//tbody[2]/tr[2]/td[3]/a/span")).click();
		sleep();
		driver.findElement(By.id("edit-to-date-datepicker-popup-0")).click();
		sleep();//ожидание загрузки страницы
		
		
		
		
		driver.findElement(By.id("edit-account-filter")).sendKeys("79857297409");//вводим номер для поиска
		sleep();
		driver.findElement(By.id("edit-submit")).click();//нажимаем Найти
		sleep();//ожидание загрузки страницы
		assertEquals(driver.findElement(By.xpath("//td[2]/span[2]")).getText(), "79857297409");//проверяем наличие на странице номера
	}
}


