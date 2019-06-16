package com.brabbler.Objects;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import org.openqa.selenium.By;

public class RegistrationPage {
	
	AndroidDriver<MobileElement> driver;
	public void FirstNameComparator(AndroidDriver<MobileElement> driver)
	{
		this.driver = driver;
	}
	
	By drpdownlanguage = By.id("user_country");
	By listlanguage = By.xpath("");
	By iconFolder = By.id("io.selendroid.testapp:id/startUserRegistration");
	By btnList = By.id("io.selendroid.testapp:id/input_preferedProgrammingLanguage");
	
	public RegistrationPage(MobileDriver<MobileElement> driver)
	{
		this.driver=(AndroidDriver<MobileElement>) driver;
	}
	public void clickFolderIcon()
	{
	driver.findElement(iconFolder).click();;
	}
	
	public MobileElement ScrollToElement (MobileElement eledropdown, String resourceId)
	{
	return ((AndroidElement) eledropdown).findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("
			+ "new UiSelector().resourceId(\""+resourceId+"\"));");	
	}
}
