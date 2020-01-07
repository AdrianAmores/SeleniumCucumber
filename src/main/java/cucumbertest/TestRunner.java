package cucumbertest;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import managers.PageObjectManager;
import managers.WebDriverManager;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources"
        ,glue ={"stepDefinition"}
)

public class TestRunner {

    private WebDriverManager webDriverManager;
    private PageObjectManager pageObjectManager;


    public void TestContext(){
        webDriverManager = new WebDriverManager();
        pageObjectManager = new PageObjectManager(webDriverManager.getDriver());
    }

    public WebDriverManager getWebDriverManager() {
        return webDriverManager;
    }

    public PageObjectManager getPageObjectManager() {
        return pageObjectManager;
    }



}
