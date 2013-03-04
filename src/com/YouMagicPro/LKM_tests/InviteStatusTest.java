package com.YouMagicPro.LKM_tests;
import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class InviteStatusTest extends TestBase{
	@Test
	public void inviteStatusTest_C22641() {
		waitManagerPageToLoad();
	
		driver.findElement(By.xpath("//a[contains(text(),'Статусы клиента')]")).click();
		sleep();
		driver.findElement(By.xpath("(//a[contains(text(),'Статусы клиента')])[2]")).click();
		sleep();
		
		assertEquals(driver.findElement(By.xpath("//td[7]/a")).getText(), "Запросить инвайт");
		assertEquals(driver.findElement(By.xpath("//tr[2]/td[7]/a")).getText(), "Запросить инвайт");
		
	}
}
