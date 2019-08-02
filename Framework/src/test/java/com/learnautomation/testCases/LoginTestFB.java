package com.learnautomation.testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.learnautomation.pages.BaseCalss;
import com.learnautomation.pages.LoginPage;
import com.learnautomation.pages.LogoutPage;


public class LoginTestFB extends BaseCalss{

	@Test(priority=1)
	public void loginApp() 
	{
		logger=report.createTest("Login to Facebook App");
		LoginPage loginPage=PageFactory.initElements(driver, LoginPage.class);
		logger.info("Starting Applicaton");
		loginPage.loginToFB(excel.getStringData("Login", 0, 0)+"", excel.getStringData("Login", 0, 1));
		logger.pass("Login success");
	}

	@Test(priority=2)
	public void logoutApp() 
	{
		logger=report.createTest("Logout");
		LogoutPage logoutPage=PageFactory.initElements(driver, LogoutPage.class);
		logger.info("trying logout from the applicaion");
		logoutPage.logOut();
		logger.pass("Logout success");
		
	}
}
