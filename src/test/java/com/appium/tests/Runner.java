package com.appium.tests;

import com.appium.manager.ATDRunner;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

    public class Runner {

        @Test public void testRunner() throws Exception {
            ATDRunner parallelThread = new ATDRunner();
            List<String> test = new ArrayList<String>();
            test.add("LoginTest");
            boolean runner = parallelThread.runner("com.appium.tests", test);
            System.out.println(runner);
            Assert.assertFalse(runner);
        }

}
