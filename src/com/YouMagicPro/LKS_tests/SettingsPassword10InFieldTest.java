package com.YouMagicPro.LKS_tests;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;

public class SettingsPassword10InFieldTest extends TestBase{
	@Test
	public void settingsPassword10InFieldTest_C15292 () throws Exception {	 
		waitEmployeePageToLoad();

		driver.findElement(By.xpath("//a[contains(@href, '/private/my-office/nojs/settings')]")).click();
		sleep();//ожидание загрузки страницы
		driver.findElement(By.id("edit-user-password")).sendKeys("1234");//ввод старого парол€ 1234
		driver.findElement(By.id("edit-pass1")).sendKeys("123456789012345678900");//ввод нового 10-тизначного парол€
		driver.findElement(By.id("edit-pass2")).sendKeys("123456789012345678900");//подтверждение нового 10-тизначного парол€
		driver.findElement(By.id("edit-submit")).click();//сохранить
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[contains(@href, '/private/my-office/nojs/voicemail')]")).click();//переход на вкладку "√олосова€ почта"
		sleep();
		driver.findElement(By.xpath("//a[contains(@href, '/private/my-office/nojs/settings')]")).click();//переход на вкладку "Ќастройки"
		sleep();
		driver.findElement(By.id("edit-user-password")).sendKeys("123456789012345678900");//ввод старого 10-тизначного парол€
		driver.findElement(By.id("edit-pass1")).sendKeys("1234");//ввод нового парол€
		driver.findElement(By.id("edit-pass2")).sendKeys("1234");//подтверждение нового парол€
		driver.findElement(By.id("edit-submit")).click();//сохранить
		sleep();
	}
}