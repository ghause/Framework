package com.learnautomation.testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.learnautomation.pages.BaseCalss;
import com.learnautomation.pages.LoginPage;

public class LoginTest extends BaseCalss{
	@Test
	public void login() throws InterruptedException 
	{
		test=report.createTest("Login to Facebook App");
		LoginPage loginPage=PageFactory.initElements(driver, LoginPage.class);
		test.info("Starting Applicaton");
		loginPage.loginToFB(excel.getStringData("Login", 0, 0)+"", excel.getStringData("Login", 0, 1));
		test.pass("Login success");
		//Assert.assertTrue(1<0);
	}

}
