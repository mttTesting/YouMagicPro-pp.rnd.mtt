package com.YouMagicPro.authorization;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;


public class AuthorizationAdminWrongPasswordTest extends TestBase{
			@Test
			public void authorizationWrongLoginTest_C14711() throws Exception {
				driver.get("http://umagicpro-pp.rnd.mtt/");
				
				driver.findElement(By.xpath("//span")).click();//�������� �� ������ ����
				driver.switchTo().frame("iframe_autor");
				
				driver.findElement(By.id("edit-name-1")).sendKeys("12");//������ �����
				driver.findElement(By.id("edit-pass-1")).sendKeys("1234");//������ ������ 1234
				driver.findElement(By.id("edit-submit-1")).click();//�������� ������ �����
		
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//td/div/div")));//�������� �������� ��������
				assertEquals(driver.findElement(By.xpath("//td/div/div")).getText(), "����� ��� ������ ������� ������� (�������������� ������).");
			}

}
