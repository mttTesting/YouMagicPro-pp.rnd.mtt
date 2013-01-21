package com.YouMagicPro.LKA_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class SupportNoTopicWriteTextTest extends TestBase{
	@Test
	public void supportNoTopicWriteTextTest_C19847() {
		waitAdminPageToLoad();
		
		driver.findElement(By.xpath("//span[4]/a")).click();//нажимаем на "Поддержка"
		driver.findElement(By.cssSelector("a.bPopup__eClose.instructions-close")).click();
    	sleep();
    	driver.findElement(By.xpath("//div[@id='umagicproConfirmDialog-d7db61d4eaa86fd123239ffe2246b1db']/div/div[2]/table/tbody/tr/td[2]/div/span")).click();
    	sleep();
    	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//form/div/div/div/div/div")));//ожидание загрузки страницы
    	
    	driver.findElement(By.id("bSupport_MessageText")).sendKeys("11564589132 abcs ,@!.;\\/ ");
    	
		driver.findElement(By.id("edit-contact-send")).click();
		sleep();
		//driver.findElement(By.xpath("//div[@id='umagicproConfirmDialog-d7db61d4eaa86fd123239ffe2246b1db']/div/div[2]/table/tbody/tr/td[2]/div/span")).click();
		
		assertEquals(driver.findElement(By.xpath("//td[3]/div/div/div/div/div")).getText(), "Пожалуйста, выберите тему вопроса");
	}
}