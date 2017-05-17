package com.appium.testIOSSafari;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;

import io.appium.java_client.MobileBy;
import io.appium.java_client.ios.IOSDriver;


public class IOSSwitches {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("automationName", "Appium");
		capabilities.setCapability("platformName", System.getProperty("platformName"));
		capabilities.setCapability("platformVersion", System.getProperty("platformVersion"));
		capabilities.setCapability("deviceName", "iPhone Simulator");
		capabilities.setCapability("app", "//Users//pritamsur//Library//Developer//Xcode//DerivedData//UIKitCatalog-dtjxycwtldffllapniniwspstlkh//Build//Products//Debug-iphonesimulator//UIKitCatalog.app");
		capabilities.setCapability("bundleId", "com.example.apple-samplecode.UIKitCatalog");
		IOSDriver driver = new IOSDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
		Thread.sleep(5000);
		driver.findElement(By.name("Back")).click();
		WebElement el = driver.findElement(By.name("Web View"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		HashMap<String, String> scrollObject = new HashMap<String, String>();
		scrollObject.put("direction", "down");
		scrollObject.put("element", ((RemoteWebElement) el).getId());
		js.executeScript("mobile:scroll", scrollObject);
		driver.findElement(By.name("Web View")).click();
		Thread.sleep(2000);
		if (driver.findElement(By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeSwitch[1]")).getAttribute("value").equals("true")){
			driver.findElement(By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeSwitch[1]")).click();
				
		}
		else{
			System.out.println(driver.findElement(By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeSwitch[1]")).getAttribute("value"));
		}
			
	}

}
