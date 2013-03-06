package com.YouMagicPro.LKM_tests;
import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class PortaBlockStatusTest extends TestBase{
	@Test
	public void portaBlockStatusTest_C22640() {
		waitManagerPageToLoad();
	
		driver.findElement(By.xpath("//a[contains(text(),'Статусы клиента')]")).click();
		sleep();
		driver.findElement(By.xpath("(//a[contains(text(),'Статусы клиента')])[2]")).click();
		sleep();
		
		assertEquals(driver.findElement(By.xpath("//tr[5]/td[2]/span")).getText(), "блокирован");
		assertEquals(driver.findElement(By.xpath("//tr[2]/td[2]/div/fieldset/div/div/table/tbody/tr[5]/td[2]/span")).getText(), "блокирован");
		
	}
}
