package com.YouMagicPro.LKM_tests;
import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class CabinetStatusTest extends TestBase{
	@Test
	public void cabinetStatusTest_C22635() {
		waitManagerPageToLoad();
	
		driver.findElement(By.xpath("//a[contains(text(),'Статусы клиента')]")).click();
		sleep();
		driver.findElement(By.xpath("(//a[contains(text(),'Статусы клиента')])[2]")).click();
		sleep();
		assertEquals(driver.findElement(By.xpath("//td[2]/span")).getText(), "доступ отправлен");
		assertEquals(driver.findElement(By.xpath("//tr[2]/td[2]/div/fieldset/div/div/table/tbody/tr/td[2]")).getText(), "доступ отправлен");
		
	}
}
