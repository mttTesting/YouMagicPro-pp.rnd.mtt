package com.YouMagicPro.authorization;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;


public class AuthorizationEmployeeWrongPasswordTest extends TestBase{
			@Test
			public void authorizationWrongPasswordTestC14751() throws Exception {
				driver.get("http://umagicpro-pp.rnd.mtt/");
				
				driver.findElement(By.xpath("//span")).click();//�������� �� ������ ����
				driver.switchTo().frame("iframe_autor");
				driver.findElement(By.xpath("//div[3]/a")).click();//��������� �� ������� ���������
				
				driver.findElement(By.id("edit-name-1")).sendKeys("12");//������ �����
				driver.findElement(By.xpath("//tr[5]/td/div/div/input")).sendKeys("1234");//������ ������ 1234
				driver.findElement(By.id("edit-submit-1")).click();//�������� ������ �����
				
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//td/div/div")));//�������� �������� ��������
				assertEquals(driver.findElement(By.xpath("//td/div/div")).getText(), "����� ��� ������ ������� ������� (�������������� ������).");
			}

}
