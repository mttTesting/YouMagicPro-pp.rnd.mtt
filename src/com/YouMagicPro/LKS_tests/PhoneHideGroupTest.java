	package com.YouMagicPro.LKS_tests;

	import org.testng.AssertJUnit;
	import org.testng.annotations.Test;
	import com.registration.tests.TestBaseReg;


	public class PhoneHideGroupTest extends TestBaseReg{
		@Test
		public void  phoneHideGroupTest_C15333_C15334 () throws Exception {	 
			openAndLoginLKS();
			
			AssertJUnit.assertTrue(selenium.isTextPresent("Тестовый Тест"));//Проверка, есть ли на странице текст "Тестовый Тест"
			
			selenium.click("//div[@id='contacts-block-wrapper']/dl/dt/div");

			
			AssertJUnit.assertFalse(selenium.isTextPresent("Тестовый Тест"));//Проверка, есть ли на странице текст "Тестовый Тест"
			
			selenium.click("//div[@id='contacts-block-wrapper']/dl/dt");
			
			AssertJUnit.assertTrue(selenium.isTextPresent("Тестовый Тест"));//Проверка, есть ли на странице текст "Тестовый Тест"
		}
	}