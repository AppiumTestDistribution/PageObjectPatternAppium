package com.appium.tests;

import org.testng.annotations.Test;

import com.appium.manager.ParallelThread;

public class Runner {
	
	@Test
	public void testRunner() throws Exception{
		ParallelThread parallelThread = new ParallelThread();
		parallelThread.runner("com.appium.tests");
	}

}
