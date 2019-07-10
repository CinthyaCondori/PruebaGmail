package com.accenture.gmail.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features="src/test/resources/feature/Gmail.feature", 
		glue = {"com.accenture.gmail.steps.definitions"},
		snippets = SnippetType.CAMELCASE,
		monochrome = true,
		dryRun = false,
		plugin = {"json:reportJson/cucumber.json"}
)


public class RunnerGmail {
	

}
