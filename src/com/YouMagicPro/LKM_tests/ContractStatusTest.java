package com.YouMagicPro.LKM_tests;
import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class ContractStatusTest extends TestBase{
	@Test
	public void contractStatusTest_C22636() {
		waitManagerPageToLoad();
	
		driver.findElement(By.xpath("//a[contains(text(),'������� �������')]")).click();
		sleep();
		driver.findElement(By.xpath("(//a[contains(text(),'������� �������')])[2]")).click();
		sleep();
		
		assertEquals(driver.findElement(By.xpath("//tr[2]/td[2]/span")).getText(), "������� ����������");
		assertEquals(driver.findElement(By.xpath("//tr[2]/td[2]/div/fieldset/div/div/table/tbody/tr[2]/td[2]/span")).getText(), "��������");
		
	}
}
