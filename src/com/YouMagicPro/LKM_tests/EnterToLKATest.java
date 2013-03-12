package com.YouMagicPro.LKM_tests;
import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class EnterToLKATest extends TestBase{
	@Test
	public void EnterToLKATest_C26771_C26772_C26773() {
		getInviteAndLogin();//входим на аккаунт менеджера, запрашиваем инвайт, выходим, заходим на аккаунт данного клиента, подтверждаем инвайт, выходим, заходим в аккаунт менеджера и проходим по ссылке входа на аккаунт клиента из ЛКМ

	}
}
