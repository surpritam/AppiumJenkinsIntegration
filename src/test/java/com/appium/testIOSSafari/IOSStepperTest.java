package com.appium.testIOSSafari;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;

public class IOSStepperTest {

	@Test
	public void stepperTest() throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("automationName", "Appium");
		capabilities.setCapability("platformName", "IOS");
		capabilities.setCapability("platformVersion", "10.3");
		capabilities.setCapability("deviceName", "iPhone Simulator");
		capabilities.setCapability("app", "//Users//pritamsur//Library//Developer//Xcode//DerivedData//UIKitCatalog-dtjxycwtldffllapniniwspstlkh//Build//Products//Debug-iphonesimulator//UIKitCatalog.app");
		capabilities.setCapability("bundleId", "com.example.apple-samplecode.UIKitCatalog");
		IOSDriver driver = new IOSDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
		
		Thread.sleep(5000);
		driver.findElement(By.name("Back")).click();
		/*WebElement element = driver.findElement(By.name("Web View"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		HashMap<String, String> scrollObjects =new HashMap<String, String>();
		scrollObjects.put("element", ((RemoteWebElement) element).getId());
		js.executeScript("mobile:scroll", scrollObjects,"d");*/
		
		driver.findElement(By.name("Steppers")).click();
		
		//driver.findElement(By.name("Increment")).click();
		while(!((WebElement) driver.findElements(By.className("XCUIElementTypeStaticText")).get(1)).getAttribute("value").equals("5")){
			driver.findElement(By.name("Increment")).click();
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		}
		
	}


}
