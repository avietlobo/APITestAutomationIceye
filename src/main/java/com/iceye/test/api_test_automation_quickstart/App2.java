package com.iceye.test.api_test_automation_quickstart;

import java.util.stream.Stream;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

import cucumber.api.cli.Main;


/**
 * Hello world!
 *
 */
public class App2 
{
	
	 
	    public static void main(String[] args) throws Throwable {
	    	
            Main.main(new String[]{"-g", "com/iceye/test/api/acceptance/test/stepdefinitions/stepDefination", "src/resources/Features/SBDBCloseApproachDataAPI.feature"});

	    	
	       	    }
}

