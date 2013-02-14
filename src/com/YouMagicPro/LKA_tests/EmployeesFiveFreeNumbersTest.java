package com.YouMagicPro.LKA_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;


public class EmployeesFiveFreeNumbersTest extends TestBase{
	@Test
	public void employeesFiveFreeNumbersTest_C15251() {
		waitAdminPageToLoad();
		
		driver.findElement(By.xpath("//div[2]/div/div/div/span/a")).click();//нажимаем "настройки"
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.bContent__innerHeader")));//ожидание загрузки страницы
		
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a.bPopup__eClose.instructions-close")));//ожидание загрузки страницы
    	driver.findElement(By.cssSelector("a.bPopup__eClose.instructions-close")).click();
    	driver.findElement(By.xpath("//td[2]/div/span")).click();
    	
		driver.findElement(By.xpath("//div[2]/a/div")).click();//нажимаем "Сотрудники"
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[3]/a/span")));//ожидание загрузки страницы
		//driver.findElement(By.xpath("//td[2]/div/span")).click();
		
		driver.findElement(By.xpath("//div[3]/div/div[2]")).click();
		driver.findElement(By.xpath("//div[@id='main_enter']/div/div[3]/div[2]")).click();
		driver.findElement(By.xpath("//div[@id='main_enter']/div/div[3]/div[3]")).click();
		driver.findElement(By.xpath("//div[@id='main_enter']/div/div[3]/div[4]")).click();
		driver.findElement(By.xpath("//div[@id='main_enter']/div/div[3]/div[5]")).click();
		
		}
}
