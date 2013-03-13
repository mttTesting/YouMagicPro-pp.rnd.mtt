package com.YouMagicPro.LKS_tests;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;

public class SettingsPasswordSymbolsInFieldTest extends TestBase{
	@Test
	public void settingsPasswordSymbolsInFieldTest_C15290 () throws Exception {	 
		waitEmployeePageToLoad();

		driver.findElement(By.xpath("//a[contains(@href, '/private/my-office/nojs/settings')]")).click();
		sleep();//ожидание загрузки страницы
		driver.findElement(By.id("edit-user-password")).sendKeys("1234");//ввод старого пароля 1234
		driver.findElement(By.id("edit-pass1")).sendKeys("q!@#");//ввод символов в поле ввода пароля
		driver.findElement(By.id("edit-pass2")).sendKeys("q!@#");//подтверждение пароля
		driver.findElement(By.id("edit-submit")).click();//сохранить
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[contains(@href, '/private/my-office/nojs/voicemail')]")).click();//переход на вкладку "Голосовая почта"
		sleep();
		driver.findElement(By.xpath("//a[contains(@href, '/private/my-office/nojs/settings')]")).click();//переход на вкладку "Настройки"
		sleep();
		driver.findElement(By.id("edit-user-password")).sendKeys("q!@#");//ввод символов в поле ввода старого пароля
		driver.findElement(By.id("edit-pass1")).sendKeys("1234");//ввод нового пароля
		driver.findElement(By.id("edit-pass2")).sendKeys("1234");//подтверждение нового пароля
		driver.findElement(By.id("edit-submit")).click();//сохранить
		sleep();
	}
}