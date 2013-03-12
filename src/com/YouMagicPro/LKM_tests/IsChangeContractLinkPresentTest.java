package com.YouMagicPro.LKM_tests;
import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class IsChangeContractLinkPresentTest extends TestBase{
	@Test
	public void isChangeContractLinkPresentTest_C22605() {
		waitManagerPageToLoad();
		//проверяем, есть ли на странице ссылка на редактирование контракта
		driver.findElement(By.xpath("//td[5]/a")).isDisplayed();
		driver.findElement(By.xpath("//tr[2]/td[5]/a")).isDisplayed();
	}
}
