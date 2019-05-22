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
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.ExecuteMethod;
import org.testng.Assert;
import org.testng.annotations.*;

import com.brabbler.Objects.RegistrationPage;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.MobileElement;

public class ScrollToElement {

	WebDriver driver;

	@BeforeTest
	//public static void main(String[] args) {
	public void initialSetUp() throws InterruptedException{
		//Set the Desired Capabilities
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "My Phone");
		caps.setCapability("udid", "4210fb94d81b6413"); //Give Device ID of your mobile phone
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

	@Test
	public class scrolldown {
		AndroidDriver<MobileElement> driver;
		//AndroidDriver<AndroidElement> driver;
		public scrolldown(AndroidDriver<MobileElement> driver)
		{
			this.driver = driver;
		}

		/*Get the ResourceId of the dropdown object
			  Using appium UiScrollable, scroll to the exact object*/
		public MobileElement ScrollToElement (WebElement eledropdown, String resourceId)
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