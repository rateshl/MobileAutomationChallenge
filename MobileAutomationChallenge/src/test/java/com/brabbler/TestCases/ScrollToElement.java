package com.brabbler.TestCases;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;

import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Connection;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.ExecuteMethod;
import org.testng.Assert;
import org.testng.annotations.*;

import com.appium.driversetup.AndroidDriverSetup;
import com.brabbler.Objects.RegistrationPage;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.MobileElement;

public class ScrollToElement extends AndroidDriverSetup {

//Evgeniy"s comment - Seperate creation of driver from actual test
	@Test (priority=1)
	public class scrolldown {
		AndroidDriver<MobileElement> driver;
		//AndroidDriver<AndroidElement> driver;
		public scrolldown(AndroidDriver<MobileElement> driver)
		{
			this.driver = driver;
		}

		/*Get the ResourceId of the dropdown object
			  Using appium UiScrollable, scroll to the exact object*/
		public MobileElement ScrollToElement (MobileElement eledropdown, String resourceId)
		{
			return ((AndroidElement) eledropdown).findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("
					+ "new UiSelector().resourceId(\""+resourceId+"\"));");	

		}

	}
	
	@AfterTest
	
public void Report() {
		System.out.println("Scrolled to the Object successfully");
		driver.quit();
	
	}
	}