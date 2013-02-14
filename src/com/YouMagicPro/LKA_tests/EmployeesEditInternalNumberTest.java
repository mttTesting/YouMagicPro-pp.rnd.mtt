package com.YouMagicPro.LKA_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;


public class EmployeesEditInternalNumberTest extends TestBase{
	@Test
	public void employeesEditInternalNumberTest_C15254() {
		waitAdminPageToLoadSecondAccount();
		
		driver.findElement(By.xpath("//div[2]/div/div/div/span/a")).click();//нажимаем "настройки"
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.bContent__innerHeader")));//ожидание загрузки страницы
		
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a.bPopup__eClose.instructions-close")));//ожидание загрузки страницы
    	driver.findElement(By.cssSelector("a.bPopup__eClose.instructions-close")).click();
    	
    	try {
    		Thread.sleep(5000);
    	} catch (InterruptedException e) {
    		// TODO Auto-generated catch block
    		e.printStackTrace();
    	}
    	//driver.findElement(By.xpath("//td[2]/div/span")).click();
    	
		driver.findElement(By.xpath("//div[2]/a/div")).click();//нажимаем "Сотрудники"
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[3]/a/span")));//ожидание загрузки страницы
		
		driver.findElement(By.xpath("//div[2]/div[3]/a/span")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[2]/div[3]/a/span")));
		
		try {
    		Thread.sleep(5000);
    	} catch (InterruptedException e) {
    		// TODO Auto-generated catch block
    		e.printStackTrace();
    	}
		
		Assert.assertTrue(driver.findElement(By.id("edit-employee-extension")).getText() != null);
		
		driver.findElement(By.id("edit-employee-extension")).clear();
		driver.findElement(By.id("edit-employee-extension")).sendKeys("999");
		driver.findElement(By.xpath("//td[2]/input")).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[2]/div[3]/a/span")));
		}
}
