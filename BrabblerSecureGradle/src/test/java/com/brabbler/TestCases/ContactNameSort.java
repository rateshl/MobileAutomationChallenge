package com.brabbler.TestCases;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;

import com.brabbler.Objects.RegistrationPage;
import com.brabbler.Objects.ScrollToElement;

public class ContactNameSort {
	
	AndroidDriver driver;
	
	@BeforeTest
	//public static void main(String[] args) {
	public void SortName() throws InterruptedException{
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
		
		RegistrationPage selectFolderIcon = new RegistrationPage(driver);
		
		selectFolderIcon.clickFolderIcon();
		
		
		
		
		
	}
	
	
	
}
