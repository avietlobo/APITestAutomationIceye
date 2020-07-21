package com.iceye.test.api.acceptance.test.runner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.ExtentProperties;
import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(glue = { "com.iceye.test.api.acceptance.test.stepdefinitions" }, features = {
		"src/test/resources" }, dryRun = false, plugin = { "com.cucumber.listener.ExtentCucumberFormatter:" })
public class Runner {

	@BeforeClass
	public static void setup() {
		// Initializing Extent report

		ExtentProperties extentProperties = ExtentProperties.INSTANCE;
		extentProperties.setReportPath("target/extent/ExtentReport" + ".html");
	}

	@AfterClass
	public static void setup2() {
		// This will load the below details in extent report
		Reporter.loadXMLConfig(new File(System.getProperty("user.dir") + "/Configuration/extent-config.xml"));
		Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
		Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
		Reporter.setSystemInfo("Machine", "Windows 10" + "64 Bit");
		Reporter.setTestRunnerOutput("ICEYE API Test Execution Report");
	}

}
