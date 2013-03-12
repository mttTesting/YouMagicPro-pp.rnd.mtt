package com.YouMagicPro.LKM_tests;
import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class IsAddNewClientButtonPresentTest extends TestBase{
	@Test
	public void isAddNewClientButtonPresentTest_C23923() {
		waitManagerPageToLoad();
		//проверяем, есть ли на странице ссылка на добавление клиента
		driver.findElement(By.xpath("//a[contains(@href, '/admin/manager-cabinet/business/contract-add')]")).isDisplayed();
	}
}
