package com.appium.tests;

import com.appium.manager.ParallelThread;
import org.testng.annotations.Test;

public class Runner {

    @Test public void testRunner() throws Exception {
        ParallelThread parallelThread = new ParallelThread();
        parallelThread.runner("com.appium.tests");
    }

}
