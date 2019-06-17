package com.brabbler.uimap;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import org.openqa.selenium.By;

public class RegistrationPage {
	//Evgeniy"s comment - Use MobileElement instead of By.
	AndroidDriver<MobileElement> driver;
	public void FirstNameComparator(AndroidDriver<MobileElement> driver)
	{
		this.driver = driver;
	}

	MobileElement drpdownlanguage = (MobileElement) driver.findElementById("user_country");
	MobileElement listlanguage = (MobileElement) driver.findElementByXPath("");
	MobileElement iconFolder = (MobileElement) driver.findElementById("startUserRegistration");
	MobileElement btnList = (MobileElement) driver.findElementById("input_preferedProgrammingLanguage");

	public RegistrationPage(MobileDriver<MobileElement> driver)
	{
		this.driver=(AndroidDriver<MobileElement>) driver;
	}
	public void clickFolderIcon()
	{
		iconFolder.click();;
	}
	public MobileElement ScrollToElement (MobileElement eledropdown, String resourceId)
	{
		return ((AndroidElement) eledropdown).findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("
				+ "new UiSelector().resourceId(\""+resourceId+"\"));");	
	}
}