package cucumberjava;

import org.junit.runner.RunWith; 
import cucumber.junit.Cucumber; 

@RunWith(Cucumber.class) 
@Cucumber.Options(features={"E:\MindQSelenium\Gmail\src\test\resources\feature2.feature"},format = {"pretty", "html:target/cucumber"},monochrome=true) 

public class Run_Test { }