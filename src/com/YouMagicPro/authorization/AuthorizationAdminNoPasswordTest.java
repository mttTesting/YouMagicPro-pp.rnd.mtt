package com.YouMagicPro.authorization;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;


public class AuthorizationAdminNoPasswordTest extends TestBase{
			@Test
			public void authorizationNoPasswordTest_C14707() throws Exception {
				driver.get("http://umagicpro-pp.rnd.mtt/");
				
				driver.findElement(By.xpath("//span")).click();//нажимаем на ссылку Вход
				driver.switchTo().frame("iframe_autor");
				
				driver.findElement(By.id("edit-name-1")).sendKeys("100126");//вводим логин
				driver.findElement(By.id("edit-submit-1")).click();//нажимаем кнопку Войти
				
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li")));//ожидание загрузки страницы
				assertEquals(driver.findElement(By.xpath("//li")).getText(), "Пароль обязателен для заполнения");
			}
			
}
