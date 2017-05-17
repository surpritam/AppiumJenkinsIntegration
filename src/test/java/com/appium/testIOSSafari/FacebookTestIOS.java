package com.appium.testIOSSafari;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.ios.IOSDriver;

public class FacebookTestIOS {

	@Test
	public void fbTestIOS() throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("automationName", "Appium");
		capabilities.setCapability("platformName", "IOS");
		capabilities.setCapability("platformVersion", "10.2");
		capabilities.setCapability("deviceName", "iPhone Simulator");
		capabilities.setCapability("app", "//Users//pritamsur//Library//Developer//Xcode//DerivedData//UIKitCatalog-dtjxycwtldffllapniniwspstlkh//Build//Products//Debug-iphonesimulator//UIKitCatalog.app");
		capabilities.setCapability("bundleId", "com.example.apple-samplecode.UIKitCatalog");
		IOSDriver driver = new IOSDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
		Thread.sleep(5000);
	}

}
