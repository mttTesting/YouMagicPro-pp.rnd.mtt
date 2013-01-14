package com.YouMagicPro.authorization;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.logging.FileHandler;
import java.util.logging.Formatter;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import org.openqa.selenium.By;
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


	public class TestBase { 
		public static ChromeDriver driver;
		public static Wait wait;
	 
		@SuppressWarnings("deprecation")
		@BeforeClass(alwaysRun = true)
		
	    protected void startWebDriver() throws SecurityException, IOException {
			
			System.setProperty("webdriver.chrome.driver", "C:\\GitWorkspace\\chromedriver.exe");
	    	driver = new ChromeDriver();
	    	wait = new WebDriverWait(driver, 120);
	    }
	 
	    @AfterClass(alwaysRun = true)
	    protected void closeSession() {
		    driver.quit();
	    }
	 
	    public static void assertEquals(Object actual, Object expected) {
	    	Assert.assertEquals(actual, expected);
	    }
	  
	    public static void  registration()
	    {
	    	driver.get("http://umagicpro-pp.rnd.mtt/");//�������� �������
	    	
	    	
	    	driver.findElement(By.xpath("//li[4]/a")).click(); //���� �� �����������
	    	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label/span")));
	    	driver.findElement(By.xpath("//label/span")).click();
	    	driver.findElement(By.xpath("//label/input")).click(); //����� ������ �� ������
	    	driver.findElement(By.id("edit-next")).click(); //������� �� ������ �����������
	    	
	    	driver.findElement(By.id("edit-last-name")).sendKeys("�����"); //������� �� ������ �����������
	    	driver.findElement(By.id("edit-first-name")).sendKeys("�����"); //������� �� ������ �����������
	    	driver.findElement(By.id("edit-middle-name")).sendKeys("����������"); //������� �� ������ �����������
	    	driver.findElement(By.id("edit-personal-phone")).sendKeys("234"); //������� �� ������ �����������
	    	
	    	driver.findElement(By.id("confirm-link")).click(); //������� �� ������ ������������� ����
	    	driver.findElement(By.xpath("//div[2]/div/div[2]/input")).sendKeys("1234");
	    	driver.findElement(By.xpath("//td/div/span")).click();
	    	driver.findElement(By.xpath("//div[3]/div/span")).click();
	    	
	    	
	    	driver.switchTo().window("null");
	    	String val = driver.findElement(By.xpath("//div/form/input[2]")).getAttribute("value").toString();
	    	driver.switchTo().window("36508");
	    	driver.findElement(By.id("edit-mail")).sendKeys(val);
	    	driver.findElement(By.id("edit-next")).click();
	    }
	}
