package com.appium.driversetup;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

public class AndroidDriverSetup {
	public AndroidDriver driver;
	
	
	@BeforeTest
	//public static void main(String[] args) {
	public void initialSetUp() throws InterruptedException{
		//Set the Desired Capabilities
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "My Phone");
		caps.setCapability("udid", "XXXXXXXXX"); //Give Device ID of your mobile phone
		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", "8.0.0");
		caps.setCapability("appPackage", "com.android.settings");
		caps.setCapability("appActivity", ".wifi.WifiSettings");
		caps.setCapability("noReset", true);
		//Set ChromeDriver location
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sss\\Desktop\\Mobile Automation\\Softwares\\chromedriver.exe");
		
		//Instantiate Appium Driver
		AppiumDriver<MobileElement> driver = null;
		try {
			driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
			
		} catch (MalformedURLException e) {
			System.out.println(e.getMessage());
		}
	}
}
	
