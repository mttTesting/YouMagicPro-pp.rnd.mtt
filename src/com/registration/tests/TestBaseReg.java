package com.registration.tests;

import org.testng.annotations.*;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;
 
public class TestBaseReg {

	protected Selenium selenium;

	@Parameters({"browser"})
	@BeforeClass
	public void setUp(@Optional String browser) throws Exception {
		if (browser == null) browser = "*firefox";
		
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
		selenium.open("http://umagicpro-pp.rnd.mtt/"); //Вход на сайт http://umagicpro-pp/
	}
	public void openAndLogin() {
		// TODO Auto-generated method stub
		selenium.open("http://umagicpro-pp.rnd.mtt/"); //Вход на сайт http://umagicpro-pp/
		selenium.click("link=Администратор");
		selenium.waitForPageToLoad("90000");
		selenium.type("id=edit-name-1", "100235"); //ввод логина и пароля
		selenium.type("id=edit-pass-1", "1234");
		selenium.click("id=edit-submit-1"); //нажатие "Вход"
		selenium.waitForPageToLoad("60000");
	}
}
