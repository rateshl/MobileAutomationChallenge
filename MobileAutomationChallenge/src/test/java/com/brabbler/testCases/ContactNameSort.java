package com.brabbler.testCases;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.appium.driversetup.AndroidDriverSetup;
import com.brabbler.uimap.RegistrationPage;

public class ContactNameSort extends AndroidDriverSetup {
	//Evgeniy"s comment - Seperate creation of driver from actual test
	@Test(priority=1)
	public class SortName {
		public void FirstNameComparator() {
			List<String> temp = null,namesort1;
			MobileElement sortfirstnamebtn = (MobileElement) driver.findElementByXPath("xpath of Sort button");
			//sortfirstnamebtn.click();
			//driver.toggle
			List<MobileElement> list = driver.findElementsByXPath("xpath of table cell of name");
			for(MobileElement we:list){
				temp.add(we.getText());
			}
			namesort1=temp;
			System.out.println("After Sorting first Name from Application:"+namesort1);
			Collections.sort(temp,new FamilyNameComparator());
			System.out.println("Actual Sorted:"+temp);
			if(temp.equals(namesort1)){
				System.out.println("Sorted correctly");
			}else{
				System.out.println("Sorting is Wrong");
			}
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