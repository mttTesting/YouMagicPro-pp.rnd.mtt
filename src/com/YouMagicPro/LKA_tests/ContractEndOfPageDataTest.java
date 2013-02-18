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

    		assertEquals(driver.findElement(By.xpath("//div[@id='account-charges']/div[2]/div/table[2]/tbody/tr[3]/td[2]/span")).getText(), "Мухин Вадим Николаевич"); //проверка мобильного номера пользователя
    		assertEquals(driver.findElement(By.xpath("//div[@id='account-charges']/div[2]/div/table[2]/tbody/tr[3]/td[2]/span[2]")).getText(), "+7 (985) 729-74-09"); //проверка номера аккаунта YM.Pro 
    		assertEquals(driver.findElement(By.xpath("//div[@id='account-charges']/div[2]/div/table[2]/tbody/tr[3]/td[2]/span[3]")).getText(), "b915966@rmqkr.net");//Тип абонентского устройства
    	}
    	

}
