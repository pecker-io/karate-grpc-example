package example.helloworld;

import example.TestBase;
import cucumber.api.CucumberOptions;

@CucumberOptions(features = "classpath:example/helloworld/helloworld-list.feature")
public class HelloWorldListRunner extends TestBase {
    //
}
