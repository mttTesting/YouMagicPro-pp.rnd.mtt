package com.YouMagicPro.LKA_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

	public class ContractEndOfPageDataTest  extends TestBase{

    	@Test
    	public void contractEndOfPageDataTest_C15062() {
    		waitContractPageToLoad();
    	//	driver.findElement(By.cssSelector("a.bPopup__eClose.instructions-close")).click();
	    //	driver.findElement(By.xpath("//td[2]/div/span")).click();
    		
    		
    		driver.findElement(By.id("edit-submit")).click();
    		sleep();
    		
    		
    		assertEquals(driver.findElement(By.xpath("//p[3]/span[2]")).getText(), "+7 (985) 729-74-09"); //проверка мобильного номера пользователя
    		assertEquals(driver.findElement(By.xpath("//table[3]/tbody/tr[3]/td/span")).getText(), "74997045371"); 
    		assertEquals(driver.findElement(By.xpath("//table[3]/tbody/tr[4]/td/span")).getText(), "Компьютер"); 
    		assertEquals(driver.findElement(By.xpath("//table[3]/tbody/tr[5]/td/span")).getText(), "Индивидуальная"); 
    		assertEquals(driver.findElement(By.xpath("//table[3]/tbody/tr[6]/td/span")).getText(), "Индивидуальная"); 
    		assertEquals(driver.findElement(By.xpath("//table[3]/tbody/tr[9]/td/span")).getText(), "ОАО «МТТ»"); 
    		assertEquals(driver.findElement(By.xpath("//table[3]/tbody/tr[10]/td/span")).getText(), "Простой"); 
    		assertEquals(driver.findElement(By.xpath("//tr[11]/td/span")).getText(), "Авансовая"); 
    		
    	}
    	

}
