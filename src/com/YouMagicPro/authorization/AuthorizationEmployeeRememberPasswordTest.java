package com.YouMagicPro.authorization;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;


public class AuthorizationEmployeeRememberPasswordTest extends TestBase{
			@Test
			public void authorizationNoPasswordTest_C14749() throws Exception {
				driver.get("http://umagicpro-pp.rnd.mtt/");
				
				driver.findElement(By.xpath("//span")).click();//нажимаем на ссылку Вход
				driver.switchTo().frame("iframe_autor");
				driver.findElement(By.xpath("//div[3]/a")).click();//переходим на вкладку Сотрудник

				driver.findElement(By.xpath("//td[2]/a")).click();//нажимаем кнопку Войти
				
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span")));//ожидание загрузки страницы
				assertEquals(driver.findElement(By.xpath("//span")).getText(), "Имя пользователя: *");
			}
			
}
