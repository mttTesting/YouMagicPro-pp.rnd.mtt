package com.YouMagicPro.LKS_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;

public class CallForwardingAddAndDeleteNumberTest  extends TestBase{
	@Test
	public void callForwardingAddAndDeleteNumberTest_C15076_C15077 () throws Exception {	 
		waitEmployeePageToLoad();

		driver.findElement(By.xpath("//a[contains(@href, '/private/my-office/nojs/forwarding')]")).click();//заходим на вкладку Переадресация вызовов
		sleep();//ожидание загрузки страницы
		driver.findElement(By.id("edit-schedule-add-number")).click();//нажимаем на кнопку добавления номера переадресации
		sleep();
		driver.findElement(By.id("edit-schedule-1-followme-number")).clear();//очищаем поле ввода номера переадресации
		driver.findElement(By.id("edit-schedule-1-followme-number")).sendKeys("55555");//заполняем поле ввода номера переадресации
		driver.findElement(By.id("edit-save-forwarding")).click();//сохранить
		sleep();
		assertEquals(driver.findElement(By.id("edit-schedule-1-followme-number")).getAttribute("value"), "55555");//проверяем заполнено ли поле ввода номера переадресации
		driver.findElement(By.id("edit-schedule-1-schedule-delete")).click();//удаляем переадресацию

	}
}
