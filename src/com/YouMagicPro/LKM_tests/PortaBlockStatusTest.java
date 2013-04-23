package com.YouMagicPro.LKM_tests;
import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class PortaBlockStatusTest extends TestBase{
	@Test
	public void portaBlockStatusTest_C22640() {
		waitManagerPageToLoad();
	
		driver.findElement(By.xpath("//a[contains(text(),'Статусы клиента')]")).click();//раскрытие вкладок со статусами
		sleep();
		driver.findElement(By.xpath("(//a[contains(text(),'Статусы клиента')])[2]")).click();//раскрытие вкладок со статусами
		sleep();
		
		assertEquals(driver.findElement(By.xpath("//tr[5]/td[2]/span")).getText(), "не блокирован");//проверка статуса клиента
		assertEquals(driver.findElement(By.xpath("//tr[2]/td[2]/div/fieldset/div/div/table/tbody/tr[5]/td[2]/span")).getText(), "не блокирован");//проверка статуса клиента
		
	}
}
