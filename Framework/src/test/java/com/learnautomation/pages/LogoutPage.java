package com.learnautomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogoutPage {
	WebDriver driver;
//	public LogoutPage(WebDriver ldiver) {
//		this.driver=ldiver;
//	}
		
	
	@FindBy(id="ztb-profile-image") WebElement logOutIcon;
	@FindBy(id="ztb-signout") WebElement signOutBtn;
	public void logOut() { 
		logOutIcon.click();
		signOutBtn.click();
		
	}

}
