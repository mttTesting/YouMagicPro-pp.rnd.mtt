package com.YouMagicPro.authorization;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;


public class AuthorizationAdminRememberPasswordTest extends TestBase{
			@Test
			public void authorizationNoPasswordTest_C14712() throws Exception {
				driver.get("http://umagicpro-pp.rnd.mtt/");
				
				driver.findElement(By.xpath("//span")).click();
				driver.switchTo().frame("iframe_autor");

				driver.findElement(By.xpath("//td[2]/a")).click();
				
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span")));//�������� �������� ��������
				assertEquals(driver.findElement(By.xpath("//span")).getText(), "����� �������� ����� ��� ����� e-mail: *");
			}
			
}
