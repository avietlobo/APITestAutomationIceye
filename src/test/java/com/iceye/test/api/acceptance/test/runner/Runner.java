package com.iceye.test.api.acceptance.test.runner;

import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.Random;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.ExtentProperties;
import com.cucumber.listener.Reporter;
import com.iceye.utils.Utils;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
glue= {"com.iceye.test.api.acceptance.test.stepdefinitions"},
features= {"src/test/resources"},
dryRun = false,
plugin={"com.cucumber.listener.ExtentCucumberFormatter:"})
public class Runner {

	

	
	@BeforeClass
	public static void setup() {
		 Timestamp timestamp = new Timestamp(System.currentTimeMillis());
	     ExtentProperties extentProperties = ExtentProperties.INSTANCE;
	     extentProperties.setReportPath("target/html/ExtentReport"+ timestamp.getTime()+".html");
	}	
	
	
	@AfterClass
	public static void setup2()
	{
	Reporter.loadXMLConfig(new File(System.getProperty("user.dir")+"/Configuration/extent-config.xml"));
    Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
	Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
	Reporter.setSystemInfo("Machine", "Windows 10" + "64 Bit");
	Reporter.setTestRunnerOutput("ICEYE API Test Execution Report");
	}
	
	
}
