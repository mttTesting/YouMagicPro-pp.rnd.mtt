package com.YouMagicPro.LKM_tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.logging.FileHandler;
import java.util.logging.Formatter;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;


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
	 
	    public static void waitManagerPageToLoad()
	    { 	
	    	driver.get("http://account.umagicpro-pp.rnd.mtt/user/login");//открытие портала
	    
	    	
	    	driver.findElement(By.id("edit-name-1")).sendKeys("mtt-business-test");//ввод логина, пароля
	    	driver.findElement(By.id("edit-pass-1")).sendKeys("123");
	    	driver.findElement(By.id("edit-submit-1")).click();
	    	sleep();
	    }
	   
	    public static void waitAdminPageToLoad()
	    { 	
	    	driver.get("http://account.umagicpro-pp.rnd.mtt/user/login");//открытие портала  	    	
	    	
	    	driver.findElement(By.id("edit-name-1")).sendKeys("100324");//ввод логина, пароля
	    	driver.findElement(By.id("edit-pass-1")).sendKeys("1234");
	    	driver.findElement(By.id("edit-submit-1")).click();
	    	
	    	sleep();
	    	wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a.bPopup__eClose.instructions-close")));//ожидание загрузки страницы
	    	driver.findElement(By.cssSelector("a.bPopup__eClose.instructions-close")).click();
	    	sleep();
	    	driver.findElement(By.xpath("//td[2]/div/span")).click();
	    }
	    
	    public static void waitLKMAdminPageToLoad()
	    { 	
	    	driver.get("http://account.umagicpro-pp.rnd.mtt/user/login");//открытие портала  	    	
	    	
	    	driver.findElement(By.id("edit-name-1")).sendKeys("100468");//ввод логина, пароля
	    	driver.findElement(By.id("edit-pass-1")).sendKeys("123");
	    	driver.findElement(By.id("edit-submit-1")).click();
	    	
	    	sleep();
	    	wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a.bPopup__eClose.instructions-close")));//ожидание загрузки страницы
	    	driver.findElement(By.cssSelector("a.bPopup__eClose.instructions-close")).click();
	    	sleep();
	    	//driver.findElement(By.xpath("//td[2]/div/span")).click();
	    }
	    public static void getInviteAndLogin(){
	    	waitManagerPageToLoad();
			
	    	driver.findElement(By.xpath("//tr[2]/td[7]/a")).click();
	    	driver.findElement(By.xpath("//a[contains(@href, '/logout')]")).click();
	    	waitLKMAdminPageToLoad();
		    sleep();
	    	driver.findElement(By.xpath("//a[contains(text(),'Предоставить доступ')]")).click();
		    sleep();
	    	wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a.bPopup__eClose.instructions-close")));//ожидание загрузки страницы
	    	driver.findElement(By.cssSelector("a.bPopup__eClose.instructions-close")).click();
	    	sleep();
	    	//driver.findElement(By.xpath("//td[2]/div/span")).click();
	    	//sleep();
		    driver.findElement(By.xpath("//span[3]/a")).click();
		    
		    
		    waitManagerPageToLoad();
		    driver.findElement(By.xpath("//tr[2]/td[7]/a")).click();
		    
		    sleep();
	    	wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a.bPopup__eClose.instructions-close")));//ожидание загрузки страницы
	    	driver.findElement(By.cssSelector("a.bPopup__eClose.instructions-close")).click();
	    	sleep();
	    	
	    	assertEquals(driver.findElement(By.xpath("//td[3]/div/div/div/div/div")).getText(), "You are now masquerading as 100468.");
	}
	    
	    
	    public static void sleep(){
	    	try {
	    		Thread.sleep(4000);
	    	} catch (InterruptedException e) {
	    		// TODO Auto-generated catch block
	    		e.printStackTrace();
	    	}
	    }
	}
