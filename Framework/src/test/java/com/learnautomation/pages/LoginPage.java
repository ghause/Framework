package com.learnautomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver ldriver) {
		this.driver=ldriver;
	}
	@FindBy(id="email") WebElement uname;
	@FindBy(id="pass") WebElement passwd;
	@FindBy(id="u_0_a") WebElement loginButton;
	public void loginToFB(String usernameApp, String passwordApplicatio)
	
	{
		uname.sendKeys(usernameApp);
		passwd.sendKeys(passwordApplicatio);
		loginButton.click();
		
	}

}
