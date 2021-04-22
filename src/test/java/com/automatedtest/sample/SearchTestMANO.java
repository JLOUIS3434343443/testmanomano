package com.automatedtest.sample;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/com/automatedtest/sample/SearchMANO.feature"},
        strict = false, plugin = {"pretty",
        "json:target/cucumber_json_reports/searchMANO.json",
        "html:target/search-html2"},
        glue = {"com.automatedtest.sample.infrastructure.driver",
                "com.automatedtest.sample.searchresultpageMANO"})
public class SearchTestMANO {
}
