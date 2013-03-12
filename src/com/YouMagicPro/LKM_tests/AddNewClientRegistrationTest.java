package com.YouMagicPro.LKM_tests;
import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class AddNewClientRegistrationTest extends TestBase{
	@Test
	public void addNewClientRegistrationTest_C23921_C23922() {
		waitManagerPageToLoad();
	
		driver.findElement(By.xpath("//a[contains(@href, '/admin/manager-cabinet/business/contract-add')]")).click();//нажатие на вкладку Добавить нового клиента
		driver.findElement(By.id("edit-next")).click();//далее
		sleep();
		driver.findElement(By.id("edit-return")).click();//далее
		sleep();
		
		assertEquals(driver.findElement(By.xpath("//td/div/div[2]/div")).getText(), "Внимание! Вы находитесь в режиме МТТ Бизнес.");//проверка, появилось ли предупреждение 
	}
}
