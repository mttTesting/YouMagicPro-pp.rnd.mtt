package com.YouMagicPro.LKM_tests;
import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class AgreementStatusTest extends TestBase{
	@Test
	public void agreementStatusTest_C22637() {
		waitManagerPageToLoad();
	
		driver.findElement(By.xpath("//a[contains(text(),'Статусы клиента')]")).click();
		sleep();
		driver.findElement(By.xpath("(//a[contains(text(),'Статусы клиента')])[2]")).click();
		sleep();
		
		assertEquals(driver.findElement(By.xpath("//tr[3]/td[2]/span")).getText(), "принято");
		assertEquals(driver.findElement(By.xpath("//tr[2]/td[2]/div/fieldset/div/div/table/tbody/tr[3]/td[2]/span")).getText(), "принято");
		
	}
}
