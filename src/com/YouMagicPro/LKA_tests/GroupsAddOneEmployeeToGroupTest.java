package com.YouMagicPro.LKA_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class GroupsAddOneEmployeeToGroupTest extends TestBase {
	@Test
	public void groupsAddOneEmployeeToGroupTest_C25637_C26769() {
	waitAdminPageToLoadSecondAccount();
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[2]/div/div/div/span/a")));//ждем загрузки страницы
	driver.findElement(By.xpath("//div[2]/div/div/div/span/a")).click();//нажимаем "настройки"
	driver.findElement(By.cssSelector("a.bPopup__eClose.instructions-close")).click();//закрываем всплывающие окна
	//driver.findElement(By.xpath("//div[@id='instructionContent']/div/div[4]/a")).click();
	
	driver.findElement(By.xpath("//div[3]/a/div")).click();//нажимаем "группы
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a/div/span")));//ждем загрузки страницы
	
	driver.findElement(By.xpath("//td[5]/a/span")).click();
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[3]/div[2]/span[2]")));//ждем загрузки страницы
	driver.findElement(By.xpath("//div[3]/div[2]/span[2]")).click();//нажимаем на плюс, чтобы сотрудник переместился в группу
	driver.findElement(By.xpath("//div[2]/div[2]/span[2]")).click();//нажимаем на минус, чтобы сотрудник удалился из группы
	driver.findElement(By.xpath("//center/input")).click();//сабмит
	
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[2]/div/div/div/span/a")));//ждем загрузки страницы
	
	}
}