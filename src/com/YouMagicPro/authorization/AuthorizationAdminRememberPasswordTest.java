package com.YouMagicPro.authorization;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;


public class AuthorizationAdminRememberPasswordTest extends TestBase{
			@Test
			public void authorizationNoPasswordTest_C14712() throws Exception {
				driver.get("http://umagicpro-pp.rnd.mtt/");
				
				driver.findElement(By.xpath("//span")).click();//нажимаем на ссылку ¬ход
				driver.switchTo().frame("iframe_autor");

				driver.findElement(By.xpath("//td[2]/a")).click();//нажимаем Ќапомнить пароль
				
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span")));//ожидание загрузки страницы
				assertEquals(driver.findElement(By.xpath("//span")).getText(), "Ќомер лицевого счета или адрес e-mail: *");
			}
			
}
