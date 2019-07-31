package com.learnautomation.utility;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Helper {
	//screenShot, alert, frame, windows, sync issue, java script executer
	
	public static String captureScreenShot(WebDriver driver)
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String screenshotPath=System.getProperty("user.dir")+"/Screenshots/FB"+getCurrentDateTime()+".png";
		try {
			FileHandler.copy(src, new File(screenshotPath));
			System.out.println("Screenshot has taken successfully");
		} catch (Exception e) {
			System.out.println("unabale to capture Screenshot"+e.getMessage());
		}
		
		return screenshotPath;
	}
	
	public static String getCurrentDateTime()
	{
		DateFormat customFormat=new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");
		Date curretDate=new Date();
		return customFormat.format(curretDate);
	}

}
