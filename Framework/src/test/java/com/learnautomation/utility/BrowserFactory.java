package com.learnautomation.utility;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BrowserFactory {

	public static WebDriver startApp(WebDriver driver, String browserName, String appURL) throws MalformedURLException, InterruptedException
	
	
	{
		if(browserName.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver84.exe");
			driver=new ChromeDriver();
			
			//Grid setup
//			DesiredCapabilities cap =new DesiredCapabilities();
//			cap.setBrowserName("chrome");
//			cap.setPlatform(Platform.WINDOWS);
//			
//			//chrome option definition
//			
//			ChromeOptions options =new ChromeOptions();
//			options.merge(cap);
//			String hubUrl= "http://192.168.1.5:4444/wd/hub";
//			driver=new RemoteWebDriver(new URL(hubUrl), options);
			 
		}
		else if(browserName.equals("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "./path");
			driver=new FirefoxDriver();
		}
		else if(browserName.equals("IE"))
		{
			System.setProperty("webdriver.ie.driver", "./Drivers/IEDriverServer.exe");
			driver=new InternetExplorerDriver();
		}
		else 
		{
			System.out.println("We dont support this browser");
		}
		//driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(appURL);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return driver;
	}
	
	public static void quitBrowser(WebDriver driver) {
		driver.quit();
		
	}
	
}
