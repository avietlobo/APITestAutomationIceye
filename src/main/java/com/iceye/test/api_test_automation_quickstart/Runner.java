package com.iceye.test.api_test_automation_quickstart;

import java.io.IOException;

import org.junit.After;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
glue= {"com.iceye.test.api.acceptance.test.stepdefinitions"},
features= {"src/test/resources"},
dryRun = false,
plugin= {"pretty","html:target/site/cucumber-pretty", "json:target/cucumber.json"})
public class Runner {

	
	
	
}
