package co.com.choucair.certificacion.serenity.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src\\test\\resources\\features\\reunion_feature.feature",
        glue = "co.com.choucair.certificacion.serenity.stepdefinitions",
        snippets = SnippetType.CAMELCASE

)


public class reunionRunner {
}
