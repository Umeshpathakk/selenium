package test;

public class DesiredCapablities
{
	
	So we set our DesiredCapabilities as:

		// Created object of DesiredCapabilities class.
		DesiredCapabilities capabilities = new DesiredCapabilities();

		// Set android deviceName desired capability. Set your device name.
		capabilities.setCapability("deviceName", "your Device Name");

		// Set BROWSER_NAME desired capability.
		capabilities.setCapability(CapabilityType.BROWSER_NAME, "Chrome");

		// Set android VERSION desired capability. Set your mobile device's OS version.
		capabilities.setCapability(CapabilityType.VERSION, "5.1");

		// Set android platformName desired capability. It's Android in our case here.
		capabilities.setCapability("platformName", "Android");

		// Set android appPackage desired capability.
		//You need to check for your appPackage Name for your app, you can use this app for that APK INFO

		// Set your application's appPackage if you are using any other app. 
		capabilities.setCapability("appPackage", "com.android.appPackageName");

		// Set android appActivity desired capability. You can use the same app for finding appActivity of your app
		capabilities.setCapability("appActivity", "com.android.calculator2.Calculator");

}
