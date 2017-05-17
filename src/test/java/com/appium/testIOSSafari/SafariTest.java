package com.appium.testIOSSafari;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.ios.IOSDriver;

public class SafariTest {

	@Test
	public void safariTest() throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("automationName", "Appium");
		capabilities.setCapability("platformName", "IOS");
		capabilities.setCapability("platformVersion", "10.2");
		capabilities.setCapability("deviceName", "iPhone Simulator");
		capabilities.setCapability("browserName", "Safari");
		IOSDriver driver = new IOSDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
		Set <String> contextHandles=driver.getContextHandles();
		for (String contextHandl:contextHandles){
			System.out.println(contextHandl);
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://google.com");
		Thread.sleep(4000);
		driver.quit();
	}

}
