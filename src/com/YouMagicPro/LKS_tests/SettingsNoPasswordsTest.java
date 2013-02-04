package com.YouMagicPro.LKS_tests;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;

public class SettingsNoPasswordsTest  extends TestBase{
	@Test
	public void settingsNoPasswordsTest_C15283 () throws Exception {	 
		waitEmployeePageToLoad();

		driver.findElement(By.xpath("//a[contains(@href, '/private/my-office/nojs/settings')]")).click();
		sleep();//ожидание загрузки страницы
		driver.findElement(By.id("edit-user-password")).clear();
		driver.findElement(By.id("edit-pass1")).clear();
		driver.findElement(By.id("edit-pass2")).clear();
		driver.findElement(By.id("edit-submit")).click();
		
		sleep();
		assertEquals(driver.findElement(By.cssSelector("li")).getText(), "Поле \"старый пароль\" обязательно для заполнения");
	}
}