package com.YouMagicPro.LKM_tests;
import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class AddNewClientRegistrationTest extends TestBase{
	@Test
	public void addNewClientRegistrationTest_C23921_C23922() {
		waitManagerPageToLoad();
	
		driver.findElement(By.xpath("//a[contains(@href, '/admin/manager-cabinet/business/contract-add')]")).click();
		driver.findElement(By.id("edit-submit")).click();
		
		assertEquals(driver.findElement(By.xpath("//td/div/div[2]/div")).getText(), "Внимание! Вы находитесь в режиме МТТ Бизнес.");
	}
}
