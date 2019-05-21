package com.brabbler.Objects;

import org.openqa.selenium.WebElement;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ScrollToElement {
	
	AndroidDriver<MobileElement> driver;
	//AndroidDriver<AndroidElement> driver2;
	public ScrollToElement(AndroidDriver<MobileElement> driver)
	{
		this.driver = driver;
	}
	public MobileElement scrolltoExactElement (MobileElement ele, String str)
	{ 
		return ((AndroidElement) ele).findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("
							+ "new UiSelector().text(\""+str+"\"));");
	}
	
	public MobileElement ScrollToElement (WebElement eledropdown, String resourceId)
	{
	return ((AndroidElement) eledropdown).findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("
			+ "new UiSelector().resourceId(\""+resourceId+"\"));");	
	}
	
	public void ScrollStepWise(MobileElement ele, int step)
	{
		((AndroidElement) ele).findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollForward("+step+"))");
	}
}
