package com.appium.config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

import org.apache.commons.exec.CommandLine;
import org.apache.commons.exec.DefaultExecuteResultHandler;
import org.apache.commons.exec.DefaultExecutor;
import org.apache.commons.exec.ExecuteException;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class AppiumTestBase {
	public static AppiumDriver<MobileElement> driver;

	public static Properties prop = new Properties();
	InputStream input = null;
	
	@BeforeMethod
	public void setUp() throws IOException {
		input = new FileInputStream("property/android.properties");
		prop.load(input);
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "9111833b");
		caps.setCapability("platformVersion", "5.0.2");
		caps.setCapability("app", System.getProperty("user.dir") + "/build/wordpress.apk");
		caps.setCapability("package", "org.wordpress.android");
		caps.setCapability("appActivity", "org.wordpress.android.ui.WPLaunchActivity");
		driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	public void setUpServer() throws ExecuteException, IOException, InterruptedException {
		CommandLine command = new CommandLine("/Applications/Appium.app/Contents/Resources/node/bin/node");
		command.addArgument("/Applications/Appium.app/Contents/Resources/node_modules/appium/bin/appium.js", false);
		command.addArgument("--address", false);
		command.addArgument("127.0.0.1");
		command.addArgument("--port", false);
		command.addArgument("4723");
		command.addArgument("--full-reset", false);
		DefaultExecuteResultHandler resultHandler = new DefaultExecuteResultHandler();
		DefaultExecutor executor = new DefaultExecutor();
		executor.setExitValue(1);
		executor.execute(command, resultHandler);

		Thread.sleep(5000);
		System.out.println("Appium server started");

	}

	public void tearDownServer() throws IOException {
		String[] command = { "/usr/bin/killall", "-KILL", "node" };
		Runtime.getRuntime().exec(command);
		System.out.println("Appium server stop");
	}
}
