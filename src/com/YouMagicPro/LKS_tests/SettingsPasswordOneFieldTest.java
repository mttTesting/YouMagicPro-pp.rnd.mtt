package com.YouMagicPro.LKS_tests;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;

public class SettingsPasswordOneFieldTest  extends TestBase{
	@Test
	public void settingsPasswordOneFieldTest_C15288 () throws Exception {	 
		waitEmployeePageToLoad();

		driver.findElement(By.xpath("//a[contains(@href, '/private/my-office/nojs/settings')]")).click();
		sleep();//ожидание загрузки страницы
		driver.findElement(By.id("edit-user-password")).sendKeys("1234");
		driver.findElement(By.id("edit-pass1")).sendKeys("1");
		driver.findElement(By.id("edit-pass2")).sendKeys("1");
		driver.findElement(By.id("edit-submit")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[contains(@href, '/private/my-office/nojs/voicemail')]")).click();
		sleep();
		driver.findElement(By.xpath("//a[contains(@href, '/private/my-office/nojs/settings')]")).click();
		sleep();
		driver.findElement(By.id("edit-user-password")).sendKeys("1");
		driver.findElement(By.id("edit-pass1")).sendKeys("1234");
		driver.findElement(By.id("edit-pass2")).sendKeys("1234");
		driver.findElement(By.id("edit-submit")).click();
		sleep();
	}
}