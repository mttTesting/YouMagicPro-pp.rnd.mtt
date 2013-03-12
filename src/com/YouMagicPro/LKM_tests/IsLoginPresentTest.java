package com.YouMagicPro.LKM_tests;
import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class IsLoginPresentTest extends TestBase{
	@Test
	public void isLoginPresentTest_C22618() {
		waitManagerPageToLoad();
		
		//проверяем, можно ли выйти из аккаунта
		assertEquals(driver.findElement(By.xpath("//a[contains(@href, '/logout')]")).getText(), "Log out mtt-business-test");
	}
}
