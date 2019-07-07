package example.helloworld;

import cucumber.api.CucumberOptions;
import example.TestBase;

@CucumberOptions(features = "classpath:example/helloworld/helloworld.feature")
public class HelloWorldRunner extends TestBase {
    //
}
