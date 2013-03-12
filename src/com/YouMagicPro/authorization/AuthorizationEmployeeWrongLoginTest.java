package com.YouMagicPro.authorization;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;


public class AuthorizationEmployeeWrongLoginTest extends TestBase{
			@Test
			public void authorizationWrongLoginTest_C14748() throws Exception {
				driver.get("http://umagicpro-pp.rnd.mtt/");
				
				driver.findElement(By.xpath("//span")).click();//нажимаем на ссылку Вход
				driver.switchTo().frame("iframe_autor");
				driver.findElement(By.xpath("//div[3]/a")).click();//переходим на вкладку Сотрудник
				
				driver.findElement(By.id("edit-name-1")).sendKeys("0776004151");//вводим логин
				driver.findElement(By.xpath("//tr[5]/td/div/div/input")).sendKeys("1234");//вводим пароль 1234
				driver.findElement(By.id("edit-submit-1")).click();//нажимаем кнопку Войти
				
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//td/div/div")));//ожидание загрузки страницы
				assertEquals(driver.findElement(By.xpath("//td/div/div")).getText(), "Логин или пароль введены неверно (восстановление пароля).");
			}
			
}
