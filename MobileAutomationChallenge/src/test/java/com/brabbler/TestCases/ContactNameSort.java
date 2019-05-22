package com.brabbler.TestCases;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.brabbler.Objects.RegistrationPage;
import com.brabbler.Objects.ScrollToElement;

public class ContactNameSort {

	AndroidDriver driver;

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
	public class SortName {
		AndroidDriver<MobileElement> driver;
		public void FirstNameComparator(AndroidDriver<MobileElement> driver)
		{
			this.driver = driver;
		}
		
		List<String> temp,namesort1;
		MobileElement sortfirstnamebtn = driver.findElement(By.xpath("xpath of Sort button"));
		//sortfirstnamebtn.click();
		//driver.toggle

		List<MobileElement> list = driver.findElements(By.xpath("xpath of table cell of name"));
		for(WebElement we:list){
			temp.add(we.getText());
		}
		namesort1=temp;
		System.out.println("After Sorting first Name from Application:"+namesort1);
		Collections.sort(temp,new NameComparator());
		System.out.println("Actual Sorted:"+temp);
		if(temp.equals(namesort1)){
			System.out.println("Sorted correctly");
		}else{
			System.out.println("Sorting is Wrong");
		}
	}
	public static class FamilyNameComparator implements Comparator<String> {

		public int compare(String name1, String name2) {
			return name1.split(" ")[1].compareTo(name2.split(" ")[1]);
		}
	}

	@AfterTest

	public void Report() {
		System.out.println("Sorting Action is successfully completed");
		driver.quit();

	}
}
}