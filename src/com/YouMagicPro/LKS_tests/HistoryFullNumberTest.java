package com.YouMagicPro.LKS_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;

public class HistoryFullNumberTest  extends TestBase{
	@Test
	public void historyFullNumberTest_C15177 () throws Exception {	 
		waitEmployeePageToLoad();

		driver.findElement(By.xpath("//a[contains(@href, '/private/my-office/nojs/history')]")).click();
		sleep();//ожидание загрузки страницы
		driver.findElement(By.id("edit-account-filter")).sendKeys("883140776013345");//вводим номер YouMagic для поиска
		sleep();
		driver.findElement(By.id("edit-submit")).click();//нажимаем Найти
		sleep();//ожидание загрузки страницы
		assertEquals(driver.findElement(By.xpath("//td[2]/span[2]")).getText(), "883140776013345");//проверяем наличие на странице номера
	}
}


