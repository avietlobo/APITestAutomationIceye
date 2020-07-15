package com.iceye.test.api_test_automation_quickstart;


import cucumber.api.cli.Main;


/**
 * Hello world!
 *
 */
public class App2 
{
	//hello 3
	public static final String test="src/test/resources/Features/SBDBCloseApproachDataAPI.feature";
	public static final String test1="src/test/resources/Features/SBDBCloseApproachDataAPI.feature";

	    public static void main(String[] args) throws Throwable {
	    	
            //Main.main(new String[]{"-g", "com/iceye/test/api/acceptance/test/stepdefinitions/stepDefination", "src/test/resources/Features/SBDBCloseApproachDataAPI.feature"});

            Main.main(new String[]{"-g", "com/iceye/test/api_test_automation_quickstart", "src/main/java/com/iceye/test/api_test_automation_quickstart/SBDBCloseApproachDataAPI.feature"});
            //Main.main(new String[]{"-g", "com/iceye/test/api_test_automation_quickstart", "com/iceye/test/api_test_automation_quickstart/SBDBCloseApproachDataAPI.feature"});

	       	    }
}

