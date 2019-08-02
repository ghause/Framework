package com.learnautomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver ldriver) {
		this.driver=ldriver;
	}
	@FindBy(id="lid") WebElement uname;
	@FindBy(id="pwd") WebElement passwd;
	@FindBy(id="signin_submit") WebElement loginButton;
	public void loginToFB(String usernameApp, String passwordApplicatio) 
	
	{
		try
		{
			Thread.sleep(2000);
			uname.sendKeys(usernameApp);
			Thread.sleep(2000);
			passwd.sendKeys(passwordApplicatio);
			loginButton.click();
		}
		catch(Exception e){
			System.out.println("login failed");
			
		}
		
	}

}
