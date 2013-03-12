package com.YouMagicPro.LKM_tests;
import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class TariffsOfClientsTest extends TestBase{
	@Test
	public void tariffsOfClientsTest_C22609() {
		waitManagerPageToLoad();
		
		assertEquals(driver.findElement(By.xpath("//td[3]")).getText(), "Бизнес IP. Минута");//находим на странице у первого и второго клиента тарифы и сверяем
		assertEquals(driver.findElement(By.xpath("//tr[2]/td[3]")).getText(), "Бизнес IP. Минута");
	}
}
