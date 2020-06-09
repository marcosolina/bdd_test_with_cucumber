package automationtests;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(strict = true, plugin = {"pretty", "summary", "html:target/cucumber"}, snippets = SnippetType.CAMELCASE)
public class RunCucumberTest {
}
