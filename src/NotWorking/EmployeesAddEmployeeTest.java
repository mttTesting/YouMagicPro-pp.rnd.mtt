package NotWorking;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import com.YouMagicPro.LKA_tests.TestBaseFF;


public class EmployeesAddEmployeeTest extends TestBaseFF{
	@Test
	public void employeesAddEmployeeTest_C15253() {
		waitAdminPageToLoad();
		
		driver.findElement(By.xpath("//div[2]/div/div/div/span/a")).click();//нажимаем "настройки"
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.bContent__innerHeader")));//ожидание загрузки страницы
		
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a.bPopup__eClose.instructions-close")));//ожидание загрузки страницы
    	driver.findElement(By.cssSelector("a.bPopup__eClose.instructions-close")).click();
    	driver.findElement(By.xpath("//td[2]/div/span")).click();
    	
		driver.findElement(By.xpath("//div[2]/a/div")).click();//нажимаем "Сотрудники"
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[3]/a/span")));//ожидание загрузки страницы
		driver.findElement(By.xpath("//td[2]/div/span")).click();
		
		driver.findElement(By.xpath("//div[3]/div/a/span")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='main_enter']/div/div[3]/div[6]/a/span")));
		driver.findElement(By.xpath("//div[@id='main_enter']/div/div[3]/div[6]/a/span")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//form/div/div/div/span")));
		assertEquals(driver.findElement(By.xpath("//form/div/div/div/span")).getText(), "Купить внутренние номера");
		}
}
