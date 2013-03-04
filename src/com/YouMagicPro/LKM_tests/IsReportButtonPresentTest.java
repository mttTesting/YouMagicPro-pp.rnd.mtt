package com.YouMagicPro.LKM_tests;
import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class IsReportButtonPresentTest extends TestBase{
	@Test
	public void isReportButtonPresentTest_C22612() {
		waitManagerPageToLoad();
		
		driver.findElement(By.xpath("//a[contains(text(),'Îò÷¸òû')]")).isDisplayed();
	}
}
