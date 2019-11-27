package com.learnautomation.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogoutPage {
//	WebDriver driver;
//	public LogoutPage(WebDriver ldiver) {
//		this.driver=ldiver;
//	}
		
	@FindBy(xpath="//a[@href='./?_task=logout']") WebElement signOut;
	@FindBy(xpath="//a[@href='./?_task=mail&_mbox=INBOX']") WebElement mailIcon;
	@FindBy(id="rcmbtn101") WebElement emailButton;
	public void logOut() { 
		try
		{
			mailIcon.click();
			emailButton.click();
			Thread.sleep(2000);
			signOut.click();
			
		} 
		catch (Exception e) 
		{
			System.out.println("login failed");
		}
		
	}

}
