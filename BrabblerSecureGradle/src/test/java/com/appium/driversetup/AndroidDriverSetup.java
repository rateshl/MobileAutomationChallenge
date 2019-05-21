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

	AndroidDriver driver;

	public  AndroidDriverSetup(AndroidDriver driver) throws InterruptedException{
		this.driver=driver;
	}
	public void driversetup(String deviceName, String udid, String platformName, String platformVersion,
			String appPackage, String appActivity){

		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", deviceName);
		caps.setCapability("udid", udid); //Give Device ID of your mobile phone
		caps.setCapability("platformName", platformName);
		caps.setCapability("platformVersion", platformVersion);
		caps.setCapability("appPackage", appPackage);
		caps.setCapability("appActivity", appActivity);
		caps.setCapability("noReset", true);
		//Instantiate Appium Driver
		AppiumDriver<MobileElement> driver = null;
		try {
			driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);

		} catch (MalformedURLException e) {
			System.out.println(e.getMessage());
		}
	}
}
