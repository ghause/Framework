package com.learnautomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
//	WebDriver driver;
//	public LoginPage(WebDriver ldriver) {
//		this.driver=ldriver;
//	}
	
	@FindBy(xpath="//tbody[tr[td[input[@type='checkbox']]]]/tr/td/input[@name='login_username']") WebElement uname;
	@FindBy(xpath="//tbody[tr[td[input[@type='checkbox']]]]/tr/td/input[@name='secretkey']") WebElement passwd;
	@FindBy(xpath="//tbody[tr[td[input[@type='checkbox']]]]/tr/td/input[@value='Login >>']") WebElement loginButton;
	
	
	public void loginToFB(String usernameApp, String passwordApplication) throws InterruptedException 
	
	{
		try
		{
			Thread.sleep(2000);
			uname.sendKeys(usernameApp);
			Thread.sleep(2000);
			passwd.sendKeys(passwordApplication);
			loginButton.click();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			System.out.println("login failed");
			Thread.sleep(2000);
			
		}
		
		
		
	}

}
