package com.learnautomation.testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.learnautomation.pages.BaseCalss;
import com.learnautomation.pages.LoginPage;
import com.learnautomation.pages.LogoutPage;


public class LoginLogoutTest extends BaseCalss{

	@Test()
	public void loginApp() throws InterruptedException 
	{
		test=report.createTest("Login to Facebook App");
		LoginPage loginPage=PageFactory.initElements(driver, LoginPage.class);
		test.info("Starting Applicaton");
		loginPage.loginToFB(excel.getStringData("Login", 0, 0)+"", excel.getStringData("Login", 0, 1));
		test.pass("Login success");
		
	}

	@Test()
	public void logoutApp() 
	{
		test=report.createTest("Logout");
		LogoutPage logoutPage=PageFactory.initElements(driver, LogoutPage.class);
		test.info("trying logout from the applicaion");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		logoutPage.logOut();
		test.pass("Logout success");
		
	}
}
