package com.YouMagicPro.LKS_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

public class CityAndYouMagicNumbersTest extends TestBase{
	@Test
	public void cityAndYouMagicNumbersTest_C15009 () throws Exception {	 
		waitEmployeePageToLoad();

		assertEquals(driver.findElement(By.cssSelector("span.bHeader__eTopRight")).getText(), "Номер:+7 (499) 704-53-71, доб. 531, YM.Pro: +88314 (077) 600-82-57  Выйти");
}
}
