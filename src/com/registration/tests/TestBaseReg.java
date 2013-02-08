package com.registration.tests;

import org.testng.annotations.*;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;
 
public class TestBaseReg {

	protected Selenium selenium;

	@Parameters({"browser"})
	@BeforeClass
	public void setUp(@Optional String browser) throws Exception {
		if (browser == null) browser = "*googlechrome C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe";
		
		selenium = new DefaultSelenium("localhost", 4444, browser, "http://umagicpro-pp.rnd.mtt/");
		selenium.start();
		//selenium = (LoggingDefaultSelenium) SeleniumHelper.getSelenium(this.getClass().getSimpleName(),
		//"localhost", 4444, browser, "http://umagicpro-pp.rnd.mtt/");
	}


	@AfterClass
	public void tearDown() throws Exception {
		//SeleniumHelper.dismissSelenium(this.getClass().getSimpleName());
		  selenium.stop();
	}

	public void open() {
		// TODO Auto-generated method stub
		selenium.open("http://umagicpro-pp.rnd.mtt/"); //¬ход на сайт http://umagicpro-pp/
	}
	public void openAndLogin() {
		// TODO Auto-generated method stub
		selenium.open("http://umagicpro-pp.rnd.mtt/"); //¬ход на сайт http://umagicpro-pp/
		selenium.click("link=јдминистратор");
		selenium.waitForPageToLoad("90000");
		selenium.type("id=edit-name-1", "100235"); //ввод логина и парол€
		selenium.type("id=edit-pass-1", "1234");
		selenium.click("id=edit-submit-1"); //нажатие "¬ход"
		selenium.waitForPageToLoad("60000");
		
		selenium.click("css=a.bPopup__eClose.instructions-close");//закрытие всплывающих окон
		sleep();
		//selenium.click("css=span.modal_cansel_button_text");
		//sleep();
	}
	
	public void openAndLoginLKS() {
		// TODO Auto-generated method stub
		selenium.open("http://umagicpro-pp.rnd.mtt/"); //¬ход на сайт http://umagicpro-pp/
		selenium.click("link=—отрудник");
		selenium.waitForPageToLoad("60000");
		selenium.type("id=edit-name-1", "0776008257"); //ввод логина и парол€
		selenium.type("id=edit-pass-1", "1234");
		selenium.click("id=edit-submit-1"); //нажатие "¬ход"
		selenium.waitForPageToLoad("60000");
		selenium.click("css=a.bPopup__eClose.instructions-close");//закрытие всплывающих окон
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void sleep()
	{
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
