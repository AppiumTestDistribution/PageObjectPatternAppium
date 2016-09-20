package com.appium.config;

import com.appium.manager.AppiumParallelTest;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.json.simple.JSONObject;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;
import java.lang.reflect.Method;
import java.net.URISyntaxException;

public class UserBaseTest extends AppiumParallelTest {

    JSonParser jSonParser = new JSonParser();

    @BeforeMethod(alwaysRun = true) public void startApp(Method name) throws Exception {
        driver = startAppiumServerInParallel(name.getName());
        startLogResults(name.getName());
    }

    @AfterMethod(alwaysRun = true) public void killServer(ITestResult result)
        throws InterruptedException, IOException, URISyntaxException {
        endLogTestResults(result);
        getDriver().quit();
    }

    public AppiumDriver<MobileElement> getDriver() {
        return driver;
    }

    @BeforeClass() public void beforeClass() throws Exception {
        //startAppiumServer(getClass().getSimpleName());
    }

    @AfterClass() public void afterClass() throws InterruptedException, IOException {
        //killAppiumServer();
    }

    public String getUserName() {
        String[] crds = Thread.currentThread().getName().toString().split("_");
        System.out.println(crds[1]);
        JSONObject user = jSonParser.getUserData(Integer.parseInt(crds[1]));
        return user.get("userName").toString();
    }

    public String getPassword() {
        String[] crds = Thread.currentThread().getName().toString().split("_");
        JSONObject user = jSonParser.getUserData(Integer.parseInt(crds[1]));
        return user.get("password").toString();
    }

}
