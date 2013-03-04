package com.YouMagicPro.LKM_tests;
import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class RegistrationVerificationTest extends TestBase{
	@Test
	public void registrationVerificationTest_C22621() {
		waitManagerPageToLoad();
	
		driver.findElement(By.xpath("//a[contains(@href, '/admin/manager-cabinet/business/contract-add')]")).click();
		driver.findElement(By.id("edit-submit")).click();
		sleep();
		
		driver.findElement(By.xpath("//div[@id='result-wrapper-1']/div/ul/div/li/label/span")).click();
		//driver.findElement(By.xpath("//label/input")).click();
		driver.findElement(By.xpath("//div[2]/div[2]/div/div/input")).click();
		sleep();
		driver.findElement(By.xpath("//input[@id='edit-personal-phone']")).sendKeys("11111111111");
		driver.findElement(By.xpath("//div[2]/div/div[2]/a")).click();
		driver.findElement(By.xpath("//div[2]/div/div[2]/input")).sendKeys("1234");
		driver.findElement(By.xpath("//td/div/span")).click();
		sleep();
	}
}
