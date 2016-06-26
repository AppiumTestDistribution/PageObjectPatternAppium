package com.appium.steps;

import com.appium.manager.ParallelThread;
import org.junit.Test;

/**
 * Created by saikrisv on 22/04/16.
 */
public class RunnerCukes {
    @Test public void testCukesRunner() throws Exception {
        ParallelThread parallelThread = new ParallelThread();
        parallelThread.runner("");
    }
}
