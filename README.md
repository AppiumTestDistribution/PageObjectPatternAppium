# PageObjectPatternAppium

To Run the TestNG test

    * mvn clean -Dtest=Runner test
    

To Run the Cucumber test

    * mvn clean -Dtest=RunnerCukes test
    

1.Please make sure you give the absolute path of the apk in the config.properties

2.RUNNER can be set with parallel and distribute(Parallel will run the same test across devices n distribute will split the test across devices)


Once the test run is completed, HTML report will b generated at target/ExtentReport.html

Please refer the AppiumTestDistribution Framework for hacks :: https://github.com/saikrishna321/AppiumTestDistribution
