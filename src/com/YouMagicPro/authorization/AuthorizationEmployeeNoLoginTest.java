package com.YouMagicPro.authorization;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;


public class AuthorizationEmployeeNoLoginTest extends TestBase{
			@Test
			public void authorizationEmployeeNoLoginTest_C14750() throws Exception {
				driver.get("http://umagicpro-pp.rnd.mtt/");
				
				driver.findElement(By.xpath("//span")).click();//нажимаем на ссылку Вход
				driver.switchTo().frame("iframe_autor");
				driver.findElement(By.xpath("//div[3]/a")).click();//переходим на вкладку Сотрудник
				
				
				driver.findElement(By.id("edit-pass-1")).sendKeys("1234");//вводим пароль 1234
				driver.findElement(By.id("edit-submit-1")).click();//нажимаем кнопку Войти
				
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//td/div/div")));//ожидание загрузки страницы
				assertEquals(driver.findElement(By.xpath("//td/div/div")).getText(), "Логин обязателен для заполнения");
			}
			
}
