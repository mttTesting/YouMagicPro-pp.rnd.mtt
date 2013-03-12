package com.YouMagicPro.LKM_tests;
import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class RegistrationVerificationTest extends TestBase{
	@Test
	public void registrationVerificationTest_C22621() {
		waitManagerPageToLoad();
	
		driver.findElement(By.xpath("//a[contains(@href, '/admin/manager-cabinet/business/contract-add')]")).click();//нажатие на вкладку ƒобавить нового клиента
		driver.findElement(By.id("edit-next")).click();//далее
		sleep();
		driver.findElement(By.id("edit-return")).click();//далее
		sleep();
		
		driver.findElement(By.xpath("//div[@id='result-wrapper-1']/div/ul/div/li/label/span")).click();//выбираем номер

		driver.findElement(By.xpath("//div[2]/div[2]/div/div/input")).click();
		sleep();
		driver.findElement(By.xpath("//input[@id='edit-personal-phone']")).sendKeys("11111111111");//вводим номер телефона
		driver.findElement(By.xpath("//div[2]/div/div[2]/a")).click();//нажатие на подтверждение смс-кода
		driver.findElement(By.xpath("//div[2]/div/div[2]/input")).sendKeys("1234");//вводим смс-код
		driver.findElement(By.xpath("//td/div/span")).click();//далее
		sleep();
	}
}
