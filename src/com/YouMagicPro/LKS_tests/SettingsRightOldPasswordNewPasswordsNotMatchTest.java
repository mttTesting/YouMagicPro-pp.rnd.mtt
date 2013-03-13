package com.YouMagicPro.LKS_tests;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;

public class SettingsRightOldPasswordNewPasswordsNotMatchTest  extends TestBase{
	@Test
	public void SettingsRightOldPasswordNewPasswordsNotMatchTest_C15284 () throws Exception {	 
		waitEmployeePageToLoad();

		driver.findElement(By.xpath("//a[contains(@href, '/private/my-office/nojs/settings')]")).click();
		sleep();//ожидание загрузки страницы
		driver.findElement(By.id("edit-user-password")).sendKeys("1234");//ввод старого пароля 1234
		driver.findElement(By.id("edit-pass1")).sendKeys("123");//вводим несовпадающие пароли в поля пароля и подтверждения
		driver.findElement(By.id("edit-pass2")).sendKeys("1234");
		driver.findElement(By.id("edit-submit")).click();//сохраняем
		
		sleep();
		//проверяем, что вывелось предупреждение
		assertEquals(driver.findElement(By.cssSelector("div.errors_for_messages.error")).getText(), "Введенные пароли не совпадают");
	}
}