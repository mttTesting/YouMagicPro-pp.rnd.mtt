package com.YouMagicPro.LKS_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;

public class CallForwardingNoCallForwardingButtonsTest  extends TestBase{
	@Test
	public void CallForwardingNoCallForwardingButtonsTest_C15035_C15036 () throws Exception {	 
		waitEmployeePageToLoad();

		driver.findElement(By.xpath("//a[contains(@href, '/private/my-office/nojs/forwarding')]")).click();//заходим на вкладку Переадресация вызовов
		sleep();//ожидание загрузки страницы
		driver.findElement(By.xpath("//div[@id='schedule-global-wrapper']/div[4]/div/input")).click();//нажимаем кнопку Сохранить
		sleep();//ожидание загрузки страницы
		driver.findElement(By.xpath("//div[@id='schedule-global-wrapper']/div[4]/div[2]/input")).click();//нажимаем кнопку Отменить
	}
}
