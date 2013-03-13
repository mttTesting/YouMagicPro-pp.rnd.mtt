package com.YouMagicPro.LKS_tests;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;

public class SettingsRightNoOldPasswordNewPasswordsMatchTest  extends TestBase{
	@Test
	public void settingsRightNoOldPasswordNewPasswordsMatchTest_C15286 () throws Exception {	 
		waitEmployeePageToLoad();

		driver.findElement(By.xpath("//a[contains(@href, '/private/my-office/nojs/settings')]")).click();
		sleep();//ожидание загрузки страницы
		driver.findElement(By.id("edit-user-password")).clear();//очищаем поле ввода парол€
		driver.findElement(By.id("edit-pass1")).sendKeys("1234");//ввод и подтверждение нового парол€
		driver.findElement(By.id("edit-pass2")).sendKeys("1234");
		driver.findElement(By.id("edit-submit")).click();//сохран€ем
		
		sleep();
		//провер€ем, что вывелось предупреждение
		assertEquals(driver.findElement(By.cssSelector("div.errors_for_messages.error")).getText(), "ѕоле —тарый пароль об€зательно к заполнению");
	}
}