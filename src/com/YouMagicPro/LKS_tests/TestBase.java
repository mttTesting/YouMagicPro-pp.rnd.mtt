package com.YouMagicPro.LKS_tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.logging.FileHandler;
import java.util.logging.Formatter;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverBackedSelenium;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import com.thoughtworks.selenium.Selenium;


	public class TestBase { 
		public static ChromeDriver driver;
		public static Wait wait;
	 
		@SuppressWarnings("deprecation")
		@BeforeClass(alwaysRun = true)
		
	    protected void startWebDriver() throws SecurityException, IOException {
			
			System.setProperty("webdriver.chrome.driver", "C:\\workspace\\chromedriver.exe");
	    	driver = new ChromeDriver();
			//WebDriver driver = new FirefoxDriver();
	    	wait = new WebDriverWait(driver, 120);
	    }
	 
	    @AfterClass(alwaysRun = true)
	    protected void closeSession() {
		    driver.quit();
	    }
	 
	    public static void assertEquals(Object actual, Object expected) {
	    	Assert.assertEquals(actual, expected);
	    }
	    public static void assertElementNotPresent(String path) {
	        try {
	            driver.findElement(By.xpath(path));        
	        } catch (NoSuchElementException ex) { 
	        }
	    }
	    
	    public static void waitEmployeePageToLoad()
	    { 	
	    	driver.get("http://account.umagicpro-pp.rnd.mtt/user/login");//открытие портала  	    	
	    	driver.findElement(By.xpath("//a[contains(@href, '/user/login/account')]")).click();
	    	
	    	driver.findElement(By.id("edit-name-1")).sendKeys("0776008257");//ввод логина, пароля
	    	driver.findElement(By.id("edit-pass-1")).sendKeys("1234");
	    	driver.findElement(By.id("edit-submit-1")).click();
	    	
	    	sleep();
	    	wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a.bPopup__eClose.instructions-close")));//ожидание загрузки страницы
	    	driver.findElement(By.cssSelector("a.bPopup__eClose.instructions-close")).click();
	    	sleep();
	    }
	    
	    public static void waitAdminPageToLoad()
	    { 	
	    	driver.get("http://account.umagicpro-pp.rnd.mtt/user/login");//открытие портала  	    	
	    	
	    	driver.findElement(By.id("edit-name-1")).sendKeys("100235");//ввод логина, пароля
	    	driver.findElement(By.id("edit-pass-1")).sendKeys("1234");
	    	driver.findElement(By.id("edit-submit-1")).click();
	    	
	    	sleep();
	    	wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a.bPopup__eClose.instructions-close")));//ожидание загрузки страницы
	    	driver.findElement(By.cssSelector("a.bPopup__eClose.instructions-close")).click();
	    	sleep();
	    	driver.findElement(By.xpath("//td[2]/div/span")).click();
	    }
	    public static void waitAdminPageToLoadSecondAccount()
	    {
	    	driver.get("http://account.umagicpro-pp.rnd.mtt/user/login");//открытие портала  	    	
	 
	
	    	driver.findElement(By.id("edit-name-1")).sendKeys("100236");//ввод логина, пароля
	    	driver.findElement(By.id("edit-pass-1")).sendKeys("1234");
	    	
	    	driver.findElement(By.id("edit-submit-1")).click();

	    	sleep();
	    	wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a.bPopup__eClose.instructions-close")));//ожидание загрузки страницы
	    	sleep();
	    	
	    	driver.findElement(By.xpath("//div[@id='instructionContent']/div/div[4]/a")).click();
	    }
	    
	    
	    public static void  waitContractPageToLoad(){
	    	driver.get("http://account.umagicpro-pp.rnd.mtt/user/login");//открытие портала  	    	
	    	
	    	driver.findElement(By.id("edit-name-1")).sendKeys("100235");//ввод логина, пароля
	    	driver.findElement(By.id("edit-pass-1")).sendKeys("1234");
	    	driver.findElement(By.id("edit-submit-1")).click();
	    	
	    	sleep();
	    	wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a.bPopup__eClose.instructions-close")));//ожидание загрузки страницы
	    	
	    	driver.findElement(By.cssSelector("a.bPopup__eClose.instructions-close")).click();
	    	sleep();
	    	driver.findElement(By.xpath("//td[2]/div/span")).click();
	    	
	    	driver.findElement(By.xpath("//div[5]/div[2]/span/a")).click(); //Нажатие "Оформить"
	    	sleep();
	    	driver.findElement(By.cssSelector("a.bPopup__eClose.instructions-close")).click();
	    	sleep();
	    	driver.findElement(By.xpath("//td[2]/div/span")).click();
	    	
	    	wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.bContent__innerHeader")));//ожидание загрузки страницы

	    }
	    public static void sleep(){
	    	try {
	    		Thread.sleep(8000);
	    	} catch (InterruptedException e) {
	    		e.printStackTrace();
	    	}
	    }
	 
	}
