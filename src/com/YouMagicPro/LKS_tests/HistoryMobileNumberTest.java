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
		driver.findElement(By.id("edit-account-filter")).sendKeys("79857297409");
		sleep();
		driver.findElement(By.id("edit-submit")).click();
		sleep();//ожидание загрузки страницы
		assertEquals(driver.findElement(By.xpath("//td[3]/span[2]")).getText(), "79857297409");
		assertEquals(driver.findElement(By.xpath("//td[4]")).getText(), "00:05");
	}
}


