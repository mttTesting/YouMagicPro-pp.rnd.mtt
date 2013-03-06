package com.YouMagicPro.LKM_tests;
import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class RegistrationAccTypeCheckTest extends TestBase{
	@Test
	public void registrationAccTypeCheckTest_C32018() {
		waitManagerPageToLoad();
	
		driver.findElement(By.xpath("//a[contains(@href, '/admin/manager-cabinet/business/contract-add')]")).click();
		driver.findElement(By.id("edit-next")).click();
		sleep();
		driver.findElement(By.id("edit-return")).click();
		sleep();
		
		driver.findElement(By.xpath("//div[@id='result-wrapper-1']/div/ul/div/li/label/span")).click();
		//driver.findElement(By.xpath("//label/input")).click();
		driver.findElement(By.xpath("//div[2]/div[2]/div/div/input")).click();
		sleep();
		
		
		driver.findElement(By.xpath("//span/span/span")).click();
		driver.findElement(By.xpath("//li[2]")).click();
		driver.findElement(By.xpath("//span/span/span")).click();
		driver.findElement(By.xpath("//li")).click();

	}
}
