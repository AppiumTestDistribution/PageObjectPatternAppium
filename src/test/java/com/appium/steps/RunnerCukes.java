package com.appium.steps;

import com.appium.manager.ATDRunner;
import org.testng.annotations.Test;


/**
 * Created by saikrisv on 22/04/16.
 */
public class RunnerCukes {
    @Test
    public void testCukesRunner() throws Exception {
        ATDRunner parallelThread = new ATDRunner();
        parallelThread.runner("");
    }
}
