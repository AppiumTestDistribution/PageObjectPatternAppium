package com.appium.config;

import java.io.IOException;

import org.apache.commons.exec.CommandLine;
import org.apache.commons.exec.DefaultExecuteResultHandler;
import org.apache.commons.exec.DefaultExecutor;
import org.apache.commons.exec.ExecuteException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public abstract class AppiumTestBase {
	public static AppiumDriver<MobileElement> driver;

	public AppiumTestBase(AppiumDriver<MobileElement> driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public void loadPage() {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
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

	public static void waitForPageToLoad(WebDriver driver, MobileElement id) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(id));
	}

	public static WebElement waitForElement(WebDriver driver, MobileElement arg) {
		waitForPageToLoad(driver, arg);
		WebElement el = arg;
		return el;
	}
}
