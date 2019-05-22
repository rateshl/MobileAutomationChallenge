package com.brabbler.Objects;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationPage {
	
	WebDriver driver;
	
	By drpdownlanguage = By.id("user_country");
	By listlanguage = By.xpath("");
	By iconFolder = By.id("io.selendroid.testapp:id/startUserRegistration");
	By btnList = By.id("io.selendroid.testapp:id/input_preferedProgrammingLanguage");
	
	public RegistrationPage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void clickFolderIcon()
	{
	driver.findElement(iconFolder).click();;
	}
	
	public MobileElement ScrollToElement (WebElement eledropdown, String resourceId)
	{
	return ((AndroidElement) eledropdown).findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("
			+ "new UiSelector().resourceId(\""+resourceId+"\"));");	
	}
}
