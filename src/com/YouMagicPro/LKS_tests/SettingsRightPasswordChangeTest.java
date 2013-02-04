package com.YouMagicPro.LKS_tests;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;

public class SettingsRightPasswordChangeTest  extends TestBase{
	@Test
	public void settingsRightPasswordChangeTest_C15282 () throws Exception {	 
		waitEmployeePageToLoad();

		driver.findElement(By.xpath("//a[contains(@href, '/private/my-office/nojs/settings')]")).click();
		sleep();//�������� �������� ��������
		driver.findElement(By.id("edit-user-password")).sendKeys("1234");
		driver.findElement(By.id("edit-pass1")).sendKeys("1234");
		driver.findElement(By.id("edit-pass2")).sendKeys("1234");
		driver.findElement(By.id("edit-submit")).click();
		
		sleep();
		assertEquals(driver.findElement(By.cssSelector("div.messages.status")).getText(), "�������, ��� ������ ������� �������");
	}
}