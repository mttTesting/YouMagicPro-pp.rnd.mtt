package com.YouMagicPro.LKA_tests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;

public class FeedbackPageTest extends TestBaseReg{
	@Test
	public void feedbackPageTest() throws Exception {
		openAndLogin();
		selenium.click("css=a.bPopup__eClose.instructions-close");//закрытие всплывающих окон
		selenium.click("css=span.modal_cansel_button_text");
		selenium.click("//div[4]/a"); //Переход в меню "Поддержка"->"Обратная связь"
		selenium.click("//span[4]/a");
		selenium.waitForPageToLoad("30000");
		Thread.sleep(3000);
		AssertJUnit.assertTrue(selenium.isTextPresent("Поддержка")); //Проверка, присутствует ли на странице текст "Поддержка"
	}
}