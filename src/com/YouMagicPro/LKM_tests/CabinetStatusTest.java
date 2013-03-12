package com.YouMagicPro.LKM_tests;
import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class CabinetStatusTest extends TestBase{
	@Test
	public void cabinetStatusTest_C22635() {
		waitManagerPageToLoad();
	
		driver.findElement(By.xpath("//a[contains(text(),'—татусы клиента')]")).click();//раскрытие вкладок со статусами
		sleep();
		driver.findElement(By.xpath("(//a[contains(text(),'—татусы клиента')])[2]")).click();//раскрытие вкладок со статусами
		sleep();
		assertEquals(driver.findElement(By.xpath("//td[2]/span")).getText(), "доступ отправлен");//проверка статуса клиента
		assertEquals(driver.findElement(By.xpath("//tr[2]/td[2]/div/fieldset/div/div/table/tbody/tr/td[2]")).getText(), "доступ отправлен");//проверка статуса клиента
		
	}
}
