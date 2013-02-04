package com.YouMagicPro.LKS_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;

public class HistoryNotFullNumberTest  extends TestBase{
	@Test
	public void historyNotFullNumberTest_C15179 () throws Exception {	 
		waitEmployeePageToLoad();

		driver.findElement(By.xpath("//a[contains(@href, '/private/my-office/nojs/history')]")).click();
		sleep();//ожидание загрузки страницы
		driver.findElement(By.id("edit-account-filter")).sendKeys("88314");
		sleep();
		driver.findElement(By.id("edit-submit")).click();
		sleep();//ожидание загрузки страницы
		
		assertEquals(driver.findElement(By.xpath("//p")).getText(), "Нет данных");
	}
}


