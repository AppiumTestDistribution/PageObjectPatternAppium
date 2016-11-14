package com.appium.tests;

import com.appium.manager.ParallelThread;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class Runner {

    @Test public void testRunner() throws Exception {
        ParallelThread parallelThread = new ParallelThread();
        List<String> test = new ArrayList<String>();
        /*test.add("MultiLoginTest");
        test.add("AddCommentTest");*/
        parallelThread.runner("com.appium.tests");
    }

}
