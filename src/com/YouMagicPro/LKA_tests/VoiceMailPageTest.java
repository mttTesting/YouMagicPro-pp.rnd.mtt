package com.YouMagicPro.LKA_tests;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.registration.tests.TestBaseReg;

public class VoiceMailPageTest extends TestBaseReg{
	@Test
	public void voiceMailPageTest() throws Exception {
		openAndLogin();
		
		
		selenium.click("css=a.bPopup__eClose.instructions-close");//закрытие всплывающих окон
		selenium.click("css=span.modal_cansel_button_text");
		//selenium.click("//td[2]/div/span");
		//selenium.click("//div[4]/a");
		selenium.click("//div/span[3]/a");
		selenium.waitForPageToLoad("30000");
		
		selenium.click("//div[3]/a/div");  //Переход в меню "Файлы"->" Голосовая почта "
		Thread.sleep(3000);
		AssertJUnit.assertTrue(selenium.isTextPresent("Голосовая почта"));//Проверка, присутствует ли на странице текст "Голосовая почта"
	}
}