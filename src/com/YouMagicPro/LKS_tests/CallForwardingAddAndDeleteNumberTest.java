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

		driver.findElement(By.xpath("//a[contains(@href, '/private/my-office/nojs/forwarding')]")).click();
		sleep();//ожидание загрузки страницы
		driver.findElement(By.id("edit-schedule-add-number")).click();
		sleep();
		driver.findElement(By.id("edit-schedule-1-followme-number")).clear();
		driver.findElement(By.id("edit-schedule-1-followme-number")).sendKeys("55555");
		driver.findElement(By.id("edit-save-forwarding")).click();
		sleep();
		assertEquals(driver.findElement(By.id("edit-schedule-1-followme-number")).getAttribute("value"), "55555");
		driver.findElement(By.id("edit-schedule-1-schedule-delete")).click();

	}
}
