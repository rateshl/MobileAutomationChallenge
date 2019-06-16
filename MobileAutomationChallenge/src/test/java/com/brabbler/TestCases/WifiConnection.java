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
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.ExecuteMethod;
import org.testng.Assert;
import org.testng.annotations.*;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.MobileElement;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.apache.commons.exec.CommandLine;
import org.apache.commons.exec.DefaultExecutor;
import org.apache.commons.exec.ExecuteException;
import org.apache.commons.exec.Executor;
import org.apache.commons.exec.PumpStreamHandler;

import com.appium.driversetup.AndroidDriverSetup;


public class WifiConnection extends AndroidDriverSetup{
			
		
/*
 * I"m not much familiar with this Task. 
 * I tried to research in google and found that i could do this WiFi connection
 * Enable/Disable using adb commands in cmd window 
 * 
 * Using adb shell command i"ll get the information
 * 
 * 1)WifiName - adb shell dumpsys netstats | grep -E 'iface=wlan.*networkId'
 * 2)Enable - adb shell "svc wifi enable" 
 * 3)Disable -  adb shell "svc wifi disable" 
 */
	}
