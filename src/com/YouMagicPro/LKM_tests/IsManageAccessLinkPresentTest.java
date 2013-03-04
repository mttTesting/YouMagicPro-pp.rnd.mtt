package com.YouMagicPro.LKM_tests;
import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class IsManageAccessLinkPresentTest extends TestBase{
	@Test
	public void isManageAccessLinkPresentTest_C22606() {
		waitManagerPageToLoad();
		
		driver.findElement(By.xpath("//td[7]/a")).isDisplayed();
		driver.findElement(By.xpath("//tr[2]/td[7]/a")).isDisplayed();
	}
}
