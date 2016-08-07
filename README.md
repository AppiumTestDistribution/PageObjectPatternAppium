# PageObjectPatternAppium

To Run the TestNG test

    * mvn clean -Dtest=Runner test
    

To Run the Cucumber test

    * mvn clean -Dtest=RunnerCukes test
    

1.Please make sure you give the absolute path of the apk in the config.properties

2.RUNNER value in config.properties can be set with parallel or distribute. (Parallel will run the same test cases across devices & distribute will split the test cases randomly across devices)

3.NO need to start appium server externally , framework takes case of starting and shutting down the server for you.

Post Run :

Once the test run is completed, HTML report will b generated at target/ExtentReport.html
Additional Info :

Please refer the AppiumTestDistribution Framework for hacks :: https://github.com/saikrishna321/AppiumTestDistribution