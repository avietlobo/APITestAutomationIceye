package com.iceye.test.api_test_automation_quickstart;


import cucumber.api.cli.Main;


/**
 * Hello world!
 *
 */
public class App2 
{
	//hello 3
	 
	    public static void main(String[] args) throws Throwable {
	    	
            Main.main(new String[]{"-g", "com/iceye/test/api/acceptance/test/stepdefinitions/stepDefination", "src/test/resources/Features/SBDBCloseApproachDataAPI.feature"});

	    	
	       	    }
}

